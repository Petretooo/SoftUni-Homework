package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListTask11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        List<String> elements = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String product = in.nextLine();
            elements.add(product);
        }
        Collections.sort(elements);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d.%s%n", i + 1, elements.get(i));
        }
    }
}
