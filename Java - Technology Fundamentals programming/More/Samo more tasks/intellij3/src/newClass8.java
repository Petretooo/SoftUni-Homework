import java.util.Scanner;

public class newClass8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int k = Integer.parseInt(in.nextLine());
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                sum += array[i];
                if (sum == k) {
                    System.out.println("Yes" + k);
                    break;
                }
            }
        }
    }
}
