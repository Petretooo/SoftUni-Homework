package Exam1;

import java.util.Scanner;

public class ChristmasSpirit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ornamenSet = 2;
        int treeSkirt = 5;
        int treeGarlands = 3;
        int treeLights = 15;

        int quantity = Integer.parseInt(in.nextLine());
        int days = Integer.parseInt(in.nextLine());

        int christmasSpirit = 0;
        int totalCost = 0;

        for (int i = 1; i <= days; i++) {


            if (i % 10 == 0) {
                christmasSpirit -= 20;
                totalCost += ((treeLights * 1) + (treeGarlands * 1) + (treeSkirt * 1));
            }
            if (i % 11 == 0) {
                quantity += 2;
            }


            if (i % 2 == 0) {
                totalCost += (ornamenSet * quantity);
                christmasSpirit += 5;

            }


            if (i % days == 0 && i % 10 == 0) {
                christmasSpirit -= 30;
            }


            if (i % 15 == 0) {
                totalCost += ((treeLights * quantity) + (treeGarlands * quantity) + (treeSkirt * quantity));
                christmasSpirit += 60;
                continue;
            }


            if (i % 3 == 0) {
                totalCost += ((treeGarlands * quantity) + (treeSkirt * quantity));
                christmasSpirit += 13;
            }
            if (i % 5 == 0) {
                totalCost += (treeLights * quantity);
                christmasSpirit += 17;
            }


        }


        System.out.println("Total cost: " + totalCost);
        System.out.println("Total spirit: " + christmasSpirit);


    }
}
