package Methods;

import java.util.Scanner;

public class mathods1 {

    private static int vowels(String a) {

        int counter = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' ||
                    a.charAt(i) == 'e' ||
                    a.charAt(i) == 'i' ||
                    a.charAt(i) == 'o' ||
                    a.charAt(i) == 'u') {

                counter++;

            } else if (a.charAt(i) == 'A' ||
                    a.charAt(i) == 'E' ||
                    a.charAt(i) == 'I' ||
                    a.charAt(i) == 'O' ||
                    a.charAt(i) == 'U') {

                counter++;

            }


        }

        return counter;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();


        System.out.println(vowels(word));

    }
}
