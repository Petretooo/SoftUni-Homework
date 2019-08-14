import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hour = Integer.parseInt(in.nextLine());
        int minutes = Integer.parseInt(in.nextLine());
        minutes = minutes + 15;

        if (minutes > 59) {
            hour = hour + 1;
            minutes = minutes - 60;
        }
        if (hour > 23) {
            hour = 0;
        }

        if (minutes < 10) {
            System.out.println(hour + ":0" + minutes);
        } else
            System.out.println(hour + ":" + minutes);
    }
}
