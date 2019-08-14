package Sets;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        TreeSet<String> elements = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] inputEl = in.nextLine().split("\\s+");

            elements.addAll(Arrays.asList(inputEl));

        }

        for (String element : elements) {
            System.out.println(element + " ");

        }
    }
}
