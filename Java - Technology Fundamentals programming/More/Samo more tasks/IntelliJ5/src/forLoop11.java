import java.util.Scanner;

public class forLoop11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String num = " ";
        String negative = "";

        int sum1 = 0;
        int sum2 = 0;

        int counter = 0;
        boolean isTrue = false;

        while (!num.equalsIgnoreCase("stop")) {
            num = in.nextLine();
            if (num.equalsIgnoreCase("stop")) {
                break;
            }
            int number = Integer.parseInt(num);
            if (number >= 0) {
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        counter++;
                    }
                }
                if (counter <= 2) {
                    sum1 += number;
                } else {
                    sum2 += number;
                }
            } else {
                System.out.println("Number is negative.");
            }
            counter = 0;

        }
        System.out.printf("Sum of all prime numbers is: %d%n", sum1);
        System.out.printf("Sum of all non prime numbers is: %d%n", sum2);
    }
}


/*
        if(number < 2){

        }

 */