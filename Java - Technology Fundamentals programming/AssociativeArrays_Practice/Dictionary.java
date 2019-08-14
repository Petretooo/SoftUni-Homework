package AssociativeArrays_Practice;

import java.util.*;

public class Dictionary {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        LinkedHashMap<String, List<String>> wordAndDefinition = new LinkedHashMap<>();

        String words = in.nextLine();
        String[] wordsDefinition = (words.split("\\|+\\s"));

        for (int i = 0; i < wordsDefinition.length; i++) {
            String word = wordsDefinition[i].substring(0, wordsDefinition[i].indexOf(':'));
            String Definition = wordsDefinition[i].substring(wordsDefinition[i].indexOf(' '), wordsDefinition[i].length());

            if (!wordAndDefinition.containsKey(word)) {
                wordAndDefinition.put(word, new ArrayList<>());
                wordAndDefinition.get(word).add(Definition);
            } else {
                wordAndDefinition.get(word).add(Definition);
            }
        }
        String[] keys = in.nextLine().split("\\s+\\|\\s+");

        for (int i = 0; i < keys.length; i++) {
            String kluch = keys[i];

            if (wordAndDefinition.containsKey(kluch)) {
                System.out.println(kluch);
                wordAndDefinition.get(kluch).stream().sorted((e1, e2) -> Integer.compare(e2.length(), e1.length()))
                        .forEach(e -> System.out.println(String.format(" -%s", e.trim())));
            }


        }
            String finalWord = in.nextLine();
            if (finalWord.equals("End")) {
                return;
            } else if (finalWord.equals("List")) {
                wordAndDefinition.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
                        .forEach(e -> System.out.print(String.format("%s ", e.getKey())));
            }
        }
    }
