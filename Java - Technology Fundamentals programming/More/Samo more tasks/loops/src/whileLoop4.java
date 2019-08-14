import java.util.Scanner;

public class whileLoop4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = Integer.parseInt(in.nextLine());
        int a = 1;
        double sum = 0;

        while (a <= number) {
            double price = Double.parseDouble(in.nextLine());
            a++;
            if (price > 0) {
                sum += price;
                System.out.printf("Increase: %.2f%n", price);
            }
            if (price < 0) {
                System.out.println("Invalid operation!");
                break;
            }

        }
        System.out.printf("Total: %.2f%n", sum);


    }
}
