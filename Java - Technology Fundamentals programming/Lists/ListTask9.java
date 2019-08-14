package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListTask9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = "";

        while (!"end".equalsIgnoreCase(input = in.nextLine())) {

            String[] commandsArray = input.split(" ");

            String command = commandsArray[0];

            switch (command) {
                case "Add":
                    int num1 = Integer.parseInt(commandsArray[1]);
                    numbers.add(num1);
                    break;
                case "Remove":
                    int num2 = Integer.parseInt(commandsArray[1]);
                    numbers.remove(num2);
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(commandsArray[1]);
                    numbers.remove(index);
                    break;
                case "Insert":
                    int number = Integer.parseInt(commandsArray[1]);
                    int indeX = Integer.parseInt(commandsArray[2]);
                    numbers.add(indeX, number);
                    break;
            }


        }
        System.out.println(numbers.toString().replaceAll("[\\[,\\]]", ""));

    }
}
