package StringAndRegular_Practice;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        String[] words = in.nextLine().split("\\s+");

        String firstWord = words[0];
        String secondWord = words[1];

        System.out.println(sumOfWords(firstWord, secondWord));
    }

    static int sumOfWords(String a, String b) {
        int minLenght = Math.min(a.length(), b.length());
        int sum = 0;

        for (int i = 0; i < minLenght; i++) {
            sum += a.charAt(i) * b.charAt(i);
        }

        String maxLenght = a;
        if (b.length() > a.length()) {
            maxLenght = b;
        }

        for (int i = minLenght; i < maxLenght.length(); i++) {
            sum += maxLenght.charAt(i);
        }
        return sum;
    }
}
