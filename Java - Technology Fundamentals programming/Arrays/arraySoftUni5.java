package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class arraySoftUni5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        String[] array = reader.readLine().split(" ");

        String number = "";
        int counter = 0;
        int counter1 = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length - 1; i++) {

            if (array[i].equals(array[i + 1])) {
                counter++;
            } else {
                counter = 0;
                continue;
            }


            if (counter < counter1) {
                max = counter1;
            } else if (counter1 < counter) {
                counter1 = counter;
                max = counter;
                number = array[i];
            }

        }

        for (int i = 0; i <= max; i++) {
            System.out.printf(number + " ");
        }

    }
}
