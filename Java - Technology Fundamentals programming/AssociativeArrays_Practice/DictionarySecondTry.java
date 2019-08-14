package AssociativeArrays_Practice;

import java.util.*;

public class DictionarySecondTry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        LinkedHashMap<String, List<String>> wordAndDefenition = new LinkedHashMap<>();

        String[] wordDefinition = in.nextLine().split("\\s+\\|+\\s+");

        for (int i = 0; i < wordDefinition.length; i++) {
            String[] words = wordDefinition[i].split("\\:");
         //   String[] definitions = words[1].split("\\,\\s+");

            if (!wordAndDefenition.containsKey(words[0])) {
                wordAndDefenition.put(words[0], new ArrayList<>());
         //       for (int j = 0; j < definitions.length; j++) {
                    if (!wordAndDefenition.get(words[0]).contains(words[1])) {
                        wordAndDefenition.get(words[0]).add(words[1]);
                    }
         //       }
            } else {
         //       for (int j = 0; j < definitions.length; j++) {
                    if (!wordAndDefenition.get(words[0]).contains(words[1])) {
                        wordAndDefenition.get(words[0]).add(words[1]);
                    }
         //       }
            }
        }


        String[] names = in.nextLine().split("\\s+\\|+\\s+");
        for (int i = 0; i < names.length; i++) {
            if(wordAndDefenition.containsKey(names[i])){
                System.out.println(names[i]);
                wordAndDefenition
                        .get(names[i])
                        .stream()
                        .sorted((e1,e2) -> Integer.compare(Integer.parseInt(String.valueOf(e2.length())),Integer.parseInt(String.valueOf(e1.length()))))
                        .forEach(e -> System.out.println(String.format(" -%s", e.trim())));
            }
        }
        String command = in.nextLine();

        if(command.equals("List")){
            wordAndDefenition
                    .entrySet()
                    .stream()
                    .sorted(Comparator.comparing(Map.Entry::getKey))
                    .forEach(e -> System.out.print(String.format("%s ",e.getKey())));
        }
    }
}
