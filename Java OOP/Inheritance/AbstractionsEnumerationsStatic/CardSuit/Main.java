package AbstractionsEnumerationsStatic.CardSuit;

import AbstractionsEnumerationsStatic.CardSuit.CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        CardSuit[] enums = CardSuit.values();

        System.out.println("Card Suits:");
        for (CardSuit value : enums) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s"
            , value.ordinal(), value.name()));
        }

    }
}
