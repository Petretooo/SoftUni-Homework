package AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class wordZeroLenght {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String result = Arrays.stream(in.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining(" "));


        System.out.println(result);
    }
}
