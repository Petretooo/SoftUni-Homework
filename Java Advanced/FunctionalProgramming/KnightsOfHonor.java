package FunctionalProgramming;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        Consumer<String> printer = str -> System.out.println("Sir "+ str);

        Arrays.stream(in.nextLine().split("\\s+")).forEach(printer);
    }
}
