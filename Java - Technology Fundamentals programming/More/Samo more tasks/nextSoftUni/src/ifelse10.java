import java.util.Scanner;

public class ifelse10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int degree = Integer.parseInt(in.nextLine());
        String time = in.nextLine();

        if (degree >= 10 && degree <= 18) {
            if (time.equalsIgnoreCase("morning")) {
                System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", degree);
            } else if (time.equalsIgnoreCase("afternoon")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
            } else if (time.equalsIgnoreCase("evening")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
            }
        } else if (degree > 18 && degree <= 24) {
            if (time.equalsIgnoreCase("morning")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
            } else if (time.equalsIgnoreCase("afternoon")) {
                System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degree);
            } else if (time.equalsIgnoreCase("evening")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
            }
        } else if (degree >= 25) {
            if (time.equalsIgnoreCase("morning")) {
                System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degree);
            } else if (time.equalsIgnoreCase("afternoon")) {
                System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.", degree);
            } else if (time.equalsIgnoreCase("evening")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
            }
        }

    }
}
