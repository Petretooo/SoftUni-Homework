import java.util.Scanner;

public class loop3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int m = n;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            if (i == m) {
                return;
            }
            System.out.println();
            n++;
        }


    }
}
