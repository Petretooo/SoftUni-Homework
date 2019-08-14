import java.util.Scanner;

public class softUni {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double priceExcursion = Double.parseDouble(in.nextLine());
        int puzzles = Integer.parseInt(in.nextLine());
        int dolls = Integer.parseInt(in.nextLine());
        int bears = Integer.parseInt(in.nextLine());
        int minions = Integer.parseInt(in.nextLine());
        int trucks = Integer.parseInt(in.nextLine());
        double sum = (puzzles * 2.60) + (dolls * 3) + (bears * 4.10) + (minions * 8.20) + (trucks * 2);
        double numbers = puzzles + dolls + bears + minions + trucks;
        if (numbers >= 50) {
            sum = sum - (sum * 0.25);
        }

        sum = sum - (sum * 0.1);
        double difference = sum - priceExcursion;

        if (difference >= 50) {
            System.out.printf("Yes! %.2f lv left.", difference);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(difference));
        }
    }
}