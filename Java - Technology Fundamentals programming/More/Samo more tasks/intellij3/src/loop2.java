import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 1;
        int temp = 1;

        int n = Integer.parseInt(in.nextLine());
        int x = Integer.parseInt(in.nextLine());

        for (int i = 1; i <= n; i++) {
            temp *= 1 / x;
            sum += temp;
        }

        System.out.printf("Result is %f", sum);


    }
}
