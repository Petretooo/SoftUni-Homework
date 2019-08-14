import java.util.Arrays;
import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 3;
        int[] arr = {0, 1, 4, 113, 55, 3, 1, 2, 66, 557, 124, 2};
        int[] sizes = new int[n];
        System.out.println(Arrays.toString(sizes));
        for (int i = 0; i < arr.length; i++) {
            int remainder = arr[i] % n;
            switch (remainder) {
                case 0:
                    sizes[0]++;
                    break;
                case 1:
                    sizes[1]++;
                    break;
                case 2:
                    sizes[2]++;
                    break;
            }
        }
//        System.out.println(Arrays.toString(sizes));
        int[][] jagged = new int[3][];
        for (int i = 0; i < arr.length; i++) {
            jagged[i] = new int[sizes[i]];
        }
        for (int i = 0, j = 0, k = 0, l = 0; i < arr.length; i++) {
            int remainder = arr[i] % 3;
            switch (remainder) {
                case 0:
                    jagged[0][j] = arr[i];
                    j++;
                    break;
                case 1:
                    jagged[1][k] = arr[i];
                    k++;
                    break;
                case 2:
                    jagged[2][l] = arr[i];
                    l++;
                    break;
            }

        }

        methodMetrics(jagged);
    }

    private static void methodMetrics(int[][] arrays) {
        for (int row = 0; row < arrays.length; row++) {
            for (int col = 0; col < arrays[row].length; col++) {
                System.out.print(arrays[row][col] + " | ");
            }
            System.out.println();
        }
    }
}
