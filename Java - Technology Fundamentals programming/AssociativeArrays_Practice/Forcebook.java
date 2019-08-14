package AssociativeArrays_Practice;

import com.sun.source.tree.Tree;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Forcebook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        LinkedHashMap<String, Set<String>> forcebook = new LinkedHashMap<>();
        String input = "";


        while(!"Lumpawaroo".equals(input = in.nextLine())){


            String[] words = input.split("\\s+\\|\\s+|\\s+\\->\\s+");

            if(input.contains("|")){
                String forceSide = words[0];
                String forceUser = words[1];

                if(!forcebook.containsKey(forceSide)){
                    forcebook.put(forceSide, new TreeSet<>());
                }

                if(forcebook.entrySet().stream().noneMatch( e -> e.getValue().contains(forceSide))){
                    forcebook.get(forceSide).add(forceUser);
                }

            }else {
                String forceUser = words[0];
                String forceSide = words[1];

                forcebook.forEach((key,value)-> {
                    value.remove(forceUser);
                });
                if(!forcebook.containsKey(forceSide)){
                    forcebook.put(forceSide,new TreeSet<>());
                }

                forcebook.get(forceSide).add(forceUser);
                System.out.printf("%s joins the %s side!\n",forceUser,forceSide);
            }
        }
        forcebook
                .entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 0)
                .sorted((e1,e2)->{
                    int sort = Integer.compare(e2.getValue().size(),e1.getValue().size());
                    if(sort == 0){
                        sort = e1.getKey().compareTo(e2.getKey());
                    }
                    return sort;
                }).forEach(kvp -> {
            System.out.println(String.format("Side: %s, Members: %d",kvp.getValue(),kvp.getValue().size()));
            kvp.getValue().forEach(u -> System.out.println(String.format("! %s", u)));
        });
    }
}
