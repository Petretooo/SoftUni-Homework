import java.util.Scanner;

public class newOne2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (result < array[i]) {
                result = array[i];
            }

        }

        System.out.println(result);


    }
}
