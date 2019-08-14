import java.util.Scanner;

public class ifelse4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double num = Double.parseDouble(in.nextLine());

        if (num > 0 && num < 100) {
            System.out.println("invalid");
        } else if (num > 200) {
            System.out.println("invalid");
        } else if (num < 0) {
            System.out.println("invalid");
        }

    }
}
