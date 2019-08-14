package AbstractionsEnumerationsStatic.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String card = in.nextLine();
        String suit = in.nextLine();

        int power = CardRank.valueOf(card).getValueCard() + CardSuit.valueOf(suit).getSuits();

        System.out.println(String.format("Card name: %s of %s; Card power: %d", card,suit, power ));


    }
}
