import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr1 = {11, 32, 443, 4};
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
