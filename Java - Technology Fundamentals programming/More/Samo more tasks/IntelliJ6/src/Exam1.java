import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double foodPrice = Double.parseDouble(in.nextLine());
        double souvernirPrice = Double.parseDouble(in.nextLine());
        double hotelPrice = Double.parseDouble(in.nextLine());

        double literBenzin = (420 / (double) 100) * 7;
        double benzinPrice = literBenzin * 1.85;
        double threeDays = (3 * foodPrice) + (3 * souvernirPrice);

        double firstDay = hotelPrice * 0.9;
        double secondDay = hotelPrice * 0.85;
        double thirdDay = hotelPrice * 0.8;

        double totalPrice = benzinPrice + threeDays + firstDay + secondDay + thirdDay;

        System.out.printf("Money needed: %.2f", totalPrice);
    }
}
