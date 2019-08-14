package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixSum {
    private static int[][] matrix;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] numers = in.nextLine().split("\\s+");

        int rows = Integer.parseInt(numers[0]);
        int cols = Integer.parseInt(numers[1]);

        matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(in.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }
        int maxSum = -1;
        int rowIndex = -1;
        int colIndex = -1;
        for (int row = 1; row < rows-1; row++) {
            for (int col = 1; col < cols-1; col++) {
                int currentSum = getMatrixSum(row, col);
                if(currentSum > maxSum){
                    maxSum = currentSum;
                    rowIndex=row;
                    colIndex=col;
                }
            }
            
        }
        System.out.println("Sum = " + maxSum);
        printMatrixByGivenCell(rowIndex,colIndex);

    }

    private static void printMatrixByGivenCell(int rowIndex, int colIndex) {
        if(rowIndex == -1 || colIndex == -1){
            System.out.println("Result Not Found!");
        }else {
            int beginRow = rowIndex -1;
            int beginCol = colIndex -1;

            for (int r = beginRow; r < beginRow + 3; r++) {
                for (int c = beginCol; c < beginCol + 3; c++) {
                    System.out.print(matrix[r][c]+" ");

                }
                System.out.println();
            }
        }
    }

    private static int getMatrixSum(int row, int col) {
        int sum = 0;

        sum +=matrix[row][col];
        sum +=matrix[row-1][col];
        sum +=matrix[row+1][col];
        sum +=matrix[row][col-1];
        sum +=matrix[row][col+1];
        sum +=matrix[row-1][col-1];
        sum +=matrix[row+1][col+1];
        sum +=matrix[row+1][col-1];
        sum +=matrix[row-1][col+1];

        return sum;
    }
}
