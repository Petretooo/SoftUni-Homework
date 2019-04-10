package StringAndRegular_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] keys = in.nextLine().split("\\&+");

        List<String> finalKeys = new ArrayList<>();
        Pattern pattern = Pattern.compile("^([A-za-z0-9]+)$");

        for (int i = 0; i < keys.length; i++) {

            String word = keys[i];

            Matcher matcher = pattern.matcher(word);

            while(matcher.find()){

                int lenghtWord = word.length();
                String key = "";

                if(word.length() != 16 && word.length() != 25){
                    continue;
                }

                while(!word.equals("")) {
                    if (lenghtWord == 25) {
                        for (int j = 0; j < 5; j++) {
                            key += word.charAt(j);
                        }
                        word = word.substring(5,word.length());
                        if (!finalKeys.contains(key)){
                            if(word.length() == 0){
                                key+=",";
                                finalKeys.add(key.toUpperCase());
                                finalKeys.add(" ");
                            }else {
                                key+="-";
                                finalKeys.add(key.toUpperCase());
                            }
                        }
                        key="";
                    }

                    if(lenghtWord == 16){
                        for (int j = 0; j < 4; j++) {
                            key += word.charAt(j);
                        }
                        word = word.substring(4,word.length());
                        if (!finalKeys.contains(key)){
                            if(word.length() == 0){
                                key+=",";
                                finalKeys.add(key.toUpperCase());
                                finalKeys.add(" ");
                            }else {
                                key+="-";
                                finalKeys.add(key.toUpperCase());
                            }
                        }
                        key="";
                    }
                }
            }
        }


        for (int i = 0; i < finalKeys.size(); i++) {
            String key = finalKeys.get(i);
            String secondKey ="";

            for (int j = 0; j < key.length(); j++) {

                if(Character.isDigit(key.charAt(j))){
                    int a = Integer.parseInt(String.valueOf(key.charAt(j)));
                    a = 9-a;
                    String digit = String.valueOf(a);
                    secondKey+=digit;
                }else {
                    secondKey+=key.charAt(j);
                }

            }

            int index = finalKeys.indexOf(finalKeys.get(i));
            finalKeys.set(index,secondKey);
        }

        String lastWord = finalKeys.get(finalKeys.size()-2).substring(0,4);
        int lastIndex = finalKeys.size()-2;
        finalKeys.set(lastIndex,lastWord);

        for (int i = 0; i < finalKeys.size(); i++) {

            System.out.print(finalKeys.get(i));
        }

        System.out.println();
    }
}
