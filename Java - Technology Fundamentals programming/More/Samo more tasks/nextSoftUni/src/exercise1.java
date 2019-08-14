import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        double procent = 0;
        double allSum = 0;
        int module;
        if (n <= 100) {
            int constant = 5;
            procent = n + constant;
            //       allSum = procent + constant;
            if (n % 2 == 0) {
                System.out.println(constant + 1);
                System.out.printf("%.1f", procent + 1);
            } else if (n % 10 == 5) {
                System.out.println(constant + 2);
                System.out.printf("%.1f", procent + 2);
            } else {
                System.out.println(constant);
                System.out.printf("%.1f", procent);
            }
        } else if (n > 100 && n < 1000) {
            module = n % 100;
            procent = n * 0.2;
            allSum = n + procent;
            if (module % 2 == 0) {
                System.out.printf("%.1f%n", procent + 1);
                System.out.printf("%.1f", allSum + 1);
            } else if (module % 10 == 5) {
                System.out.printf("%.1f%n", procent + 2);
                System.out.printf("%.1f", allSum + 2);
            } else {
                System.out.printf("%.1f%n", procent);
                System.out.printf("%.1f", allSum);
            }
        } else if (n >= 1000) {
            module = n % 1000;
            int module1 = module % 100;
            procent = n * 0.1;
            allSum = n + procent;
            if (module1 % 10 == 0) {
                System.out.printf("%.1f%n", procent + 1);
                System.out.printf("%.1f", allSum + 1);
            } else if (module1 % 10 == 5) {
                System.out.printf("%.1f%n", procent + 2);
                System.out.printf("%.1f", allSum + 2);
            } else {
                System.out.printf("%.1f%n", procent);
                System.out.printf("%.1f", allSum);
            }
        }

    }
}