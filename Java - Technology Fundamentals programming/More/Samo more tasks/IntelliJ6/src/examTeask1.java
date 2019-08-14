import java.util.Scanner;

public class examTeask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int num = Integer.parseInt(in.nextLine());

        String x = "";

        int counter = 0;
        int sum = 0;

        while (!x.equalsIgnoreCase("enough")) {

            x = in.nextLine();

            if (x.equalsIgnoreCase("enough")) {
                break;
            }

            if (x.equalsIgnoreCase("enter")) {

                int number = 0;
                String y = "";

                while (!y.equalsIgnoreCase("leave")) {

                    y = in.nextLine();
                    if (y.equalsIgnoreCase("leave")) {
                        break;
                    }
                    number = Integer.parseInt(y);
                    if (sum + number > num) {
                        System.out.println("Not enough money.");
                    } else {
                        counter++;
                        sum += number;
                    }
                    if (sum >= num) {
                        break;
                    }
                }
                if (sum >= num) {
                    break;
                }
            }

        }
        System.out.printf("For %d clothes I spent %d lv and have %d lv left.%n", counter, sum, Math.abs(num - sum));
    }
}