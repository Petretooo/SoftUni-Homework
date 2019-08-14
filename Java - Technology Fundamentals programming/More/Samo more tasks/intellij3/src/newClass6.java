import java.util.Arrays;
import java.util.Scanner;

public class newClass6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int k = Integer.parseInt(in.nextLine());
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        Arrays.sort(array);
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - i - 1];
        }
        for (int i = 0; i < k; i++) {
            sum += reversed[i];
        }
        System.out.println(sum);
    }
}
