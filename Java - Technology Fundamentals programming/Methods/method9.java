package Methods;

import java.util.Scanner;

public class method9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = Integer.parseInt(in.nextLine());

        String numberL = Integer.toString(number);

        topNumber(number, numberL);

    }

    private static void topNumber(int number, String numberL) {
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        int temp4 = 0;

        int sum = 0;
        int counter = 0;

        for (int i = 1; i <= number; i++) {

            int numer = i;

            for (int j = 0; j < numberL.length(); j++) {

                temp1 = numer % 10;
                temp2 = numer - temp1;
                temp3 = temp2 / 10;

                sum += temp1;
                if (temp1 % 2 == 1) {
                    counter++;
                }
                numer = temp3;
            }

            if ((sum % 8 == 0 || sum % 16 == 0 || sum % 88 == 0) && counter > 0) {
                System.out.println(i);
            }

            temp1 = 0;
            temp2 = 0;
            temp3 = 0;
            temp4 = 0;
            sum = 0;
            counter = 0;


        }
    }
}