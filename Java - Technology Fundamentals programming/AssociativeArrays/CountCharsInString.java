package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String word = String.join("", in.nextLine().split("\\s+"));

        LinkedHashMap<Character, Integer> task = new LinkedHashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char symbol = word.charAt(i);

            if (!task.containsKey(symbol)) {
                task.put(symbol, 1);
            } else {
                task.put(symbol, task.get(symbol) + 1);
            }
        }

        task.forEach((key, value) -> System.out.println(String.format("%c -> %d", key, value)));

    }
}
