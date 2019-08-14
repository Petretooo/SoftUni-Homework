package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class ListTask8Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> arrays = Arrays.stream(in.nextLine().split("\\|"))
                .collect(Collectors.toList());
        Collections.reverse(arrays);
        String toPrint = arrays.toString().replaceAll("[\\]\\[,]", "").trim();
        toPrint = toPrint.replaceAll("\\s+", " ");

        System.out.println(toPrint);


    }
}
