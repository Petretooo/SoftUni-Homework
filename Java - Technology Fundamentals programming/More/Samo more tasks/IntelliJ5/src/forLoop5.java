import java.util.Scanner;

public class forLoop5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        int num = 0;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                num = i + j + 1;
                if (num > n) {
                    num = 2 * n - num;
                }
                System.out.print(num + " ");
            }
            System.out.println();

        }
    }
}
