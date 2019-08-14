import java.util.Scanner;

public class ExamTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double budget = Double.parseDouble(in.nextLine());
        String city = in.nextLine();
        int days = Integer.parseInt(in.nextLine());

        double forSleep = 0, finalPrice;

        if (city.equalsIgnoreCase("Cairo")) {
            forSleep = days * (250 * 2) + 600;
            if (days >= 1 && days <= 4) {
                finalPrice = forSleep - (forSleep * 0.03);
                if (budget > finalPrice) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - finalPrice));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalPrice));
                }
            } else if (days >= 5 && days <= 9) {
                finalPrice = forSleep - (forSleep * 0.05);
                if (budget > forSleep) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - finalPrice)));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalPrice));
                }
            } else if (days >= 10 && days <= 24) {
                finalPrice = forSleep - (forSleep * 0.1);
                if (budget > forSleep) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - finalPrice)));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalPrice));
                }
            } else if (days >= 25 && days <= 49) {
                finalPrice = forSleep - (forSleep * 0.17);
                if (budget > forSleep) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - finalPrice)));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalPrice));
                }
            } else if (days >= 50) {
                finalPrice = forSleep - (forSleep * 0.3);
                if (budget > forSleep) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - finalPrice)));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalPrice));
                }
            }
        } else if (city.equalsIgnoreCase("New York")) {
            forSleep = days * (300 * 2) + 650;
            if (days >= 1 && days <= 4) {
                finalPrice = forSleep - (forSleep * 0.03);
                if (budget > finalPrice) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - finalPrice));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalPrice));
                }
            } else if (days >= 5 && days <= 9) {
                finalPrice = forSleep - (forSleep * 0.05);
                if (budget > forSleep) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - finalPrice)));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalPrice));
                }
            } else if (days >= 10 && days <= 24) {
                finalPrice = forSleep - (forSleep * 0.12);
                if (budget > forSleep) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - finalPrice)));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalPrice));
                }
            } else if (days >= 25 && days <= 49) {
                finalPrice = forSleep - (forSleep * 0.19);
                if (budget > forSleep) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - finalPrice)));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalPrice));
                }
            } else if (days >= 50) {
                finalPrice = forSleep - (forSleep * 0.3);
                if (budget > forSleep) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - finalPrice)));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalPrice));
                }
            }
        } else if (city.equalsIgnoreCase("Paris")) {
            forSleep = days * (150 * 2) + 350;
            if (days >= 5 && days <= 9) {
                finalPrice = forSleep - (forSleep * 0.07);
                if (budget > forSleep) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - finalPrice)));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalPrice));
                }
            } else if (days >= 10 && days <= 24) {
                finalPrice = forSleep - (forSleep * 0.12);
                if (budget > forSleep) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - finalPrice)));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalPrice));
                }
            } else if (days >= 25 && days <= 49) {
                finalPrice = forSleep - (forSleep * 0.22);
                if (budget > forSleep) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - finalPrice)));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalPrice));
                }
            } else if (days >= 50) {
                finalPrice = forSleep - (forSleep * 0.3);
                if (budget > forSleep) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - finalPrice)));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalPrice));
                }
            } else if (days >= 1 && days <= 4) {
                if (budget > forSleep) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - forSleep)));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - forSleep));
                }
            }
        } else if (city.equalsIgnoreCase("Lima")) {
            forSleep = days * (2 * 400) + 850;
            if (days >= 25 && days <= 49) {
                finalPrice = forSleep - (forSleep * 0.19);
                if (budget > forSleep) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - finalPrice)));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalPrice));
                }
            } else if (days >= 50) {
                finalPrice = forSleep - (forSleep * 0.3);
                if (budget > forSleep) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - finalPrice)));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalPrice));
                }
            } else if ((days >= 1 && days <= 24)) {
                if (budget > forSleep) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - forSleep)));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - forSleep));
                }

            }
        } else if (city.equalsIgnoreCase("Tokyo")) {
            forSleep = days * (2 * 350) + 700;
            if (days >= 10 && days <= 24) {
                finalPrice = forSleep - (forSleep * 0.12);
                if (budget > forSleep) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - finalPrice)));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalPrice));
                }
            } else if (days >= 25 && days <= 49) {
                finalPrice = forSleep - (forSleep * 0.17);
                if (budget > forSleep) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - finalPrice)));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalPrice));
                }
            } else if (days >= 50) {
                finalPrice = forSleep - (forSleep * 0.3);
                if (budget > forSleep) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - finalPrice)));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - finalPrice));
                }
            } else if ((days >= 1 && days <= 9)) {
                if (budget > forSleep) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - forSleep)));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - forSleep));
                }
            }
        }
    }
}