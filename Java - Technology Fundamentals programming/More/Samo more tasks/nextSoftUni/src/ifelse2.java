import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String product = in.nextLine();
        if (product.equalsIgnoreCase("banana") ||
                product.equalsIgnoreCase("apple") ||
                product.equalsIgnoreCase("kiwi") ||
                product.equalsIgnoreCase("cherry") ||
                product.equalsIgnoreCase("lemon") ||
                product.equalsIgnoreCase("grapes")) {
            System.out.println("fruit");
        } else if (product.equalsIgnoreCase("tomato") ||
                product.equalsIgnoreCase("cucumber") ||
                product.equalsIgnoreCase("pepper") ||
                product.equalsIgnoreCase("carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
