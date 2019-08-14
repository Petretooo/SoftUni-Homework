import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double recordSecond = Double.parseDouble(in.nextLine());
        double meters = Double.parseDouble(in.nextLine());
        double timeInSecondForMeter = Double.parseDouble(in.nextLine());

        double needSwim = meters * timeInSecondForMeter;
        double slowing = (meters / 15);
        slowing = Math.floor(slowing) * 12.5;
        double totalTime = needSwim + slowing;

        if (totalTime < recordSecond) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", (Math.abs(totalTime - recordSecond)));
        }
    }
}
