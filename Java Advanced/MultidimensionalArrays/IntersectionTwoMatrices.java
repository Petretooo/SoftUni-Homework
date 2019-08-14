package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionTwoMatrices {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int rows = Integer.parseInt(in.nextLine());
        int cols = Integer.parseInt(in.nextLine());

        char[][] firstMatrix = new char[rows][cols];
        char[][] secondMatrix = new char[rows][cols];

        for (int i = 0; i < rows*2; i++) {
            String[] elements = in.nextLine().split("\\s+");

            for (int col = 0; col < elements.length; col++) {
                if(i < rows){
                    firstMatrix[i][col] = elements[col].charAt(0);
                }else {
                    secondMatrix[i-rows][col] = elements[col].charAt(0);
                }

            }

        }

        char[][] resultMatrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char firstElement = firstMatrix[row][col];
                char secondElement = secondMatrix[row][col];

                if(firstElement != secondElement){
                    resultMatrix[row][col] = '*';
                    continue;
                }
                resultMatrix[row][col] = firstElement;

            }

        }

        for (char[] matrix : resultMatrix) {
            System.out.println(Arrays.toString(matrix).replaceAll("\\[|\\]|,",""));
        }

    }
}
