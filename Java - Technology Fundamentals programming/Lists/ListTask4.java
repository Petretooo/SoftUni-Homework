package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListTask4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(in.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = in.nextLine();

        while (!"end".equalsIgnoreCase(input)) {
            String[] data = input.split("\\s+");
            int digit = Integer.parseInt(data[1]);
            if ("delete".equalsIgnoreCase(data[0])) {

                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) == digit) {
                        numbers.remove(i);
                    }
                }
            } else if ("insert".equalsIgnoreCase(data[0])) {
                int index = Integer.parseInt(data[data.length - 1]);

                if (index >= 0 && index < numbers.size())
                    numbers.add(index, digit);
            }
            input = in.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[,\\]]", ""));
    }
}
