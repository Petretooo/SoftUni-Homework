package StringAndRegular_Practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterChangeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] words = in.nextLine().split("\\s+");

        Pattern pattern = Pattern.compile("([A-Za-z])([\\d]+)([A-Za-z])");

        String alphabet = " abcdefghijklmnopqrstuvwxyz";

        double sum = 0.0;

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            Matcher matcher = pattern.matcher(word);
            double sumy = 0.0;
            while(matcher.find()){

                String leftWord = matcher.group(1);
                sumy = Double.parseDouble(matcher.group(2));
                String rightWord = matcher.group(3);


                if(leftWord.equals(leftWord.toLowerCase())){
                    sumy *= alphabet.indexOf(leftWord.toLowerCase());
                }else if(leftWord.equals(leftWord.toUpperCase())) {
                    sumy /= alphabet.indexOf(leftWord.toLowerCase());
                }

                if(rightWord.equals(rightWord.toLowerCase())){
                    sumy += alphabet.indexOf(rightWord.toLowerCase());
                }else if(rightWord.equals(rightWord.toUpperCase())){
                    sumy -= alphabet.indexOf(rightWord.toLowerCase());
                }
            }

            sum+= sumy;

        }


        System.out.println(String.format("%.2f", sum));
    }
}
