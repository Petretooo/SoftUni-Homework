import java.util.Scanner;

public class Exam7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = Integer.parseInt(in.nextLine());
        int counter = 1;

        for (char i = 'B'; i <= 'L'; i++) {
            for (char j = 'f'; j >= 'a'; j--) {
                for (char q = 'A'; q <= 'C'; q++) {
                    for (int k = 1; k <= 10; k++) {
                        for (int l = 10; l >= 1; l--) {

                            if (i % 2 == 0) {

                                if (counter == number) {
                                    System.out.printf("Ticket combination: %c%c%c%d%d%n", i, j, q, k, l);
                                    System.out.printf("Prize: %d lv.", i + j + q + k + l);
                                }

                                counter++;

                            }
                        }
                    }
                }
            }
        }
    }
}
