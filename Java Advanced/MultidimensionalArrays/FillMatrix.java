package MultidimensionalArrays;

import java.util.Scanner;

public class FillMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] input = in.nextLine().split(", ");

        int size = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix;


        if(pattern.equalsIgnoreCase("A")) {

            matrix = generateMatrixWithPatternA(size);


        }else {

            matrix = generateMatrixWithPatternB(size);

        }

        printMatrix(matrix);

    }

    private static void printMatrix(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();

        }
    }
    private static int[][] generateMatrixWithPatternB(int size) {
        int[][] matrix = new int[size][size];

        int value = 1;
        for (int col = 0; col < size; col++) {
            if(col % 2 == 0) {
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = value;
                    value++;
                }
            }else {
                for (int row = size-1; row >= 0; row--) {
                    matrix[row][col] = value;
                    value++;
                }
            }
        }
        return matrix;
    }

    private static int[][] generateMatrixWithPatternA(int size) {
        int[][] matrix = new int[size][size];

        int value = 1;
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] = value;
                value++;
            }
        }


        return matrix;
    }
}
