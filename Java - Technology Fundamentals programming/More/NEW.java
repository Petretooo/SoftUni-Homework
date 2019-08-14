import java.util.Scanner;

public class NEW {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] prices =
                {10, 10,
                        10, 10,
                        10, 10};
        String put = "";
        System.out.print("Possition: ");
        int possition = Integer.parseInt(in.nextLine());
        double sum = prices[possition];
        while (!put.equalsIgnoreCase("stop")) {
            put = in.nextLine();
            if (put.equalsIgnoreCase("L")) {
                if (possition == 0) {
                    System.out.println("You can not move left!");
                } else {
                    possition = possition - 1;
                    sum += prices[possition];
                    prices[possition] = 0;
                }
            } else if (put.equalsIgnoreCase("R")) {
                if (possition == 5) {
                    System.out.println("You can not move right!");
                } else {
                    possition = possition + 1;
                    sum += prices[possition];
                    prices[possition] = 0;
                }
            }
        }
        System.out.println(sum);
    }

}
