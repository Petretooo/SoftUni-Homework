package Arrays;

import java.util.Random;
import java.util.Scanner;

public class arrayBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random(System.currentTimeMillis());
        int index = Integer.parseInt(in.nextLine());

        int[] array = new int[index];

     /*   for(int i = 0 ; i < array.length ; i++){
            array[i] = rand.nextInt(1000);
        }
*/
        for (int i : array) {
            System.out.println(i);
        }

    }
}
