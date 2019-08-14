import java.util.Scanner;

public class whileLoop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        while (!input.equalsIgnoreCase("end")) {
            int num = Integer.parseInt(input);
            if (num > maxNum) {
                maxNum = num;
            }
            if (num < minNum) {
                minNum = num;
            }

            input = in.nextLine();


        }

        System.out.printf("Max number: %d%n", maxNum);
        System.out.printf("Min number: %d", minNum);
    }
}
