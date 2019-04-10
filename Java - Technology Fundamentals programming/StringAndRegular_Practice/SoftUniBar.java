package StringAndRegular_Practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = "";

        Pattern pattern = Pattern.compile(
                "%([A-Z][a-z]+)%(?:[^|%$.]*)" +
                        "<([A-Za-z]+)>(?:[^|%$.]*)" +
                        "\\|([-+]?\\d+)\\|" +
                        "(?:[^|%$.]*)([-+]?\\d+\\.?\\d+)\\$"
        );

        double sum = 0.0;
        while(!"end of shift".equals(text = in.nextLine())){

            Matcher matcher = pattern.matcher(text);



            if (matcher.find()){

                String name = matcher.group(1);
                String product = matcher.group(2);
                int count = Integer.parseInt(matcher.group(3));
                double price = Double.parseDouble(matcher.group(4));

                sum += price*count;

                System.out.println(String.format("%s: %s - %.2f", name, product, (price*count)));
            }
        }


        System.out.println(String.format("Total income: %.2f",sum));
    }
}
