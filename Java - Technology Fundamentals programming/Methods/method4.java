package Methods;

import java.util.Scanner;

public class method4 {

    private static void matrix(int n, int[][] array) {

        inputMatrix(n, array);


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }

    private static void inputMatrix(int n, int[][] array) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = n;
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = Integer.parseInt(in.nextLine());

        int[][] array = new int[number][number];

        matrix(number, array);

    }
}
