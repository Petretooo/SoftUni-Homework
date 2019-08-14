import java.util.Scanner;

public class whileLoop5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int v = Integer.parseInt(in.nextLine());
        int sum = 0;

        int counter = 0;
        while (true) {
            String enter = in.nextLine();
            counter++;
            if (enter.equalsIgnoreCase("hard")) {
                sum += 200;
            } else if (enter.equalsIgnoreCase("medium")) {
                sum += 100;
            } else if (enter.equalsIgnoreCase("easy")) {
                sum += 50;
            }
            if (v == sum) {
                System.out.printf("The dispenser has been tapped %d times.", counter);
                return;
            }
            if (sum > v) {
                int spilled = sum - v;
                System.out.printf("%dml has been spilled.", Math.abs(spilled));
                return;
            }
        }
    }
}
