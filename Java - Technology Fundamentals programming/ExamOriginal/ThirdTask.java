package ExamOriginal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> numbers = Arrays.stream(in.nextLine().split("\\s+"))
                .collect(Collectors.toList());


        String input = "";
        while (!"end".equalsIgnoreCase(input = in.nextLine())) {

            String[] data = input.split("\\s+");
            String command = data[0];

            String paintingNumber;
            String paintingNumber2;
            String changeNumber;

            switch (command) {
                case "Change":
                    paintingNumber = data[1];
                    changeNumber = data[2];
                    if (numbers.contains(paintingNumber)) {
                        int index = numbers.indexOf(paintingNumber);
                        numbers.set(index, changeNumber);
                    } else {
                        continue;
                    }
                    break;
                case "Hide":
                    paintingNumber = data[1];
                    if (numbers.contains(paintingNumber)) {
                        numbers.remove(paintingNumber);
                    } else {
                        continue;
                    }
                    break;
                case "Switch":
                    paintingNumber = data[1];
                    paintingNumber2 = data[2];
                    if (numbers.contains(paintingNumber) && numbers.contains(paintingNumber2)) {
                        int index = numbers.indexOf(paintingNumber);
                        int index1 = numbers.indexOf(paintingNumber2);

                        numbers.set(index, paintingNumber2);
                        numbers.set(index1, paintingNumber);
                    } else {
                        continue;
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(data[1]);
                    paintingNumber = data[2];
                    if (index + 1 >= 0 && index + 1 <= numbers.size()) {
                        numbers.add(index + 1, paintingNumber);
                    } else {
                        continue;
                    }
                    break;
                case "Reverse":
                    Collections.reverse(numbers);
                    break;
            }
        }


        System.out.println(numbers.toString().replaceAll("[\\[,\\]]", ""));
    }
}
