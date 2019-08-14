import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double firstBrother = Double.parseDouble(in.nextLine());
        double secondBrother = Double.parseDouble(in.nextLine());
        double thirdBrother = Double.parseDouble(in.nextLine());
        double fishingDad = Double.parseDouble(in.nextLine());
        double brotherTime = 1 / ((1 / firstBrother) + (1 / secondBrother) + (1 / thirdBrother));
        double timeWithFreedom = brotherTime + (brotherTime * 0.15);
        double time = fishingDad - timeWithFreedom;
        if (time > 0) {
            System.out.printf("Cleaning time: %.2f%n", timeWithFreedom);
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.", Math.floor(time));
        } else if (time < 0) {
            System.out.printf("Cleaning time: %.2f%n", timeWithFreedom);
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.", Math.abs(Math.floor(time)));
        }
    }
}
