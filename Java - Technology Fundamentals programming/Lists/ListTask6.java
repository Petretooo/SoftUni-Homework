package Lists;

import java.lang.invoke.SwitchPoint;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListTask6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        List<String> elements = Arrays.stream(in.nextLine().split("\\s+"))
                .collect(Collectors.toList());


        String input = "";

        while (!"End".equalsIgnoreCase(input = in.nextLine())) {

            String[] data = input.split("\\s+");

            String command = data[0];

            switch (command) {
                case "Add":
                    elements.add(data[1]);
                    break;
                case "Insert":
                    String element = data[1];
                    int index = Integer.parseInt(data[2]);

                    if (index >= 0 && index < elements.size()) {
                        elements.add(index, element);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(data[1]);

                    if (indexToRemove >= 0 && indexToRemove < elements.size()) {
                        elements.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    if (elements.size() > 0) {
                        int count = Integer.parseInt(data[2]);
                        if (data[1].equalsIgnoreCase("left")) {
                            for (int i = 0; i < count % elements.size(); i++) {
                                elements.add(elements.get(0));
                                elements.remove(0);
                            }
                        } else {
                            for (int i = 0; i < count % elements.size(); i++) {
                                elements.add(0, elements.get(elements.size() - 1));
                                elements.remove(elements.size() - 1);
                            }
                        }
                    }
                    break;
            }
        }

        System.out.println(elements.toString().replaceAll("[\\[,\\]]", ""));


    }
}
