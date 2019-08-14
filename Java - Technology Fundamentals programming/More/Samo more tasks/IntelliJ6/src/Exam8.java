import java.util.Scanner;

public class Exam8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String team = in.nextLine();
        int matches = Integer.parseInt(in.nextLine());

        double sum = 0;
        int counter1 = 0, counter2 = 0;


        for (int i = 1; i <= matches; i++) {
            int time = Integer.parseInt(in.nextLine());
            sum += time;

            if (time > 90 && time <= 120) {
                counter1++;
            } else if (time > 120) {
                counter2++;
            }

        }
        System.out.printf("%s has played %.0f minutes. Average minutes per game: %.2f%n%n", team, sum, (sum / matches));
        System.out.printf("Games with penalties: %d%n", counter2);
        System.out.printf("Games with additional time: %d%n", counter1);

    }
}
