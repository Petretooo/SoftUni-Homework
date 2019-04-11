package AssociativeArrays;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Courses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedHashMap<String, List<String>> listCourese = new LinkedHashMap<>();

        String input = "";

        while (!"End".equalsIgnoreCase(input = in.nextLine())) {

            String[] data = input.split(" : ");
            String course = data[0];
            String name = data[1];

            if (!listCourese.containsKey(course)) {
                listCourese.put(course, new ArrayList<>());
            }

            if (!listCourese.get(course).contains(name)) {
                listCourese.get(course).add(name);
            }

        }

        Map<String, List<String>> sorted = listCourese.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));


        for (Map.Entry<String, List<String>> kvp : sorted.entrySet()) {

            List<String> names = kvp.getValue();
            Collections.sort(names, String::compareTo);

            int counter = names.size();

            System.out.println(String.format("%s: %d", kvp.getKey(), counter));

            for (int i = 0; i < names.size(); i++) {

                System.out.println(String.format("-- %s", names.get(i)));
            }

        }
    }
}
