package StringAndRegular;

import java.util.Scanner;

public class CeaserCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String oldWord = in.nextLine();
        int newWord;
        for (int i = 0; i < oldWord.length(); i++) {
            newWord = oldWord.charAt(i) + 3;
            System.out.print((char) newWord);
        }
    }
}
