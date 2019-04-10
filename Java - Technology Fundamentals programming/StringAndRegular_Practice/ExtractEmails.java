package StringAndRegular_Practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();

        Pattern pattern = Pattern.compile("\\s[A-Za-z]+[\\w-_.]*@[A-Za-z-]+(\\.[A-Za-z]+)+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){

            System.out.println(matcher.group(0).trim());
        }
    }
}
