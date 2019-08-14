import java.util.Scanner;

public class Exam6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = Integer.parseInt(in.nextLine());
        int l = Integer.parseInt(in.nextLine());
        int m = Integer.parseInt(in.nextLine());
        int n = Integer.parseInt(in.nextLine());

        int counter = 0;

        for (int i = k; i <= 8; i++) {
            for (int j = 9; j >= l; l--) {
                for (int p = m; p <= 8; p++) {
                    for (int q = 9; q >= n; q--) {
                        if ((i % 2 == 0 && j % 2 == 1) && (p % 2 == 0 && q % 2 == 1)) {
                            if (i == p && j == q) {
                                System.out.printf("Cannot change the same player.%n");
                            } else {
                                System.out.printf("%d%d - %d%d%n", i, j, p, q);
                                counter++;
                            }
                            if (counter == 6) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}