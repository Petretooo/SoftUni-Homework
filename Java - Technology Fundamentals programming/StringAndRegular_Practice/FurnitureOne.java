package StringAndRegular_Practice;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FurnitureOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> products = new ArrayList<>();
        Pattern pattern = Pattern.compile("^>>([A-Za-z]+)+<<(\\d+\\.?\\d+)+!([\\d+]+)\\b");
        String input = "";
        double sum = 0.0;
        while(!"Purchase".equals(input = in.nextLine())){

            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){
                String product = matcher.group(1);
                double price = Double.parseDouble(matcher.group(2));
                int quantity = Integer.parseInt(matcher.group(3));
                products.add(product);
                sum+=price*quantity;
            }
        }
        System.out.println("Bought furniture:");
        products.stream().forEach(e-> System.out.println(e));
        System.out.println(String.format("Total money spend: %.2f",sum));
    }
}
