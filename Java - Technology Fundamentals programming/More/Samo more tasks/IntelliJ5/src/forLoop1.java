import java.util.Scanner;

public class forLoop1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        int counter = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    for (int l = 0; l <= n; l++) {
                        for (int p = 0; p <= n; p++) {
                            if (i + j + k + l + p == n) {
                                counter++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
