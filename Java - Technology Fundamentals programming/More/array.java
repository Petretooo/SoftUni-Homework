import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int row = 3, col = 3, counter = 1;
        boolean isTrue = true;
        int[][] array = new int[row][col];
        for (int i = 0; i <= col - 1; i++) {
            if (isTrue) {
                for (int j = 0; j <= row - 1; j++) {
                    array[j][i] = counter;
                    counter++;
                }
                isTrue = false;
            } else {
                for (int j = row - 1; j >= 0; j--) {
                    array[j][i] = counter;
                    counter++;
                }
                isTrue = true;
            }
        }
        for (int j = 0; j <= row - 1; j++) {
            for (int i = 0; i <= col - 1; i++) {
                System.out.print(array[j][i]);
            }
            System.out.println();
        }
    }
}
