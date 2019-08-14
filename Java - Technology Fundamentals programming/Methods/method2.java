package Methods;

import java.util.Scanner;

public class method2 {


    static double factorial(double n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double fact = 1;
        double fact1 = 1;

        int num = Integer.parseInt(in.nextLine());
        int num1 = Integer.parseInt(in.nextLine());

        fact = factorial(num);
        fact1 = factorial(num1);

        double devide = fact / fact1;

        System.out.printf("%.2f", devide);


    }
}
