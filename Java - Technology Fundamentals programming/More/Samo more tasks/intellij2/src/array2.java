import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i : array) {
            System.out.print(i + " + ");
            sum += i;
        }
        System.out.print(" = " + sum);


    }

}
