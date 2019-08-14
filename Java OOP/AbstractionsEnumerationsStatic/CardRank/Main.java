package AbstractionsEnumerationsStatic.CardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Card Ranks:");

        CardRank[] enums = CardRank.values();

        for (CardRank anEnum : enums) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s"
            , anEnum.ordinal(), anEnum.name()));
        }

    }
}
