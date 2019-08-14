package Methods;

import java.util.Scanner;

public class method5 {

    public static int sum(int a, int b, int c) {

        int result = (a + b) - c;


        return result;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = Integer.parseInt(in.nextLine());
        int b = Integer.parseInt(in.nextLine());
        int c = Integer.parseInt(in.nextLine());

        int sum = sum(a, b, c);

        System.out.println(sum(a, b, c));
    }
}
