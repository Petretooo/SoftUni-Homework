package AssociativeArrays_Practice;

import java.util.*;

public class Concert {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        LinkedHashMap<String, List<String>> bandsWithMembers = new LinkedHashMap<>();
        LinkedHashMap<String, Double> bandTime = new LinkedHashMap<>();

        String input = "";


        double timeSum = 0;
        while(!"start of concert".equals(input = in.nextLine())){
            String[] arr = input.split("\\;+");

            if(arr[0].equals("Play")){
                if(!bandTime.containsKey(arr[1])){
                    bandTime.put(arr[1], Double.parseDouble(arr[2]));
                    timeSum += Double.parseDouble(arr[2]);
                }else {
                    bandTime.put(arr[1], bandTime.get(arr[1])+Double.parseDouble(arr[2]));
                    timeSum += Double.parseDouble(arr[2]);
                }
            }else if(arr[0].equals("Add")){
                String band = arr[1].trim();
                String[] members = arr[2].split(",");
                if(!bandsWithMembers.containsKey(band)) {
                    bandsWithMembers.put(band, new ArrayList<>());
                    for (int i = 0; i < members.length; i++) {
                        bandsWithMembers.get(band).add(members[i].trim());
                    }
                }else{
                    members = arr[2].split(",");
                    for (int i = 0; i <members.length ; i++) {
                        if(!bandsWithMembers.get(band).contains(members[i].trim())){
                            bandsWithMembers.get(band).add(members[i].trim());
                        }
                    }
                }
            }
        }

        input = in.nextLine();

        System.out.println(String.format("Total time: %.0f",timeSum));
        bandTime.entrySet()
                .stream()
                //.sorted((e1,e2) -> Double.compare(e2.getValue(),e1.getValue()))
                .sorted((e1,e2) ->
                {
                    if(e2.getValue() > e1.getValue()){
                        return 1;
                    }else if(e2.getValue() < e1.getValue()){
                        return -1;
                    }else {
                        return e1.getKey().compareTo(e2.getKey());

                    }
                })
                .forEach(e -> System.out.println(String.format("%s -> %.0f",e.getKey(),e.getValue()).trim()));


        if(bandsWithMembers.containsKey(input)) {
            System.out.println(input);
            bandsWithMembers.get(input).stream()
                    .forEach(e -> System.out.println(String.format("=> %s", e)));
        }
    }
}
