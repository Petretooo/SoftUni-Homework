package StringAndRegular_Practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SongEncryption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Pattern patternArting = Pattern.compile("^((?:[A-Z])(?:[a-z\\ *\\'*]+)):([A-Z\\s*]+)$");


        String input = "";
        while (!"end".equals(input = in.nextLine())){


            Matcher matcher = patternArting.matcher(input);

            String newWord = "";
            if (matcher.find()) {
                String artist = matcher.group(1);
                int lenght = artist.length();

                for (int i = 0; i < input.length(); i++) {
                    if(Character.isLetter(input.charAt(i))){
                        if((int)input.charAt(i)+lenght <= 90 && (int)input.charAt(i)+lenght >= 64 && Character.isUpperCase(input.charAt(i))) {
                            newWord += String.valueOf(Character.toChars(input.charAt(i) + lenght));
                        }else if((int)input.charAt(i)+lenght <= 122 && (int)input.charAt(i)+lenght >= 96 && Character.isLowerCase(input.charAt(i))){
                            newWord += String.valueOf(Character.toChars(input.charAt(i) + lenght));
                        }
                        else{
                            if (input.charAt(i)+lenght > 'z') {
                                int charOne = input.charAt(i) + lenght;
                                int charTwo = charOne - 122;
                                int charThree = charTwo + 96;
                                newWord += String.valueOf(Character.toChars(charThree));
                            }else if(input.charAt(i)+lenght > 'Z'){
                                int charOne = input.charAt(i) + lenght;
                                int charTwo = charOne - 90;
                                int charThree = charTwo + 64;
                                newWord += String.valueOf(Character.toChars(charThree));
                            }
                        }
                    }else if(input.charAt(i)==':'){
                        newWord += String.valueOf(Character.toChars('@'));
                   //     input.replace(input.charAt(i),'@');
                    }else if(input.charAt(i) == ' ' || input.charAt(i) == '\''){
                        newWord += input.charAt(i);
                    }
                }
                System.out.println(String.format("Successful encryption: %s",newWord));


            }else {
                System.out.println("Invalid input!");
            }
        }
    }
}
