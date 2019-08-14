import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class newClass7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] array = new int[n];
        int count = 0;
        int temp = 1;
        int foundNumber = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                temp++;
            } else {
                temp = 1;
            }
            if (temp > count) {
                count = temp;
                foundNumber = array[i];
            }
        }

        System.out.printf("%d %d", foundNumber, count);

    }
}
