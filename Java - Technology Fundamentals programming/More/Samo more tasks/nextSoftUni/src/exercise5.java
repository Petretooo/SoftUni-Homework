import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double income = Double.parseDouble(in.nextLine());
        double grades = Double.parseDouble(in.nextLine());
        double minimal = Double.parseDouble(in.nextLine());

        double socialSholar = minimal * 0.35;
        double gradeScolar = grades * 25;

        boolean canTakeExcellent = false;
        boolean canTakeSocial = false;

        if (income < minimal && grades > 4.5) {
            canTakeSocial = true;
        }
        if (grades >= 5.5) {
            canTakeExcellent = true;
        }

        if (canTakeSocial == true && canTakeExcellent == true) {
            if (socialSholar >= gradeScolar) {
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialSholar));
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(gradeScolar));
            }
        } else if (canTakeSocial == true) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialSholar));
        } else if (canTakeExcellent == true) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(gradeScolar));
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}
