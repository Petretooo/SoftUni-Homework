package StringAndRegular_Practice;

import java.io.StringReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deciphering {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        Pattern pattern = Pattern.compile("^[d-z#{},\\|]*$");

        String[] twoWords = in.nextLine().split("\\s+");

        Matcher matcher = pattern.matcher(word);

        if(!matcher.find()){
            System.out.println("This is not the book you are looking for.");
        }else {
            String newWord = "";
            for (int i = 0; i < word.length(); i++) {
                newWord += String.valueOf(Character.valueOf((char) (word.charAt(i)-3)));
            }



            newWord = newWord.replaceAll(twoWords[0],twoWords[1]);


            System.out.println(newWord);
        }

    }
}
