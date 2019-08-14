import java.util.Scanner;

public class whileLoop12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int width = Integer.parseInt(in.nextLine());
        int lenght = Integer.parseInt(in.nextLine());

        int cakeSize = (width * lenght);

        boolean a = true;
        String input = in.nextLine();

        while (true) {
            if (input.equalsIgnoreCase("STOP")) {
                break;
            }
            int pieces = Integer.parseInt(input);
            cakeSize -= pieces;
            if (cakeSize < 0) {
                a = false;
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeSize));
                break;
            }
            input = in.nextLine();
        }

        if (a) {
            System.out.printf("%d pieces are left.", cakeSize);
        }

    }
}
