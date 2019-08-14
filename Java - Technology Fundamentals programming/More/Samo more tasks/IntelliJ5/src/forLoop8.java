import java.util.Scanner;

public class forLoop8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = Integer.parseInt(in.nextLine());
        int b = Integer.parseInt(in.nextLine());
        int c = Integer.parseInt(in.nextLine());

        for (int i = 2; i <= a; i += 2) {
            for (int j = 2; j <= b; j++) {
                for (int k = 2; k <= c; k += 2) {
                    if (j != 4 && j != 6 && j <= 7) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
}
