package DemoExam;

import java.util.Scanner;

public class FirstTast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double budget = Double.parseDouble(in.nextLine());
        int students = Integer.parseInt(in.nextLine());
        double priceFlour = Double.parseDouble(in.nextLine());
        double priceEgg = Double.parseDouble(in.nextLine());
        double priceApron = Double.parseDouble(in.nextLine());


        int eggsPerStudent = 10;
        int flourPerStudent = 1;
        int apronPerStudent = 1;

        double procentApron = Math.ceil(students * 0.2);
        double apronFormula = priceApron * (students + procentApron);
        double eggFormula = priceEgg * 10 * students;
        double freePackege = 0;

        for (int i = 1; i <= students; i++) {
            if (i % 5 == 0) {
                freePackege++;
            }
        }
        double flourFormula = 0;
        if (freePackege != 0) {
            flourFormula = priceFlour * (students - freePackege);
        } else {
            flourFormula = priceFlour * students;

        }

        double finalFormula = apronFormula + eggFormula + flourFormula;

        if (finalFormula <= budget) {
            System.out.printf("Items purchased for %.2f$.", finalFormula);
        } else if (finalFormula > budget) {
            System.out.printf("%.2f$ more needed.", Math.abs(finalFormula - budget));
        }
    }
}
