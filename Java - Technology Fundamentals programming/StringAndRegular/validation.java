package StringAndRegular;

import java.util.Scanner;

public class validation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] words = in.nextLine().split(", ");

        for (String word : words) {
            if (validateWord(word)) {
                System.out.println(word);
            }
        }

    }


    private static boolean validateWord(String word) {

        if (word.length() < 3 || word.length() > 16) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetterOrDigit(word.charAt(i)) && word.charAt(i) != '-' && word.charAt(i) != '_') {
                return false;
            }

        }
        return true;
    }

}
