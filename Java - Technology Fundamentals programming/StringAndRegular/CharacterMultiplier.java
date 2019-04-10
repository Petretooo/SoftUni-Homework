package StringAndRegular;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();

        String firstWord = text.substring(0, text.indexOf(' '));
        String secondWord = text.substring(text.lastIndexOf(' ') + 1);


        System.out.println(multiplyCharacters(firstWord, secondWord));
    }

    private static int multiplyCharacters(String first, String second) {
        int minLenght = Math.min(first.length(), second.length());
        int sum = 0;

        for (int i = 0; i < minLenght; i++) {
            sum += first.charAt(i) * second.charAt(i);
        }

        String maxLenght = first.length() < second.length() ? second : first;

        for (int i = minLenght; i < maxLenght.length(); i++) {
            sum += maxLenght.charAt(i);
        }
        return sum;
    }
}
