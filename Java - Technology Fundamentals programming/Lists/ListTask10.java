package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;

import static java.util.stream.Collectors.*;

public class ListTask10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(in.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(toList());


        String input = "";

        while (!"end".equalsIgnoreCase(input = in.nextLine())) {
            String[] commandsArray = input.split("\\s+");

            String command = commandsArray[0];

            switch (command) {
                case "Contains":
                    if (numbers.contains(Integer.parseInt(commandsArray[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commandsArray[1].equalsIgnoreCase("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandsArray[1].equalsIgnoreCase("odd")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 1) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
                    break;
                case "Filter":
                    int index = numbers.indexOf(Integer.parseInt(commandsArray[2]));
                    if (index >= 0 && index < numbers.size() - 1) {
                        if (commandsArray[1].equalsIgnoreCase(">")) {
                            for (int i = index + 1; i < numbers.size(); i++) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        } else if (commandsArray[1].equalsIgnoreCase("<")) {
                            for (int i = 0; i < index; i++) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        } else if (commandsArray[1].equalsIgnoreCase(">=")) {
                            for (int i = index; i < numbers.size(); i++) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        } else if (commandsArray[1].equalsIgnoreCase("<=")) {
                            for (int i = 0; i <= index; i++) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;


            }


        }

    }
}
