package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class arraySoftUni6 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = Arrays.stream(in.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int n = Integer.parseInt(in.nextLine());


        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    continue;
                }
                if ((array[i] + array[j] == n)) {
                    System.out.printf("%d %d%n", array[i], array[j]);
                }
            }
            /*if(array[i] == n){
                System.out.printf("%d", array[i]);
            }*/
        }

    }
}
