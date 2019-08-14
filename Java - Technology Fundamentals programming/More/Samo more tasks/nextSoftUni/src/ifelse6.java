import java.util.Scanner;

public class ifelse6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String city = in.nextLine();
        double v = Double.parseDouble(in.nextLine());

        if (v > 0 && v <= 500) {
            if (city.equalsIgnoreCase("Sofia")) {
                v *= 0.05;
                System.out.printf("%.2f", v);
            } else if (city.equalsIgnoreCase("varna")) {
                v *= 0.045;
                System.out.printf("%.2f", v);
            } else if (city.equalsIgnoreCase("plovdiv")) {
                v *= 0.055;
                System.out.printf("%.2f", v);
            } else {
                System.out.println("error");
            }
        } else if (v > 500 && v <= 1000) {
            if (city.equalsIgnoreCase("Sofia")) {
                v *= 0.07;
                System.out.printf("%.2f", v);
            } else if (city.equalsIgnoreCase("varna")) {
                v *= 0.075;
                System.out.printf("%.2f", v);
            } else if (city.equalsIgnoreCase("plovdiv")) {
                v *= 0.08;
                System.out.printf("%.2f", v);
            } else {
                System.out.println("error");
            }
        } else if (v > 1000 && v <= 10000) {
            if (city.equalsIgnoreCase("Sofia")) {
                v *= 0.08;
                System.out.printf("%.2f", v);
            } else if (city.equalsIgnoreCase("varna")) {
                v *= 0.1;
                System.out.printf("%.2f", v);
            } else if (city.equalsIgnoreCase("plovdiv")) {
                v *= 0.12;
                System.out.printf("%.2f", v);
            } else {
                System.out.println("error");
            }

        } else if (v > 10000) {
            if (city.equalsIgnoreCase("Sofia")) {
                v *= 0.12;
                System.out.printf("%.2f", v);
            } else if (city.equalsIgnoreCase("varna")) {
                v *= 0.13;
                System.out.printf("%.2f", v);
            } else if (city.equalsIgnoreCase("plovdiv")) {
                v *= 0.145;
                System.out.printf("%.2f", v);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
