import java.sql.SQLOutput;
import java.util.Scanner;

public class ifelse14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hourExam = Integer.parseInt(in.nextLine());
        int minuteExam = Integer.parseInt(in.nextLine());
        int arrivalHour = Integer.parseInt(in.nextLine());
        int arrivalMinute = Integer.parseInt(in.nextLine());

        int examTime = (hourExam * 60) + minuteExam;
        int arriveTime = (arrivalHour * 60) + arrivalMinute;

        int diffTime = arriveTime - examTime;
        int seconDiff = examTime - arriveTime;

        if (diffTime > 0 && diffTime <= 59) {
            System.out.println("Late");
            System.out.printf("%d minutes after the start", diffTime);
        } else if (diffTime > 60) {
            int hour = diffTime / 60;
            int minutes = diffTime % 60;
            System.out.println("Late");
            System.out.printf("%d:%d hours after the start", hour, minutes);
        } else if (seconDiff == 0) {
            System.out.println("On time");
        } else if (seconDiff > 0 && seconDiff <= 30) {
            System.out.println("Late");
            System.out.printf("%d hours after the start", seconDiff);
        } else if (seconDiff > 30 && seconDiff < 60) {
            System.out.println("Early");
            System.out.printf("%d minutes before the start", seconDiff);
        } else if (seconDiff >= 60) {
            int hour = seconDiff / 60;
            int minutes = seconDiff % 60;
            System.out.println("Early");
            System.out.printf("%d:%d hours after the start", hour, minutes);

        }
    }
}
