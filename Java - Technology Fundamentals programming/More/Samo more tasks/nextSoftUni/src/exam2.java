import java.util.Scanner;

public class exam2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        double budget = Double.parseDouble(in.nextLine());
        double numberBottles = Double.parseDouble(in.nextLine());
        double numberChips = Double.parseDouble(in.nextLine());
        double priceBeer = numberBottles * 1.20;
        double priceChips = 0.45 * priceBeer;
        double totalChips = Math.ceil(priceChips * numberChips);
        double totalSum = priceBeer + totalChips;
        double moreMoney = totalSum - budget;
        double moneyLeft = budget - totalSum;
        if (totalSum < budget) {
            System.out.printf("%s bought a snack and has %.2f leva left.", name, moneyLeft);
        } else if (totalSum > budget) {
            System.out.printf("%s needs %.2f more leva!", name, moreMoney);
        }
    }
}
// 85 / 100 points