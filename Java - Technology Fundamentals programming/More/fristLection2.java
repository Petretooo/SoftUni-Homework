import java.util.Scanner;

public class fristLection2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int n = Integer.parseInt(in.nextLine());


        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
