package AssociativeArrays;

import java.util.*;

public class CounRealNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double[] nums = Arrays.stream(in.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> someMap = new TreeMap<>();

        for (double num : nums) {
            if (!someMap.containsKey(num)) {
                someMap.put(num, 0);
            }
            int oldValue = someMap.get(num);
            someMap.put(num, oldValue + 1);
        }

        for (Map.Entry<Double, Integer> kvp : someMap.entrySet()) {
            System.out.println(String.format("%.0f -> %d", kvp.getKey(), kvp.getValue()));
        }

    }
}
