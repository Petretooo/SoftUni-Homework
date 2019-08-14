import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double age = Double.parseDouble(in.nextLine());
        String sex = in.nextLine();
        if (age < 16) {
            if (sex.equalsIgnoreCase("m")) {
                System.out.println("Master");
            } else if (sex.equalsIgnoreCase("f")) {
                System.out.println("Miss");
            }
        } else if (age >= 16) {
            if (sex.equalsIgnoreCase("m")) {
                System.out.println("Mr.");
            } else {
                System.out.println("Ms.");
            }
        }
    }
}
