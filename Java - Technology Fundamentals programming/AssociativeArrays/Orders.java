package AssociativeArrays;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedHashMap<String, List<Double>> listOrders = new LinkedHashMap<>();


        String input = "";

        while (!"buy".equals(input = in.nextLine())) {

            String[] data = input.split("\\s+");

            String article = data[0];
            double price = Double.parseDouble(data[1]);
            double quantity = Integer.parseInt(data[2]);


            if (!listOrders.containsKey(article)) {
                listOrders.put(article, new ArrayList<>());
                listOrders.get(article).add(price);
                listOrders.get(article).add(quantity);
            } else {

                listOrders.get(article).set(0, price);
                listOrders.get(article).set(1, listOrders.get(article).get(1) + quantity);
            }
        }

        for (Map.Entry<String, List<Double>> kvp : listOrders.entrySet()) {

            String keyFirst = kvp.getKey();
            List<Double> valueMap = kvp.getValue();
            System.out.println(String.format("%s -> %.2f", keyFirst, valueMap.get(0) * valueMap.get(1)));
        }


    }


}
