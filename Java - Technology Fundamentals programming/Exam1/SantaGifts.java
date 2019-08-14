package Exam1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SantaGifts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberCommands = Integer.parseInt(in.nextLine());

        List<Integer> arrayInteger = Arrays.stream(in.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int position = 0;
        int steps;
        for (int i = 0; i < numberCommands; i++) {
            String[] data = in.nextLine().split("\\s+");
            String command = data[0];

            switch (command) {
                case "Forward":
                    steps = Integer.parseInt(data[1]);
                    if (steps + position < arrayInteger.size()) {
                        position += steps;
                        arrayInteger.remove(arrayInteger.get(position));
                    }
                    break;
                case "Back":
                    steps = Integer.parseInt(data[1]);
                    if (position - steps >= 0) {
                        position -= steps;
                        arrayInteger.remove(arrayInteger.get(position));
                    }
                    break;
                case "Gift":
                    int currentPosition = Integer.parseInt(data[1]);
                    if (currentPosition >= 0 && currentPosition <= arrayInteger.size()) {
                        int number = Integer.parseInt(data[2]);
                        arrayInteger.add(currentPosition, number);
                        position = currentPosition;
                    }
                    break;
                case "Swap":
                    int firstNumber = Integer.parseInt(data[1]);
                    int secondNumber = Integer.parseInt(data[2]);

                    if (arrayInteger.contains(firstNumber) && arrayInteger.contains(secondNumber)) {
                        int firstNumberPosition = arrayInteger.indexOf(firstNumber);
                        int secondNumberPosition = arrayInteger.indexOf(secondNumber);

                        arrayInteger.set(firstNumberPosition, secondNumber);
                        arrayInteger.set(secondNumberPosition, firstNumber);
                    }
                    break;
            }
        }
        System.out.println("Position: " + position);
        System.out.println(arrayInteger.toString().replaceAll("[\\[\\]]", ""));
    }
}
