import java.util.Scanner;

public class forOddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        int sum = 0;

        do {
            System.out.println(n);
            n++;
        } while (n >= 20);
    }
}