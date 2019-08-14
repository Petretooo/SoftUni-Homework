import java.util.Scanner;

public class ifelse11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String flower = in.nextLine();
        int number = Integer.parseInt(in.nextLine());
        int budget = Integer.parseInt(in.nextLine());

        double roses = 5;
        double dahlia = 3.80;
        double tulips = 2.8;
        double narcissus = 3;
        double gladiolus = 2.5;

        double price = 0;
        double difference = 0;
        double procent = 0;
        if (flower.equalsIgnoreCase("roseS")) {
            price = number * roses;
            procent = price - (price * 0.1);
            if (number > 80) {
                difference = Math.abs(procent - budget);
                if (budget < price) {
                    System.out.printf("Not enough money, you need %.2f leva more.", difference);
                } else {
                    System.out.printf("Hey, you have a great garden with %d Roses and %.2f leva left.", number, difference);
                }
            } else {
                difference = Math.abs(budget - price);
                if (budget < price) {
                    System.out.printf("Not enough money, you need %.2f leva more.", difference);
                } else {
                    System.out.printf("Hey, you have a great garden with %d Roses and %.2f leva left.", number, difference);
                }
            }
        } else if (flower.equalsIgnoreCase("dahlias")) {
            price = number * dahlia;
            procent = price - (price * 0.15);
            if (number > 90) {
                difference = Math.abs(procent - budget);
                if (budget < price) {
                    System.out.printf("Not enough money, you need %.2f leva more.", difference);
                } else {
                    System.out.printf("Hey, you have a great garden with %d Dahlias and %.2f leva left.", number, difference);
                }
            } else {
                difference = Math.abs(budget - price);
                if (budget < price) {
                    System.out.printf("Not enough money, you need %.2f leva more.", difference);
                } else {
                    System.out.printf("Hey, you have a great garden with %d Dahlias and %.2f leva left.", number, difference);
                }
            }
        } else if (flower.equalsIgnoreCase("tulips")) {
            price = number * tulips;
            procent = price - (price * 0.15);
            if (number > 80) {
                difference = Math.abs(procent - budget);
                if (budget < price) {
                    System.out.printf("Not enough money, you need %.2f leva more.", difference);
                } else {
                    System.out.printf("Hey, you have a great garden with %d Tulips and %.2f leva left.", number, difference);
                }
            } else {
                difference = Math.abs(budget - price);
                if (budget < price) {
                    System.out.printf("Not enough money, you need %.2f leva more.", difference);
                } else {
                    System.out.printf("Hey, you have a great garden with %d Tulips and %.2f leva left.", number, difference);
                }
            }
        } else if (flower.equalsIgnoreCase("narcissus")) {
            price = number * narcissus;
            procent = price + (price * 0.15);
            if (number < 120) {
                difference = Math.abs(procent - budget);
                if (budget >= procent) {
                    System.out.printf("Hey, you have a great garden with %d Narcissus and %.2f leva left.", number, difference);
                } else {
                    System.out.printf("Not enough money, you need %.2f leva more.", difference);

                }
            } else {
                difference = Math.abs(budget - price);
                if (budget >= price) {
                    System.out.printf("Hey, you have a great garden with %d Narcissus and %.2f leva left.", number, difference);
                } else {
                    System.out.printf("Not enough money, you need %.2f leva more.", difference);
                }
            }
        } else if (flower.equalsIgnoreCase("gladiolus")) {
            price = number * gladiolus;
            procent = price + (price * 0.2);
            if (number < 80) {
                difference = Math.abs(procent - budget);
                if (budget >= procent) {
                    System.out.printf("Hey, you have a great garden with %d Gladiolus and %.2f leva left.", number, difference);

                } else {
                    System.out.printf("Not enough money, you need %.2f leva more.", difference);
                }
            } else {
                difference = Math.abs(budget - price);
                if (budget < price) {
                    System.out.printf("Not enough money, you need %.2f leva more.", difference);
                } else {
                    System.out.printf("Hey, you have a great garden with %d Gladiolus and %.2f leva left.", number, difference);
                }
            }
        }
    }
}


/*Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
 Ако Нели купи повече от 90 Далии - 15% отстъпка от крайната цена
 Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
 Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
 Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%
От конзолата се четат 3 реда:
 Вид цветя - текст с възможности - &quot;Roses&quot;, &quot;Dahlias&quot;, &quot;Tulips&quot;, &quot;Narcissus&quot;, &quot;Gladiolus&quot;*/


/*Роза Далия Лале Нарцис Гладиола
Цена на брой в лева 5 3.80 2.80 3 2.50*/