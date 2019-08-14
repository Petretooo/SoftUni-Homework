import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int fact2N = 2 * n;
        int factNplus1 = n + 1;
        for (int i = fact2N - 1; i > 0; i--) {
            fact2N *= i;
        }
        for (int i = factNplus1 - 1; i > 0; i--) {
            factNplus1 *= i;
        }
        for (int i = n - 1; i > 0; i--) {
            n *= i;
        }

        System.out.printf("Result is %f", (fact2N / (factNplus1 * n)));
    }
}
