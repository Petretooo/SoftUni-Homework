package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListTask5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());

        List<String> names = new ArrayList<>();

        for (int i = 0; i < num; i++) {

            String[] data = in.nextLine().split("\\s+");

            if (data[2].equals("not")) {
                if (!names.contains(data[0])) {
                    System.out.printf("%s is not in the list!\n", data[0]);
                }
                names.remove(data[0]);
            } else {
                if (names.contains(data[0])) {
                    System.out.printf("%s is already in the list!\n", data[0]);
                } else {
                    names.add(data[0]);
                }

            }
        }
        System.out.println(String.join("\n", names));
    }
}
