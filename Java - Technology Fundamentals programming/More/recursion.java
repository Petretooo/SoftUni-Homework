import java.util.Scanner;

public class recursion {

    public static int fibonacci(int n) {

        if (n >= 2) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        } else {
            return 1;
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        System.out.println(fibonacci(number));
        System.out.println(factorial(number));

    }

    public static int factorial(int n) {

        if (n > 0) {
            return factorial(n - 1) * n;
        } else {
            return 1;
        }
    }


}
