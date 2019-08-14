package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixPalindromes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] numbers = in.nextLine().split("\\s+");
        int rows = Integer.parseInt(numbers[0]);
        int cols = Integer.parseInt(numbers[1]);

        String[][] matrix = new String[rows][cols];

        char firstChar = 'a';
        char secondChar = 'a';
        char thirdChar = 'a';
        for (int row = 0; row < matrix.length; row++) {
            char temp = secondChar;
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = firstChar+""+temp+""+thirdChar;
                temp++;
            }
            firstChar++;
            secondChar++;
            thirdChar++;

        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }
    }
}
