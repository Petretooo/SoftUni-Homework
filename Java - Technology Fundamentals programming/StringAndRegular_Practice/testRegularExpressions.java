package StringAndRegular_Practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testRegularExpressions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String text = in.nextLine();

        Pattern pattern = Pattern.compile("([,.!]*)");
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){

            System.out.println(matcher.group(1));


        }


    }
}
