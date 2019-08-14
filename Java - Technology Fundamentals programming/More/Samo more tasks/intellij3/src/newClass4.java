import java.util.Scanner;

public class newClass4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] array = new int[n];
        int max = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
                max = Math.max(max, count);

            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }

        System.out.println(max);

    }
}
