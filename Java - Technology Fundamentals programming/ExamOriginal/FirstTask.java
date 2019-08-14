package ExamOriginal;
import java.util.Scanner;
public class FirstTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int days = Integer.parseInt(in.nextLine());
        double budget = Double.parseDouble(in.nextLine());
        int people = Integer.parseInt(in.nextLine());
        double fuelPerKilo = Double.parseDouble(in.nextLine());
        double foodPerPerson = Double.parseDouble(in.nextLine());
        double priceForNightPerPerson = Double.parseDouble(in.nextLine());

        double foodExpenses = foodPerPerson * people * days;
        double priceForAllNight = priceForNightPerPerson * people * days;

        if (people > 10) {
            priceForAllNight -= priceForAllNight * 0.25;
        }

        double currentExpenses = foodExpenses + priceForAllNight;

        double currentExpenses1 = currentExpenses;

        double consumedFuel = 0;
        for (int i = 1; i <= days; i++) {

            double distance = Integer.parseInt(in.nextLine());

            consumedFuel = distance * fuelPerKilo;
            currentExpenses1 += consumedFuel;

            if (i % 3 == 0 || i % 5 == 0) {
                currentExpenses1 += currentExpenses1 * 0.4;
            }

            if (i % 7 == 0) {
                currentExpenses1 -= currentExpenses1 / people;
            }

            if (currentExpenses1 > budget) {
                break;
            }
        }
        if (budget >= currentExpenses1) {
            System.out.printf("You have reached the destination. You have %.2f$ budget left.", budget - currentExpenses1);
            return;
        } else {
            System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", Math.abs(currentExpenses1 - budget));
            return;
        }

    }
}
