import java.util.Scanner;

public class ifelse17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String month = in.nextLine();
        int days = Integer.parseInt(in.nextLine());

        double studio = 0;
        double apartament = 0;
        if (month.equalsIgnoreCase("May") ||
                month.equalsIgnoreCase("October")) {
            studio = 50;
            apartament = 65;
            if (days > 7 && days <= 14) {
                studio = studio - (studio * 0.05);
                System.out.printf("Apartment: %.2f lv.%n", apartament * days);
                System.out.printf("Studio: %.2f lv.", studio * days);
            } else if (days > 14) {
                studio = studio - (studio * 0.3);
                apartament = apartament - (apartament * 0.1);
                System.out.printf("Apartment: %.2f lv.%n", apartament * days);
                System.out.printf("Studio: %.2f lv.", studio * days);
            } else if (days >= 0) {
                System.out.printf("Apartment: %.2f lv.%n", apartament * days);
                System.out.printf("Studio: %.2f lv.", studio * days);
            }
        } else if (month.equalsIgnoreCase("June") ||
                month.equalsIgnoreCase("September")) {
            studio = 75.2;
            apartament = 68.7;
            if (days > 7 && days <= 14) {
                System.out.printf("Apartment: %.2f lv.%n", apartament * days);
                System.out.printf("Studio: %.2f lv.", studio * days);
            } else if (days > 14) {
                studio = studio - (studio * 0.2);
                apartament = apartament - (apartament * 0.1);
                System.out.printf("Apartment: %.2f lv.%n", apartament * days);
                System.out.printf("Studio: %.2f lv.", studio * days);
            } else if (days >= 0) {
                System.out.printf("Apartment: %.2f lv.%n", apartament * days);
                System.out.printf("Studio: %.2f lv.", studio * days);
            }
        } else if (month.equalsIgnoreCase("July") ||
                month.equalsIgnoreCase("August")) {
            studio = 76;
            apartament = 77;
            if (days > 7 && days <= 14) {
                System.out.printf("Apartment: %.2f lv.%n", apartament * days);
                System.out.printf("Studio: %.2f lv.", studio * days);
            } else if (days > 14) {
                apartament = apartament - (apartament * 0.1);
                System.out.printf("Apartment: %.2f lv.%n", apartament * days);
                System.out.printf("Studio: %.2f lv.%n", studio * days);
            } else if (days >= 0) {
                System.out.printf("Apartment: %.2f lv.%n", apartament * days);
                System.out.printf("Studio: %.2f lv.%n", studio * days);
            }
        }
    }
}