package Arrays;

import java.util.Scanner;

public class arraySoftUni {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        int sum = 0;
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(in.nextLine());
            sum += array[i];
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println(sum);


    }
}
