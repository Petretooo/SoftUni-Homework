package Sets;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class SetsElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedHashSet<Integer> first = new LinkedHashSet<>();
        LinkedHashSet<Integer> second = new LinkedHashSet<>();

        String[] arr = in.nextLine().split("\\s+");

        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        for (int i = 0; i < n; i++) {
            int number = in.nextInt();
            first.add(number);
        }

        for (int i = 0; i < m; i++) {
            int number = in.nextInt();
            second.add(number);

        }

        first.retainAll(second);

        first.forEach(number -> System.out.print(number + " "));

    }
}
