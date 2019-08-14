package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.nextLine());
        String[] arrayInt = reader.readLine().split(" ");

        int arrLenght = arrayInt.length;
        String tempElement = arrayInt[0];
        int tempLength = 1;
        int maxLength = 0;
        String element = "";

        for (int i = 1; i < arrLenght; i++) {
            if (arrayInt[i] == tempElement) {
                tempLength++;
            } else {
                if (tempLength > maxLength) {
                    element = arrayInt[i - 1];
                    maxLength = tempLength;
                }
                tempLength = 1;
            }
        }

        for (int i = 0; i < maxLength; i++) {
            System.out.println(element + " ");
        }


    }
}
