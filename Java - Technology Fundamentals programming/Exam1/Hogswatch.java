package Exam1;

import java.util.Scanner;

public class Hogswatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int days = Integer.parseInt(in.nextLine());
        int allGifts = Integer.parseInt(in.nextLine());
        int initialPresents = allGifts;

        int counter = 0;
        int homeRemaining = 0;
        int formula = 0;

        int counterBack = 0;
        int totalPresents = 0;

        for (int i = 0; i < days; i++) {
            int childrenPerDays = Integer.parseInt(in.nextLine());

            counter++;
            homeRemaining = days - counter;
            if (childrenPerDays <= allGifts) {
                allGifts -= childrenPerDays;
            } else {
                counterBack++;
                int presentsNeeded = childrenPerDays - allGifts;
                formula = (initialPresents / counter) * homeRemaining + presentsNeeded;
                allGifts = formula;
                totalPresents += formula;
                allGifts -= presentsNeeded;
            }


        }

        if (counterBack == 0) {
            System.out.println(allGifts);
        } else {
            System.out.println(counterBack);
            System.out.println(totalPresents);

        }


    }
}
