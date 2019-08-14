package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class arraySoftUni1 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(reader.readLine());

        String[] numbers = new String[n * 2];

        int index = 0;
        for (int i = 0; i < n; i++) {
            String[] array = reader.readLine().split(" ");

            if (i % 2 == 0) {
                numbers[index++] = array[0];
                numbers[index++] = array[1];
            } else {
                numbers[index++] = array[1];
                numbers[index++] = array[0];
            }
        }

        String firstOutput = "";
        String secondOutput = "";
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                firstOutput += numbers[i] + " ";
            } else {
                secondOutput += numbers[i] + " ";
            }
        }
        System.out.println(firstOutput);
        System.out.println(secondOutput);

    }
}
