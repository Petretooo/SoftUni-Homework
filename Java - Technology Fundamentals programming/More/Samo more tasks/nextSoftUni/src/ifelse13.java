import java.util.Scanner;

public class ifelse13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int budget = Integer.parseInt(in.nextLine());
        String season = in.nextLine();
        int numberFishermen = Integer.parseInt(in.nextLine());

        double price = 0;
        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }

        if (numberFishermen <= 6) {
            price = price - (price * 0.10);
        } else if (numberFishermen > 7 && numberFishermen <= 11) {
            price = price - (price * 0.15);
        } else {
            price = price - (price * 0.25);
        }

        if (numberFishermen % 2 == 0 && season != "Autumn") {
            price = price - (price * 0.05);
        }

        if (budget < price) {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(price - budget));
        } else {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(price - budget));
        }

    }
}