package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedHashMap<String, Integer> nameNumber = new LinkedHashMap<>();

        String input = "";

        while (!"stop".equalsIgnoreCase(input = in.nextLine())) {
            String[] data = input.split("\\s+");

            String word = data[0];
            int number = Integer.parseInt(in.nextLine());

            if (!nameNumber.containsKey(word)) {
                nameNumber.put(word, number);
            } else {
                nameNumber.put(word, nameNumber.get(word) + number);
            }
        }


        nameNumber.forEach((key, value) -> System.out.println(String.format("%s -> %d", key, value)));
    }
}
