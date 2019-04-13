package AssociativeArrays;

import java.util.*;

public class WorkSynonyms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int number = Integer.parseInt(in.nextLine());

        Map<String, List<String>> resMap = new LinkedHashMap<>();
        for (int i = 0; i < number; i++) {
            String key = in.nextLine();
            String value = in.nextLine();

            resMap.putIfAbsent(key, new ArrayList<>());
            resMap.get(key).add(value);
        }

        for (Map.Entry<String, List<String>> kvp : resMap.entrySet()) {
            String key = kvp.getKey();
            String value = String.join(", ", kvp.getValue());
            System.out.println(String.format("%s - %s", key, value));
        }

    }
}
