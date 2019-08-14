import java.util.Arrays;
import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);/*
        int n = Integer.parseInt(in.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
            array[i] *= 5;
        }
        System.out.println(Arrays.toString(array));*/

        int n = Integer.parseInt(in.nextLine());
        int[] array1 = new int[n];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter numbers to first array: ");
            array1[i] = in.nextInt();
        }
        System.out.println();
        int[] array2 = new int[n];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter numbers to second array: ");
            array2[i] = in.nextInt();
        }
        boolean isTrue = false;
        if (Arrays.equals(array1, array2)) {
            isTrue = true;
        }
        System.out.println(isTrue);


    }
}
