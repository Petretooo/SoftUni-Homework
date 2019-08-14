import java.util.Scanner;

public class ifelse1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String product = in.nextLine().toLowerCase();
        String city = in.nextLine().toLowerCase();
        double quantity = Double.parseDouble(in.nextLine());
        if (city.equalsIgnoreCase("Sofia")) {
            if (product.equalsIgnoreCase("coffee")) {
                quantity *= 0.5;
                System.out.println(quantity);
            } else if (product.equalsIgnoreCase("water")) {
                quantity *= 0.8;
                System.out.println(quantity);
            } else if (product.equalsIgnoreCase("beer")) {
                quantity *= 1.2;
                System.out.println(quantity);
            } else if (product.equalsIgnoreCase("sweets")) {
                quantity *= 1.45;
                System.out.println(quantity);
            } else if (product.equalsIgnoreCase("peanuts")) {
                quantity *= 1.6;
                System.out.println(quantity);
            }
        } else if (city.equalsIgnoreCase("Plovdiv")) {
            if (product.equalsIgnoreCase("coffee")) {
                quantity *= 0.4;
                System.out.println(quantity);
            } else if (product.equalsIgnoreCase("water")) {
                quantity *= 0.70;
                System.out.println(quantity);
            } else if (product.equalsIgnoreCase("beer")) {
                quantity *= 1.15;
                System.out.println(quantity);
            } else if (product.equalsIgnoreCase("sweets")) {
                quantity *= 1.30;
                System.out.println(quantity);
            } else if (product.equalsIgnoreCase("peanuts")) {
                quantity *= 1.50;
                System.out.println(quantity);
            }
        } else if (city.equalsIgnoreCase("Varna")) {
            if (product.equalsIgnoreCase("coffee")) {
                quantity *= 0.45;
                System.out.println(quantity);
            } else if (product.equalsIgnoreCase("water")) {
                quantity *= 0.7;
                System.out.println(quantity);
            } else if (product.equalsIgnoreCase("beer")) {
                quantity *= 1.10;
                System.out.println(quantity);
            } else if (product.equalsIgnoreCase("sweets")) {
                quantity *= 1.35;
                System.out.println(quantity);
            } else if (product.equalsIgnoreCase("peanuts")) {
                quantity *= 1.55;
                System.out.println(quantity);
            }
        }
    }
}