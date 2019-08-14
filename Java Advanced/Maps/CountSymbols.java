package Maps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        String text = in.nextLine();

        TreeMap<Character, Integer> symbolCount = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if(symbolCount.containsKey(symbol)){
                symbolCount.put(symbol,1);
            }else {
                symbolCount.put(symbol,symbolCount.get(symbol)+1);
            }
        }

        for (Map.Entry<Character, Integer> el : symbolCount.entrySet()) {
            System.out.println(String.format("%c: %d time/s", el.getKey(),el.getValue()));
        }

    }
}
