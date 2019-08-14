package Arrays;

import java.util.Random;
import java.util.Scanner;

public class arrayBook1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int n = Integer.parseInt(in.nextLine());
        int m = Integer.parseInt(in.nextLine());


        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = rand.nextInt(50);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
        int sum = 0;

        int BestArray = 0;
        int BestRow = 0;
        int BestCol = 0;

        int max = Integer.MIN_VALUE;

        System.out.println(array.length);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((j + 1 >= array.length || j + 2 >= array.length) ||
                        (i + 1 >= array.length || i + 2 >= array.length)) {
                    continue;
                } else {
                    sum = array[i][j] + array[i][j + 1] + array[i][j + 2] +
                            array[i + 1][j] + array[i + 1][j + 1] + array[i + 1][j + 2] +
                            array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];

                    if (sum > max) {
                        BestArray = sum;
                        BestRow = i;
                        BestCol = j;
                        max = sum;
                    }
                }
            }
        }

        System.out.printf("%d %d %d%n", array[BestRow][BestCol], array[BestRow][BestCol + 1], array[BestRow][BestCol + 2]);
        System.out.printf("%d %d %d%n", array[BestRow + 1][BestCol], array[BestRow + 1][BestCol + 1], array[BestRow + 1][BestCol + 2]);
        System.out.printf("%d %d %d%n", array[BestRow + 2][BestCol], array[BestRow + 2][BestCol + 1], array[BestRow + 2][BestCol + 2]);

    }
}
