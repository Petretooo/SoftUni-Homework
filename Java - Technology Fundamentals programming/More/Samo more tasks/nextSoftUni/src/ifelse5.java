import java.util.Scanner;

public class ifelse5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //banana apple orange grapefruit
        //kiwi pineapple grapes


        //2.50     1.20     0.85    1.45    2.70   5.50     3.85


        String fruit = in.nextLine();
        String day = in.nextLine();
        Double quantity = Double.parseDouble(in.nextLine());

        if (day.equalsIgnoreCase("monday") ||
                day.equalsIgnoreCase("tuesday") ||
                day.equalsIgnoreCase("wednesday") ||
                day.equalsIgnoreCase("thursday") ||
                day.equalsIgnoreCase("friday")) {
            if (fruit.equalsIgnoreCase("banana")) {
                quantity *= 2.5;
                System.out.println(quantity);
            } else if (fruit.equalsIgnoreCase("apple")) {
                quantity *= 1.2;
                System.out.println(quantity);
            } else if (fruit.equalsIgnoreCase("orange")) {
                quantity *= 0.85;
                System.out.println(quantity);
            } else if (fruit.equalsIgnoreCase("grapefruit")) {
                quantity *= 1.45;
                System.out.println(quantity);
            } else if (fruit.equalsIgnoreCase("kiwi")) {
                quantity *= 2.70;
                System.out.println(quantity);
            } else if (fruit.equalsIgnoreCase("pineapple")) {
                quantity *= 5.5;
                System.out.println(quantity);
            } else if (fruit.equalsIgnoreCase("grapes")) {
                quantity *= 3.85;
                System.out.println(quantity);
            } else {
                System.out.println("error");
            }
            //2.70 1.25 0.90 1.60 3.00 5.60 4.20
        } else if (day.equalsIgnoreCase("saturday") ||
                day.equalsIgnoreCase("sunday")) {
            if (fruit.equalsIgnoreCase("banana")) {
                quantity *= 2.7;
                System.out.println(quantity);
            } else if (fruit.equalsIgnoreCase("apple")) {
                quantity *= 1.25;
                System.out.println(quantity);
            } else if (fruit.equalsIgnoreCase("orange")) {
                quantity *= 0.9;
                System.out.println(quantity);
            } else if (fruit.equalsIgnoreCase("grapefruit")) {
                quantity *= 1.60;
                System.out.println(quantity);
            } else if (fruit.equalsIgnoreCase("kiwi")) {
                quantity *= 3;
                System.out.println(quantity);
            } else if (fruit.equalsIgnoreCase("pineapple")) {
                quantity *= 5.6;
                System.out.println(quantity);
            } else if (fruit.equalsIgnoreCase("grapes")) {
                quantity *= 4.20;
                System.out.println(quantity);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
