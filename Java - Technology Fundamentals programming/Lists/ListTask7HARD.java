package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListTask7HARD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> elements = Arrays.stream(in.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = "";
        while (!"3:1".equals(input = in.nextLine())) {
            String[] data = input.split("\\s+");
            String command = data[0];

            switch (command) {
                case "merge":
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);
                    startIndex = validateIndex(startIndex, elements.size());
                    endIndex = validateIndex(endIndex, elements.size());
                    String concatElements =
                            String.join("", elements.subList(startIndex, endIndex + 1));
                    elements.subList(startIndex, endIndex + 1).clear();
                    elements.add(startIndex, concatElements);
                    break;
                case "divide":
                    int index = Integer.parseInt(data[1]);
                    int partition = Integer.parseInt(data[2]);
                    List<String> result = dividedEqually(elements.get(index), partition);
                    elements.remove(index);
                    elements.addAll(index, result);
                    break;
            }
        }
        System.out.println(String.join(" ", elements));
    }

    private static List<String> dividedEqually(String element, int partition) {
        int part = element.length() / partition;
        ArrayList<String> result = new ArrayList<>();
        while (element.length() >= part) {
            result.add(element.substring(0, part));
            element = element.substring(part);
        }
        if (result.size() == partition) {
            return result;
        } else {
            String concatLastTwoElements = result.get(result.size() - 2)
                    .concat(result.get((result.size() - 1)));

            result.subList(result.size() - 2, result.size()).clear();
            result.add(concatLastTwoElements);
            return result;
        }
    }

    private static int validateIndex(int index, int length) {
        if (index < 0) {
            index = 0;
        }
        if (index > length - 1) {
            index = length - 1;
        }
        return index;
    }
}
