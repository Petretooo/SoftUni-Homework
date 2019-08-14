import java.util.Scanner;

public class forLoop3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = Integer.parseInt(in.nextLine());
        int b = Integer.parseInt(in.nextLine());
        int c = Integer.parseInt(in.nextLine());
        int d = Integer.parseInt(in.nextLine());

        for (int i = a; i <= b; i++) {
            for (int j = a; j <= b; j++) {
                for (int k = c; k <= c; k++) {
                    for (int l = d; l <= d; l++) {
                        if (i + l == j + k && (i != j && c != l)) {
                            System.out.printf("%d%d%n", i, j);
                            System.out.printf("%d%d%n", k, l);
                            System.out.println();
                        }
                    }
                }
            }
        }

    }
}
