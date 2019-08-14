import java.util.Scanner;

public class forLoop10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = Integer.parseInt(in.nextLine());
        int b = Integer.parseInt(in.nextLine());

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        int nuM;
        int lastDigit = 0;
        int minusNum = 0;

        for (int i = a; i <= b; i++) {
            nuM = i;
            String num = Integer.toString(i);
            for (int j = 0; j <= 1; j++) {
                lastDigit = nuM % 10;
                minusNum = (nuM - lastDigit) / 10;
                nuM = minusNum;
                sum1 += lastDigit;
            }
            for (int k = 2; k <= 2; k++) {
                lastDigit = nuM % 10;
                minusNum = (nuM - lastDigit) / 10;
                nuM = minusNum;
                sum2 += lastDigit;
            }
            for (int l = 3; l <= num.length(); l++) {
                lastDigit = nuM % 10;
                minusNum = (nuM - lastDigit) / 10;
                nuM = minusNum;
                sum3 += lastDigit;
            }

            if (sum1 == sum3) {
                System.out.print(i + " ");
            } else if (sum1 < sum3) {
                sum1 += sum2;
                if (sum1 == sum3) {
                    System.out.printf(i + " ");
                }
            } else if (sum1 > sum3) {
                sum3 += sum2;
                if (sum1 == sum3) {
                    System.out.print(i + " ");
                }
            }
            sum1 = 0;
            sum2 = 0;
            sum3 = 0;


        }

    }
}
