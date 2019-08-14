import java.util.Scanner;

public class whileLoop3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String steps = in.nextLine();

        int allSteps = 10000;
        int nowSteps = 0;
        while (true) {
            if (steps.equalsIgnoreCase("going home")) {
                int num = Integer.parseInt(in.nextLine());
                nowSteps += num;
                break;
            } else {
                int num = Integer.parseInt(steps);
                nowSteps += num;

            }
            if (nowSteps >= allSteps) {
                break;
            }
            steps = in.nextLine();
        }

        if (nowSteps >= allSteps) {
            System.out.println("Goal reached! Good job!");
        } else {
            System.out.printf("%d more steps to reach goal.", (allSteps - nowSteps));
        }
    }
}