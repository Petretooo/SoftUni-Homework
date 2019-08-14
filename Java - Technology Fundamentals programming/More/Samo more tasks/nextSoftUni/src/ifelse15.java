import java.util.Scanner;

public class ifelse15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double budget = Double.parseDouble(in.nextLine());
        String season = in.nextLine();
        double price = 0;
        if (budget <= 100) {
            System.out.println("Somewhere in Bulgaria");
            if (season.equalsIgnoreCase("summer")) {
                price = budget * 0.3;
                System.out.printf("Camp - %.2f ", price);
            } else if (season.equalsIgnoreCase("winter")) {
                price = budget * 0.7;
                System.out.printf("Hotel - %.2f ", price);
            }
        } else if (budget <= 1000) {
            System.out.println("Somewhere in Balkans");
            if (season.equalsIgnoreCase("summer")) {
                price = budget * 0.4;
                System.out.printf("Camp - %.2f ", price);
            } else if (season.equalsIgnoreCase("winter")) {
                price = budget * 0.8;
                System.out.printf("Hotel - %.2f ", price);
            }
        } else if (budget > 1000) {
            System.out.println("Somewhere in Europe");
            price = budget = budget * 0.9;
            if (season.equalsIgnoreCase("summer")) {
                System.out.printf("Hotel - %.2f ", price);
            } else if (season.equalsIgnoreCase("winter")) {
                System.out.printf("Hotel - %.2f", price);
            }
        }
    }
}
