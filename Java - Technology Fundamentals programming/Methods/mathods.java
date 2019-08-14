package Methods;

import java.util.Scanner;

public class mathods {


    private static int smallestofThreeNumbers(int a, int b) {

        int min = 0;

        min = Math.min(a, b);

        return min;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = Integer.parseInt(in.nextLine());
        int b = Integer.parseInt(in.nextLine());
        int c = Integer.parseInt(in.nextLine());

        int min = Math.min(smallestofThreeNumbers(a, b), c);

        System.out.println(min);
    }
}
