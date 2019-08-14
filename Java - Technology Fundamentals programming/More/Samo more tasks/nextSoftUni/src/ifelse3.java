import java.util.Scanner;

public class ifelse3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = Double.parseDouble(in.nextLine());
        double y1 = Double.parseDouble(in.nextLine());
        double x2 = Double.parseDouble(in.nextLine());
        double y2 = Double.parseDouble(in.nextLine());
        double x = Double.parseDouble(in.nextLine());
        double y = Double.parseDouble(in.nextLine());

        if ((x >= x1 && x <= x2) && (y >= y1 && y <= y2)) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }
}
