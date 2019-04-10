package StringAndRegular_Practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] words = in.nextLine().split(", ");


        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (isTrue(word)) {
                System.out.println(word);
            }
        }


    }

    static boolean isTrue(String word) {

        if (word.length() < 3 && word.length() > 16) {
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
