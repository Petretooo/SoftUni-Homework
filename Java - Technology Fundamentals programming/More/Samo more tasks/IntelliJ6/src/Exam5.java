import java.util.Scanner;

public class Exam5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = Integer.parseInt(in.nextLine());
        int secondNumber = number;
        String number1 = Integer.toString(number);

        int lastDigit, newNumber;
        int firstDigit = 0, secondDigit = 0, thirdDigit = 0;

 /*       for(int i = 0 ; i < number1.length() ; i++) {
             lastDigit = number % 10;
             newNumber = (number - lastDigit)/10;
             number = newNumber;

             if(i == 0){
                 firstDigit = lastDigit;
             }else if(i == 1){
                 secondDigit = lastDigit;
             }else if(i == 2){
                 thirdDigit = lastDigit;
             }
        }
*/
        for (int i = 1; i <= Integer.parseInt(number1.substring(0, 1)); i++) {
            for (int j = 1; j <= Integer.parseInt(number1.substring(1, 2)); j++) {
                for (int k = 1; k <= Integer.parseInt(number1.substring(2, 3)); k++) {
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, (i * j * k));
                }
            }
        }

/*
        if(secondNumber >= 111 && secondNumber <= 999){
            for(int i = 1 ; i <= firstDigit ; i++){
                for(int j = 1 ; j <= secondDigit ; j++){
                    for(int k = 1 ; k <= thirdDigit ; k++){

                        System.out.printf("%d * %d * %d = %d;%n", i , j , k ,( i * j * k ));

                    }
                }
            }
        }*/
    }
}
