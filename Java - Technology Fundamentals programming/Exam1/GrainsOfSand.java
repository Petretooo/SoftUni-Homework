package Exam1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GrainsOfSand {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(in.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = "";

        while (!"Mort".equalsIgnoreCase(input = in.nextLine())) {

            String[] data = input.split("\\s+");
            String command = data[0];

            switch (command) {

                case "Add":
                    int number3 = Integer.parseInt(data[1]);
                    numbers.add(numbers.size(), number3);
                    break;
                case "Remove":
                    int number = Integer.parseInt(data[1]);
                    if (numbers.contains(number)) {
                        int index = numbers.indexOf(number);
                        numbers.remove(index);
                        break;
                    } else {
                        if (number >= 0 && number <= numbers.size()) {
                            numbers.remove(number);
                        } else {
                            continue;
                        }
                    }
                    break;
                case "Replace":
                    int number2 = Integer.parseInt(data[1]);
                    if (numbers.contains(number2)) {
                        int index = numbers.indexOf(number2);
                        numbers.set(index, Integer.parseInt(data[2]));
                    } else {
                        continue;
                    }
                    break;
                case "Increase":
                    int increase = Integer.parseInt(data[1]);
                    int thisNumber = 0;
                    for (int i = 0; i < numbers.size(); i++) {
                        if (increase <= (numbers.get(i))) {
                            thisNumber = (numbers.get(i));
                            break;
                        }
                    }
                    if (thisNumber >= increase) {
                        for (int i = 0; i < numbers.size(); i++) {
                            numbers.set(i, numbers.get(i) + thisNumber);

                        }
                    } else {
                        int last = numbers.get(numbers.size() - 1);
                        for (int i = 0; i < numbers.size(); i++) {
                            numbers.set(i, numbers.get(i) + last);
                        }
                    }

                    break;
                case "Collapse":
                    int number1 = Integer.parseInt(data[1]);
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) < number1) {
                            numbers.remove(i);
                            i = 0;
                        }
                    }
                    break;
            }
        }

        System.out.println(numbers.toString().replaceAll("[\\],\\[]", ""));


    }
}
