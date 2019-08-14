import java.util.Scanner;

public class whileLoop6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());
        int i = 1;

        while (i <= num) {
            System.out.println(i);
            i = 2 * i + 1;
        }
    }
}
