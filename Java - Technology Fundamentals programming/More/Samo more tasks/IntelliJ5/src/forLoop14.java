import java.util.Scanner;

public class forLoop14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        String dance = "";
        int counter = 0;
        int counter1 = 0;

        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;

        while (!dance.equalsIgnoreCase("finish")) {

            dance = in.nextLine();
            if (dance.equalsIgnoreCase("finish")) {
                break;
            }
            for (int i = 0; i < n; i++) {
                double steps = Double.parseDouble(in.nextLine());

                counter++;
                counter1++;
                sum1 += steps;

                sum3 += steps;

                if (counter == n) {
                    sum2 = sum1 / n;
                    System.out.printf("%s - %.2f.%n", dance, sum2);
                    sum1 = 0;
                    sum2 = 0;
                    counter = 0;
                }

            }


        }
        sum3 = sum3 / counter1;
        System.out.printf("Student's final assessment is %.2f.", sum3);
    }
}
