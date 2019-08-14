package Exam1;

import java.util.Scanner;

public class SantaCookies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int singleCookieGrams = 25;
        final int cup = 140;
        final int smallSpoon = 10;
        final int bigSpoon = 20;
        final int cookiePerBox = 5;


        int n = Integer.parseInt(in.nextLine());

        int totalBoxes = 0;

        for (int i = 1; i <= n; i++) {

            int flourGrams = Integer.parseInt(in.nextLine());
            int sugarGrams = Integer.parseInt(in.nextLine());
            int cocoaGrams = Integer.parseInt(in.nextLine());


            int flourCups = flourGrams / cup;
            int sugarSpoon = sugarGrams / bigSpoon;
            int cocoaSpoons = cocoaGrams / smallSpoon;


            int min = min(flourCups, sugarSpoon, cocoaSpoons);
            int totalCookiePerBake = formula(cup, smallSpoon, bigSpoon, min, singleCookieGrams);
            int boxesPerBatch = totalCookiePerBake / cookiePerBox;

            if (flourCups <= 0 || sugarSpoon <= 0 || cocoaSpoons <= 0) {
                System.out.println("Ingredients are not enough for a box of cookies.");
                continue;
            } else {
                System.out.printf("Boxes of cookies: %d", boxesPerBatch);
            }


            totalBoxes += boxesPerBatch;

            System.out.println();
        }


        System.out.printf("Total boxes: %d%n", totalBoxes);

    }


    private static int formula(int cup, int smallSpoon, int bigSpoon, int min2, int singleCookieGrams) {

        int formula = ((cup + smallSpoon + bigSpoon) * min2) / singleCookieGrams;
        return formula;
    }


    private static int min(int flourGrams, int sugarGrams, int cocoaGrams) {


        int min = Math.min(Math.min(flourGrams, sugarGrams), cocoaGrams);
        return min;
    }
}
