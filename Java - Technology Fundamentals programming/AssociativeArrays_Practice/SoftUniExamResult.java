package AssociativeArrays_Practice;

import java.util.*;

public class SoftUniExamResult {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedHashMap<String, Integer> user = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> submissions = new LinkedHashMap<>();
        String input = "";


        while(!"exam finished".equals(input = in.nextLine())){
            String[] words = input.split("\\-");

            String name = words[0];

            if(words[1].equals("banned")){
                user.remove(words[0]);
                continue;
            }

            if(!submissions.containsKey(words[1])){
                submissions.put(words[1],1);
            }else {
                submissions.put(words[1],submissions.get(words[1])+1);
            }

                if (!user.containsKey(name)) {

                    user.put(name, Integer.parseInt(words[2]));
                } else if (user.containsKey(name) && user.get(name) < Integer.parseInt(words[2])) {
                    user.put(words[0], Integer.parseInt(words[2]));
                }
         }


        System.out.println("Results:");

        user.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .sorted((e1,e2)-> Double.compare(e2.getValue(),e1.getValue()))
                .forEach(e -> System.out.println(String.format("%s | %d",e.getKey(),e.getValue())));

        System.out.println("Submissions:");
        submissions.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .sorted((e1,e2)-> Double.compare(e2.getValue(),e1.getValue()))
                .forEach(e -> System.out.println(String.format("%s - %d", e.getKey(),e.getValue())));
    }
}
