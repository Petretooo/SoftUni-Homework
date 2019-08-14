import java.text.MessageFormat;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print(MessageFormat.format("Enter {0} {1}", i, "number"));
            array[i] = in.nextInt();
        }
        boolean isSymetric = true;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[n - 1 - i]) ;
            {
                isSymetric = false;
                break;
            }
        }
        System.out.println("The array is symetric " + isSymetric);
    }
}
