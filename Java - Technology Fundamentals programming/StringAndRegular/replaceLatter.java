package StringAndRegular;

import java.util.Scanner;

public class replaceLatter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();


        for (int i = 0; i < word.length(); i++) {

            char currentChar = word.charAt(i);

            try {
                if (word.charAt(i + 1) != currentChar) {
                    System.out.print(currentChar);
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println(currentChar);
            }


        }
    }
}
