import java.util.Scanner;

public class exam3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int minutes = Integer.parseInt(in.nextLine());
        String name = in.nextLine();
        if (minutes == 0) {
            System.out.println("Match has just began!");
        } else if (minutes < 45) {
            System.out.println("First half time.");
        } else if (minutes >= 45) {
            System.out.println("Second half time.");
        }
        if (minutes > 1 && minutes <= 10) {
            System.out.printf("%s missed a penalty.%n", name);
            if (minutes % 2 == 0) {
                System.out.printf("%s was injured after the penalty.", name);
            }
        } else if (minutes > 10 && minutes <= 35) {
            System.out.printf("%s received yellow card.%n", name);
            if (minutes % 2 != 0) {
                System.out.printf("%s got another yellow card.", name);
            }
        } else if (minutes > 35 && minutes < 45) {
            System.out.printf("%s SCORED A GOAL !!!%n", name);
        } else if (minutes > 45 && minutes <= 55) {
            System.out.printf("%s got a freekick.%n", name);
            if (minutes % 2 == 0) {
                System.out.printf("%s missed the freekick.", name);
            }
        } else if (minutes > 55 && minutes <= 80) {
            System.out.printf("%s missed a shot from corner.%n", name);
            if (minutes % 2 != 0) {
                System.out.printf("%s has been changed with another player.", name);
            }
        } else if (minutes > 80 && minutes <= 90) {
            System.out.printf("%s SCORED A GOAL FROM PENALTY !!!", name);
        }

    }
}
