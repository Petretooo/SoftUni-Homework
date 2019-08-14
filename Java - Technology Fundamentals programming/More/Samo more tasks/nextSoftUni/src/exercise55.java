import java.util.Scanner;

public class exercise55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double income = Double.parseDouble(in.nextLine());
        double grade = Double.parseDouble(in.nextLine());
        double minimalSalary = Double.parseDouble(in.nextLine());

        double scholarS = minimalSalary * 0.35;
        double scholarE = grade * 0.25;

        boolean canTakeSocial = false;
        boolean canTakeExellent = false;

        if (income < minimalSalary && grade > 4.5) {
            canTakeSocial = true;
        }
        if (grade > 5.5) {
            canTakeExellent = true;
        }
        if (canTakeExellent && canTakeSocial) {
            if (scholarS > scholarE) {
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(scholarS));
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(scholarE));
            }
        } else if (canTakeSocial) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(scholarS));
        } else if (canTakeExellent) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(scholarE));
        } else {
            System.out.println("You cannot get a scholarship!");
        }


    }
}
