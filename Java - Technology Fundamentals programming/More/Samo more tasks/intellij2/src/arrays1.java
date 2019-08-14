import java.text.MessageFormat;
import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arrays = new int[3][6];
        for (int row = 0; row < arrays.length; row++) {
            for (int col = 0; col < arrays[row].length; col++) {
                System.out.print(MessageFormat.format("Enter [{0}] [{1}]", row, col));
                arrays[row][col] = in.nextInt();
            }
        }
        methodMetrics(arrays);
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
