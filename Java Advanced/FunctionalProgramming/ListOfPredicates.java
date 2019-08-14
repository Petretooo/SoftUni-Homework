package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int n = Integer.parseInt(in.nextLine());

        ToIntFunction<String> mapper = Integer::parseInt;

        int[] squence = Arrays.stream(in.nextLine().split("\\s+"))
                .mapToInt(mapper)
                .toArray();


        Predicate<Integer> shouldPrint = num -> {
            boolean isPrintTable = true;

            for (int element : squence) {
                if (num % element == 0) {
                    isPrintTable = false;
                    break;
                }
            }
            return isPrintTable;
        };



        for (int i = 1; i <= n; i++) {
            if(shouldPrint.test(i)){
                System.out.print(i + " ");
            }
        }




    }
}
