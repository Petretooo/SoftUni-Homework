package StringAndRegular_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AvtivationKeys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String[] text = in.nextLine().split("\\&+");
        List<String> keys = new ArrayList<>();
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]+$");

        for (int i = 0; i < text.length; i++) {
            String symbol = text[i];
            Matcher matcher = pattern.matcher(symbol);

            if(matcher.find() && (symbol.length() == 16 || symbol.length() ==25)){

                symbol = symbol.toUpperCase();
                String key ="";
                if(symbol.length() == 16){
                    for (int j = 0; j < symbol.length(); j++) {
                        if(Character.isDigit(symbol.charAt(j))){
                            key += 9-Integer.parseInt(String.valueOf(symbol.charAt(j)));
                        }else {
                            key += String.valueOf(symbol.charAt(j));
                        }
                        if(key.length() == 4){
                            if(j == 15){
                                key+=", ";
                            }else {
                                key = key + "-";
                            }
                            keys.add(key);
                            key ="";
                        }

                    }
                }else if(symbol.length() == 25){
                    for (int j = 0; j < symbol.length(); j++) {
                        if(Character.isDigit(symbol.charAt(j))){
                            key += 9-Integer.parseInt(String.valueOf(symbol.charAt(j)));
                        }else {
                            key += String.valueOf(symbol.charAt(j));
                        }
                        if(key.length() == 5){
                            if(j == 24){
                                key+=", ";
                            }else {
                                key = key + "-";
                            }
                            keys.add(key);
                            key ="";
                        }
                    }
                }
            }
        }
        String lastKey = keys.get(keys.size()-1).replace(',',' ');
        keys.remove(keys.size()-1);
        keys.add(lastKey);

        keys.stream().forEach(e -> System.out.print(e));




    }
}
