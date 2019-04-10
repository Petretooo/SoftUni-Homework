package StringAndRegular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterChangeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] word = in.nextLine().split("\\+");

        Pattern pattern = Pattern.compile("([A-Za-z])(\\d+)([A-Za-z])");

        String alphabet = " abcdefghijklmnopqrstuvwxyz";

        double sum = 0.0;

        for (String text : word) {
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                String leftSymbol = matcher.group(1);
                double number = Double.parseDouble(matcher.group(2));
                String rightSymbol = matcher.group(3);


                if (leftSymbol.equals(leftSymbol.toLowerCase())) {
                    number *= alphabet.indexOf(leftSymbol.toLowerCase());
                } else {
                    //                  if(number != 0){
                    number /= alphabet.indexOf(leftSymbol.toLowerCase());
                    //                  }
                }

                if (rightSymbol.equals((rightSymbol.toLowerCase()))) {
                    number += alphabet.indexOf(rightSymbol.toLowerCase());
                } else {
                    number -= alphabet.indexOf(rightSymbol.toLowerCase());
                }

                sum += number;

            }
        }

        System.out.println(String.format("%.2f", sum));
    }
}
