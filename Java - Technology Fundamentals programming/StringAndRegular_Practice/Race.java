package StringAndRegular_Practice;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String[] names = in.nextLine().split(", ");
        LinkedHashMap<String, Integer> finalists = new LinkedHashMap<>();
        for (int i = 0; i < names.length; i++) {

            if(!finalists.containsKey(names[i])){
                finalists.put(names[i],0);
            }

        }

        Pattern patternAlphabets = Pattern.compile("([A-Za-z]+)");

        String word = "";
        while(!"end of race".equals(word = in.nextLine())){

            String name = "";
            Matcher matcher = patternAlphabets.matcher(word);
            while (matcher.find()){
                name+=matcher.group(1);
            }

            int sum = 0;
            for (int i = 0; i < word.length(); i++) {
                if(Character.isDigit(word.charAt(i))){
                    sum+=Integer.parseInt(String.valueOf(word.charAt(i)));
                }
            }

            if(finalists.containsKey(name)) {
                sum += finalists.get(name);
                finalists.put(name,sum);
            }
        }
        List<String> finalNames = new ArrayList<>();

        finalists.entrySet().stream().sorted((e1,e2)-> Integer.compare(e2.getValue(),e1.getValue()))
                .limit(3)
                .forEach(e -> finalNames.add(e.getKey()));


        System.out.println(String.format("1st place: %s%n" +
                "2nd place: %s%n" +
                "3rd place: %s%n", finalNames.get(0),finalNames.get(1),finalNames.get(2)));
    }
}
