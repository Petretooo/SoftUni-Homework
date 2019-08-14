import java.util.Scanner;

public class firstLection4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lostGames = Integer.parseInt(in.nextLine());
        double headsetPrice = Double.parseDouble(in.nextLine());
        double mousePrice = Double.parseDouble(in.nextLine());
        double keyboardPrice = Double.parseDouble(in.nextLine());
        double displayPrice = Double.parseDouble(in.nextLine());

        double expenses = (lostGames / 2) * headsetPrice +
                (lostGames / 3) * mousePrice +
                (lostGames / 6) * keyboardPrice +
                (lostGames / 12) * displayPrice;

        System.out.println(String.format("Rage expenses: %.2f lv.", expenses));
    }
}
