import java.util.Scanner;

public class forLoop12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        int l = Integer.parseInt(in.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (char k = 97; k < 97 + l; k++) {
                    for (char k1 = 'a'; k1 < 'a' + l; k1++) {
                        for (int p = 1; p <= n; p++) {
                            if (i < p && j < p) {
                                System.out.printf("%d%d%c%c%d ", i, j, k, k1, p);
                            }
                        }
                    }
                }
            }
        }
    }
}
