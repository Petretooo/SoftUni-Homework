import java.util.Scanner;

public class whileLoop8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = Integer.parseInt(in.nextLine());
        int b = Integer.parseInt(in.nextLine());

        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;

        }
        System.out.println(a);
    }
}
