package Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersStack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        Arrays.stream(in.nextLine().split("\\s+"))
                .forEach(e -> stack.push(e));


        while(!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }

    }
}
