import java.util.Scanner;

public class forLoop9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = Integer.parseInt(in.nextLine());
        int b = Integer.parseInt(in.nextLine());

        int sum1 = 0;
        int sum2 = 0;

        int nuM;
        int lastDigit = 0;
        int minusNum = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                nuM = i;
                String num = Integer.toString(i);
                for (int j = 0; j < num.length(); j++) {
                    if (j % 2 == 0) {
                        lastDigit = nuM % 10;
                        minusNum = (nuM - lastDigit) / 10;
                        nuM = minusNum;
                        sum1 += lastDigit;
                    } else {
                        lastDigit = nuM % 10;
                        minusNum = (nuM - lastDigit) / 10;
                        nuM = minusNum;
                        sum2 += lastDigit;
                    }
                }
                if (sum1 == sum2) {
                    System.out.print(i + " ");
                }
                sum1 = 0;
                sum2 = 0;
            }

        }
    }
}
