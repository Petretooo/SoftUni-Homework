import java.util.Scanner;

public class ifelse7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double budget = Double.parseDouble(in.nextLine());
        String category = in.nextLine();
        int people = Integer.parseInt(in.nextLine());

        double vip = 499.99;
        double normal = 249.99;

        double finalBudget = 0;
        if (people > 0 && people <= 4) {
            budget = budget - (budget * 0.75);
            if (category.equalsIgnoreCase("normal")) {
                finalBudget = normal * people;
                if (budget > finalBudget) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - finalBudget));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalBudget));
                }
            } else if (category.equalsIgnoreCase("vip")) {
                finalBudget = vip * people;
                if (budget > finalBudget) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - finalBudget));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalBudget));
                }
            }
        } else if (people > 4 && people <= 9) {
            budget = budget - (budget * 0.6);
            if (category.equalsIgnoreCase("normal")) {
                finalBudget = normal * people;
                if (budget > finalBudget) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - finalBudget));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalBudget));
                }
            } else if (category.equalsIgnoreCase("vip")) {
                finalBudget = vip * people;
                if (budget > finalBudget) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - finalBudget));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalBudget));
                }
            }
        } else if (people > 9 && people <= 24) {
            budget = budget - (budget * 0.5);
            if (category.equalsIgnoreCase("normal")) {
                finalBudget = normal * people;
                if (budget > finalBudget) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - finalBudget));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalBudget));
                }
            } else if (category.equalsIgnoreCase("vip")) {
                finalBudget = vip * people;
                if (budget > finalBudget) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - finalBudget));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalBudget));
                }
            }
        } else if (people > 24 && people <= 49) {
            budget = budget - (budget * 0.4);
            if (category.equalsIgnoreCase("normal")) {
                finalBudget = normal * people;
                if (budget > finalBudget) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - finalBudget));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalBudget));
                }
            } else if (category.equalsIgnoreCase("vip")) {
                finalBudget = vip * people;
                if (budget > finalBudget) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - finalBudget));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalBudget));
                }
            }
        } else if (people > 49) {
            budget = budget - (budget * 0.25);
            if (category.equalsIgnoreCase("normal")) {
                finalBudget = normal * people;
                if (budget > finalBudget) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - finalBudget));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalBudget));
                }
            } else if (category.equalsIgnoreCase("vip")) {
                finalBudget = vip * people;
                if (budget > finalBudget) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - finalBudget));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalBudget));
                }
            }
        }
    }
}