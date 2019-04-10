package StringAndRegular_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furtniture {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        String word = "";
        List<String> purchased = new ArrayList<>();
        double sum = 0.0;

        Pattern pattern = Pattern.compile("^>>([A-Za-z]+)+<<(\\d+\\.?\\d+)+!([\\d+]+)\\b");

        while(!"Purchase".equals(word = in.nextLine())){

            Matcher matcher = pattern.matcher(word);

            if(matcher.find()){
                purchased.add(matcher.group(1));
                double price = Double.parseDouble(matcher.group(2));
                double quantity = Double.parseDouble(matcher.group(3));
                if(Double.parseDouble(matcher.group(3))==0){
                    sum += Double.parseDouble(matcher.group(2));
                }else {
                    sum += price*quantity;
                }
            }

        }

        System.out.println("Bought furniture:");

        for (String a: purchased) {
            System.out.println(a);
        }

        System.out.println(String.format("Total money spend: %.2f", sum));
    }
}
