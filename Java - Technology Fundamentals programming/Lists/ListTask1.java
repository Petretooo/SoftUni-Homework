package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(in.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int initialSize = numbers.size() / 2;

        for (int i = 0; i < initialSize; i++) {
            int firstNum = numbers.get(i);
            int index = (numbers.size() - 1);
            int nextNum = numbers.get(index);

            numbers.set(i, firstNum + nextNum);
            numbers.remove(index);


        }


        System.out.println(numbers.toString().replaceAll("\\[|,|\\]", ""));

    }


}
