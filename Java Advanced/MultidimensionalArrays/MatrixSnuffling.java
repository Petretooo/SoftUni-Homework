package MultidimensionalArrays;

import java.util.Scanner;

public class MatrixSnuffling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] numbers = in.nextLine().split("\\s+");
        int rows = Integer.parseInt(numbers[0]);
        int cols = Integer.parseInt(numbers[1]);

        String [][] matrix = new String[rows][cols];

        for (int r = 0; r < rows; r++) {
            matrix[r] = in.nextLine().split("\\s+");
        }
        String input = in.nextLine();
        while (!input.equalsIgnoreCase("END")){

            String[] tokens = input.split("\\s+");
            if(tokens[0].equalsIgnoreCase("swap")  && tokens.length == 5){
                int firstRow = Integer.parseInt(tokens[1]);
                int firstCol = Integer.parseInt(tokens[2]);
                int secondRow = Integer.parseInt(tokens[3]);
                int secondCol = Integer.parseInt(tokens[4]);
                if (isInBounds(matrix,firstRow,firstCol) && isInBounds(matrix,secondRow,secondCol)){
                    String temp = matrix[firstRow][firstCol];
                    matrix[firstRow][firstCol] = matrix[secondRow][secondCol];
                    matrix[secondRow][secondCol] = temp;

                    printMatrix(matrix);
                }else {
                    System.out.println("Invalid input!");
                }
            }else {
                System.out.println("Invalid input!");
            }

            input = in.nextLine();
        }

}

    private static void printMatrix(String[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");

            }
            System.out.println();

        }
    }

    private static boolean isInBounds(String[][] matrix, int row, int col) {


        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }
}
