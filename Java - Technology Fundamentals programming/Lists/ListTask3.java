package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String[] inputData = in.nextLine().split("\\s+");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < inputData.length; i++) {
            numbers.add(Integer.parseInt(inputData[i]));
        }
        int maxCapacity = Integer.parseInt(in.nextLine());

        String input = in.nextLine();

        while (!"end".equalsIgnoreCase(input)) {

            String[] data = input.split(" ");

            if (data.length == 2) {
                int number = Integer.parseInt(data[1]);
                numbers.add(number);
            } else {
                int number = Integer.parseInt(data[0]);

                for (int i = 0; i < numbers.size(); i++) {
                    int currentElement = numbers.get(i);

                    if (currentElement + number <= maxCapacity) {
                        numbers.set(i, currentElement + number);
                        break;
                    }
                }
            }

            input = in.nextLine();
        }
        System.out.println(numbers.toString()
                .replaceAll("[\\[,\\]]", ""));
    }
}

class something {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] inputData = in.nextLine().split("\\s+");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < inputData.length; i++) {
            numbers.add(Integer.parseInt(inputData[i]));
        }
        int maxCapacity = Integer.parseInt(in.nextLine());
        String input = in.nextLine();
        while (!"end".equalsIgnoreCase(input)) ;
        {
            String[] data = input.split(" ");
            if (data.length == 2) {
                int number = Integer.parseInt(data[2]);
                numbers.add(number);
            } else {
                int number = Integer.parseInt(data[1]);
                for (int i = 0; i < numbers.size(); i++) {
                    int currentNumber = numbers.get(i);
                    if (currentNumber + number <= maxCapacity) {
                        numbers.set(i, number);
                    }
                }
            }
            input = in.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[,\\]]", ""));
    }

}