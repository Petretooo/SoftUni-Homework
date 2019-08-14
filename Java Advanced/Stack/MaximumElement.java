package Stack;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        while(n-- > 0){
            String[] tokens = in.nextLine().split("\\s+");
            String command = tokens[0];
            switch (command){
                case "1":
                    int element = Integer.parseInt(tokens[1]);
                    numbers.push(element);
                    break;
                case "2":
                    numbers.pop();
                    break;
                case"3":
                    System.out.println(Collections.max(numbers));
                    // System.out.println(numbers.stream().max(Integer::compareTo).get());

            }
        }
    }
}
