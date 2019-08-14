package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

/*
        int size = Integer.parseInt(in.nextLine());
        int[][] matrix = new int[size][];

        for (int row = 0; row< matrix.length; row++) {
            matrix[row] = new int[5];
            System.out.println(Arrays.toString(matrix[row]));
        }

        System.out.println();

        int[][] matrix2 = new int [size][];
        for (int i = 0; i < matrix2.length; i++) {
            matrix2[i] = new int[5];
            for (int j = 0; j < matrix2.length; j++) {
                matrix2[i][j] = j;
            }
            System.out.println(Arrays.toString(matrix2[i]));
*/



        int[]arrrays = IntStream.range(0,5).toArray();
        String command;
        while(!"Stop".equalsIgnoreCase(command = in.nextLine())){
            int index = Integer.parseInt(command);
            System.out.println(arrrays[Math.abs(index%arrrays.length)]);
        }
    }
}
