import java.util.Scanner;

public class fafa {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double vacPrice = Double.parseDouble(cin.nextLine());
        int pusselQt = Integer.parseInt(cin.nextLine());
        int puppetQt = Integer.parseInt(cin.nextLine());
        int bearQt = Integer.parseInt(cin.nextLine());
        int miniQt = Integer.parseInt(cin.nextLine());
        int truckQt = Integer.parseInt(cin.nextLine());
        int totalQt = puppetQt + pusselQt + bearQt + miniQt + truckQt;
        double totalPrice = (pusselQt * 2.6) + (puppetQt * 3.0) + (bearQt * 4.1) + (miniQt * 8.2) + (truckQt * 2.0);
        if (totalQt >= 50) {
            totalPrice = totalPrice - (totalPrice * 0.25);
        }

        totalPrice = totalPrice - (totalPrice * 0.1);
        double difference = totalPrice - vacPrice;

        if (difference >= 0) {
            System.out.printf("Yes! %.2f lv left.", difference);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(difference));
        }
    }
}
