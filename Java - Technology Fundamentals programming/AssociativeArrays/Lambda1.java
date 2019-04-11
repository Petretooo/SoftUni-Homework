package AssociativeArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lambda1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> words = Arrays.stream(in.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .filter(e -> e % 2 == 0)
                .min(Integer::compareTo)
                .stream()
                .collect(Collectors.toList());

        List<Integer> numbers = Arrays.stream(in.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int minEven = numbers.stream().filter(e -> e % 2 == 0)
                .min(Integer::compareTo)
                .get();


        int sum = numbers.stream().mapToInt(Integer::intValue).sum();


        System.out.println(sum);


        System.out.println(minEven);


        System.out.println(words);


    }
}
