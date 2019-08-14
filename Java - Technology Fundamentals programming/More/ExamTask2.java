import java.util.Scanner;

public class ExamTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double priceParty = Double.parseDouble(in.nextLine());
        int poslania = Integer.parseInt(in.nextLine());
        int roses = Integer.parseInt(in.nextLine());
        int keyring = Integer.parseInt(in.nextLine());
        int cartoon = Integer.parseInt(in.nextLine());
        int luckyGift = Integer.parseInt(in.nextLine());

        double poslaniaPrice = 0.6;
        double rosesPrice = 7.2;
        double keyringPrice = 3.6;
        double cartoonPrice = 18.2;
        double luckyGiftPrice = 22;

        double sum = poslania * poslaniaPrice + roses * rosesPrice + keyring * keyringPrice + cartoon * cartoonPrice + luckyGift * luckyGiftPrice;
        double number = poslania + roses + keyring + cartoon + luckyGift;

        if (number > 25) {
            double percentPrice = sum - (sum * 0.35);
            double hosting = percentPrice - (percentPrice * 0.1);
            if (hosting > priceParty) {
                System.out.printf("Yes! %.2f lv left.", Math.abs(hosting - priceParty));
            } else {
                System.out.printf("Not enough money! %.2f lv needed.", Math.abs(hosting - priceParty));
            }
        } else if (number < 25) {
            double hosting = sum - (sum * 0.1);
            if (hosting > priceParty) {
                System.out.printf("Yes! %.2f lv left.", Math.abs(hosting - priceParty));
            } else {
                System.out.printf("Not enough money! %.2f lv needed.", Math.abs(hosting - priceParty));
            }
        }


    }
}
