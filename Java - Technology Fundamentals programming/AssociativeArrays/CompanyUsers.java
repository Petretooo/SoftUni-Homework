package AssociativeArrays;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        TreeMap<String, List<String>> companies = new TreeMap<>();

        String inputLine = "";

        while (!"End".equals(inputLine = in.nextLine())) {

            String[] data = inputLine.split(" -> ");
            String companyName = data[0];
            String emplpyeeID = data[1];

            if (!companies.containsKey(companyName)) {
                companies.put(companyName, new ArrayList());
            }

            if (!companies.get(companyName).contains(emplpyeeID)) {
                companies.get(companyName).add(emplpyeeID);
            }
        }

       /* LinkedHashMap<String, > newMap = companies.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey));
*/
        for (Map.Entry<String, List<String>> kvp : companies.entrySet()) {

            System.out.println(kvp.getKey());

            List<String> listEmployee = kvp.getValue();

            for (int i = 0; i < listEmployee.size(); i++) {
                System.out.println(String.format("-- %s", listEmployee.get(i)));
            }

        }
    }
}
