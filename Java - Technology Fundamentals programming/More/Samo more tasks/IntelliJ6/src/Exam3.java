import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String sushi = in.nextLine();
        String nameRestourant = in.nextLine();
        int numberPortions = Integer.parseInt(in.nextLine());
        String order = in.nextLine();

        if (sushi.equalsIgnoreCase("sashimi")) {
            if (nameRestourant.equalsIgnoreCase("Sushi Zone")) {
                double price = 4.99 * numberPortions;
                if (order.equalsIgnoreCase("Y")) {
                    price = price + (price * 0.2);
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                } else if (order.equalsIgnoreCase("N")) {
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                }
            } else if (nameRestourant.equalsIgnoreCase("Sushi Time")) {
                double price = 5.49 * numberPortions;
                if (order.equalsIgnoreCase("Y")) {
                    price = price + (price * 0.2);
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                } else if (order.equalsIgnoreCase("N")) {
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                }
            } else if (nameRestourant.equalsIgnoreCase("Sushi Bar")) {
                double price = 5.25 * numberPortions;
                if (order.equalsIgnoreCase("Y")) {
                    price = price + (price * 0.2);
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                } else if (order.equalsIgnoreCase("N")) {
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                }
            } else if (nameRestourant.equalsIgnoreCase("Asian Pub")) {
                double price = 4.5 * numberPortions;
                if (order.equalsIgnoreCase("Y")) {
                    price = price + (price * 0.2);
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                } else if (order.equalsIgnoreCase("N")) {
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                }
            } else {
                System.out.printf("%s is invalid restaurant!", nameRestourant);
            }
        } else if (sushi.equalsIgnoreCase("maki")) {
            if (nameRestourant.equalsIgnoreCase("Sushi Zone")) {
                double price = 5.29 * numberPortions;
                if (order.equalsIgnoreCase("Y")) {
                    price = price + (price * 0.2);
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                } else if (order.equalsIgnoreCase("N")) {
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                }
            } else if (nameRestourant.equalsIgnoreCase("Sushi Time")) {
                double price = 4.69 * numberPortions;
                if (order.equalsIgnoreCase("Y")) {
                    price = price + (price * 0.2);
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                } else if (order.equalsIgnoreCase("N")) {
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                }
            } else if (nameRestourant.equalsIgnoreCase("Sushi Bar")) {
                double price = 5.55 * numberPortions;
                if (order.equalsIgnoreCase("Y")) {
                    price = price + (price * 0.2);
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                } else if (order.equalsIgnoreCase("N")) {
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                }
            } else if (nameRestourant.equalsIgnoreCase("Asian Pub")) {
                double price = 4.80 * numberPortions;
                if (order.equalsIgnoreCase("Y")) {
                    price = price + (price * 0.2);
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                } else if (order.equalsIgnoreCase("N")) {
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                }
            } else {
                System.out.printf("%s is invalid restaurant!", nameRestourant);
            }
        } else if (sushi.equalsIgnoreCase("uramaki")) {
            if (nameRestourant.equalsIgnoreCase("Sushi Zone")) {
                double price = 5.99 * numberPortions;
                if (order.equalsIgnoreCase("Y")) {
                    price = price + (price * 0.2);
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                } else if (order.equalsIgnoreCase("N")) {
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                }
            } else if (nameRestourant.equalsIgnoreCase("Sushi Time")) {
                double price = 4.49 * numberPortions;
                if (order.equalsIgnoreCase("Y")) {
                    price = price + (price * 0.2);
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                } else if (order.equalsIgnoreCase("N")) {
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                }
            } else if (nameRestourant.equalsIgnoreCase("Sushi Bar")) {
                double price = 6.25 * numberPortions;
                if (order.equalsIgnoreCase("Y")) {
                    price = price + (price * 0.2);
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                } else if (order.equalsIgnoreCase("N")) {
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                }
            } else if (nameRestourant.equalsIgnoreCase("Asian Pub")) {
                double price = 5.50 * numberPortions;
                if (order.equalsIgnoreCase("Y")) {
                    price = price + (price * 0.2);
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                } else if (order.equalsIgnoreCase("N")) {
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                }
            } else {
                System.out.printf("%s is invalid restaurant!", nameRestourant);
            }
        } else if (sushi.equalsIgnoreCase("temaki")) {
            if (nameRestourant.equalsIgnoreCase("Sushi Zone")) {
                double price = 4.29 * numberPortions;
                if (order.equalsIgnoreCase("Y")) {
                    price = price + (price * 0.2);
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                } else if (order.equalsIgnoreCase("N")) {
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                }
            } else if (nameRestourant.equalsIgnoreCase("Sushi Time")) {
                double price = 5.19 * numberPortions;
                if (order.equalsIgnoreCase("Y")) {
                    price = price + (price * 0.2);
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                } else if (order.equalsIgnoreCase("N")) {
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                }
            } else if (nameRestourant.equalsIgnoreCase("Sushi Bar")) {
                double price = 4.75 * numberPortions;
                if (order.equalsIgnoreCase("Y")) {
                    price = price + (price * 0.2);
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                } else if (order.equalsIgnoreCase("N")) {
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                }
            } else if (nameRestourant.equalsIgnoreCase("Asian Pub")) {
                double price = 5.50 * numberPortions;
                if (order.equalsIgnoreCase("Y")) {
                    price = price + (price * 0.2);
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                } else if (order.equalsIgnoreCase("N")) {
                    System.out.printf("Total price: %.0f lv.", Math.ceil(price));
                }
            } else {
                System.out.printf("%s is invalid restaurant!", nameRestourant);
            }
        }
    }
}
