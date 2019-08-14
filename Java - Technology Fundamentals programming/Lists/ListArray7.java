package Lists;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListArray7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> elements = Arrays.stream(in.nextLine().split(" "))
                .collect(Collectors.toList());

        String[] data = in.nextLine().split("\\s+");
        String bombNumber = data[0];
        int power = Integer.parseInt(data[1]);

        while (elements.contains(bombNumber)) {
            int elementIndex = elements.indexOf(bombNumber);
            int left = Math.max(0, elementIndex - power);
            int right = Math.min(elementIndex + power, elements.size() - 1);

            for (int i = right; i >= left; i--) {
                elements.remove(i);
            }
        }

        System.out.println(elements.stream().mapToInt(Integer::parseInt).sum());


    }
}
