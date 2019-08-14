package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arraySoftUni4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < input.length; i++) {
            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }


            int rightSum = 0;
            for (int j = i + 1; j < input.length; j++) {
                rightSum += numbers[j];
            }

            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            }

        }
        System.out.println("no");

    }
}
