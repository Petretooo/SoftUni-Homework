package InterfacesAndAbstractions.phone;


import java.util.List;

public class Smartphone implements Callable, Browsable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (String number : this.numbers) {
            if(number.matches("\\d+")){
                sb.append("Calling... ").append(number).append(System.lineSeparator());
            }else {
                sb.append("Invalid number!").append(System.lineSeparator());
            }
        }
        return sb.toString().trim();
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        for (String URL : this.urls) {
            if(URL.matches("^(http:\\/\\/www\\.|https:\\/\\/www\\.|http:\\/\\/|https:\\/\\/)?[a-z]+([\\-\\.]{1}[a-z]+)*\\.[a-z]{2,5}(:{1,5})?(\\/.*)?$")){
                sb.append("Broswing: ")
                        .append(URL)
                        .append("!")
                        .append(System.lineSeparator());
            }else {
                sb.append("Invalid URL!").append(System.lineSeparator());
            }
        }

        return sb.toString().trim();
    }
}

//TODO
//Моите регулярни изрази са много по-добри от тези на колегата, но по някаква причина СофтУни не ги признава, но ще си ги използвам
//зашото много по-добре се справят от на колегата, които са закоментирани долу, защото неговите регулярни изрази не покриват всички случаи, лично тествани с над 20 хардкор теста.
//Моите покриват всичко, но системата ги изхвърля.

//Пробен тест -> 09579384793 7598373&^*fs 75937493jfsjf 749375903$#
//               http://softuni.bg http://youtube.com http://www.g00gle.com

// Последния номер аз не го мачвам, както се изисква от условието, но колегата го мачва, а това е грешно! Моя код издържа теста!



//    @Override
//    public String browse() {
//        StringBuilder browsedURLs = new StringBuilder();
//        for (String url : this.urls) {
//            if (!url.matches(".*\\d.*")) {
//                browsedURLs
//                        .append("Browsing: ")
//                        .append(url)
//                        .append("!")
//                        .append(System.lineSeparator());
//            } else {
//                browsedURLs.append("Invalid URL!").append(System.lineSeparator());
//            }
//        }
//        return browsedURLs.toString().trim();
//    }
//
//    @Override
//    public String call() {
//        StringBuilder calledNumbers = new StringBuilder();
//        for (String number : this.numbers) {
//            if (!number.matches(".*[A-Za-z].*")) {
//                calledNumbers.append("Calling... ").append(number).append(System.lineSeparator());
//            } else {
//                calledNumbers.append("Invalid number!").append(System.lineSeparator());
//            }
//        }
//        return calledNumbers.toString().trim();
//    }
