import java.util.Scanner;

public class ifelse9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String category = in.nextLine();
        int row = Integer.parseInt(in.nextLine());
        int col = Integer.parseInt(in.nextLine());

        double normal = 7.5;
        double premiere = 12;
        double discount = 5;

        double budget = 0;
        if (category.equalsIgnoreCase("premiere")) {
            budget = row * col * premiere;
            System.out.printf("%.2f leva", budget);
        } else if (category.equalsIgnoreCase("normal")) {
            budget = row * col * normal;
            System.out.printf("%.2f leva", budget);
        } else if (category.equalsIgnoreCase("discount")) {
            budget = row * col * discount;
            System.out.printf("%.2f leva", budget);
        }
    }
}
