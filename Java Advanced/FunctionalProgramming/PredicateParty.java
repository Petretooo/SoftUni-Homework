package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        ArrayList<String> names = Arrays.stream(in.nextLine().split("\\s+"))
                .collect(Collectors.toCollection(ArrayList::new));


        String commnad;



        while (!"Party!".equals(commnad = in.nextLine())) {
            String[] tokens = commnad.split("\\s+");
            Predicate<String> predicate = createPredicate(tokens[1], tokens[2]);
            if (tokens[0].equals("Remove")) {
                names.removeIf(predicate);
            } else {
                ArrayList<String> namesToAdd = new ArrayList<>();

                names.forEach(name -> {
                    if(predicate.test(name)){
                        namesToAdd.add(name);
                    }
                });

                names.addAll(namesToAdd);
            }

        }

        Collections.sort(names);

        System.out.println(names.size() == 0 ? "Nobody is going to the party!" : String.join(", ",names) +
                " are going to the party!");

    }
    public static Predicate<String> createPredicate(String type, String string){

        Predicate<String> predicate;

        switch (type){
            case "StartsWith":
                predicate = str -> str.startsWith(string);
                break;
            case"EndsWith":
                predicate = str -> str.endsWith(string);
                break;
            default:
                predicate = str -> str.length() == Integer.parseInt(string);
                break;
        }
        return  predicate;
    }
}
