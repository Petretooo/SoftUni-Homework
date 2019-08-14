package Exam;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int party = Integer.parseInt(in.nextLine());
        int days = Integer.parseInt(in.nextLine());


        int coins = 0;

        for (int i = 1; i <= days; i++) {

            if (i % 10 == 0) {
                party -= 2;
            }

            if (i % 15 == 0) {
                party += 5;

            }

            coins += (50 - 2 * party);

            if (i % 3 == 0) {
                coins -= (3 * party);
            }

            if (i % 5 == 0) {
                if (i % 3 == 0) {
                    coins += (18 * party);
                } else {
                    coins += (20 * party);
                }
            }

        }

        System.out.println(party + " companions received " + coins / party + " coins each.");

    }
}
