package FINALexam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class firstTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String note = "";

        Pattern pattern = Pattern.compile("^([A-Za-z0-9!@#$?]+)=(\\d+)<<(.+)$");

        while(!"Last note".equals(note = in.nextLine())){

            Matcher matcher = pattern.matcher(note);

            if(matcher.find()){
                int length = Integer.parseInt(matcher.group(2));
                String coordinates = matcher.group(3);
                if(coordinates.length() == length) {
                    String name = "";
                    for (int i = 0; i < matcher.group(1).length(); i++) {
                        if (Character.isLetterOrDigit(matcher.group(1).charAt(i))) {
                            name += String.valueOf(matcher.group(1).charAt(i));
                        }
                    }
                    System.out.println(String.format("Coordinates found! %s -> %s",
                            name, matcher.group(3)));
                }else {
                    System.out.println("Nothing found!");
                    continue;
                }
            }else {
                System.out.println("Nothing found!");
                continue;
            }

        }
    }
}
