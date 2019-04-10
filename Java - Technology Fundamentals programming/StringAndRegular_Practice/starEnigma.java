package StringAndRegular_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class starEnigma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        Pattern pattern = Pattern.compile("[star]",Pattern.CASE_INSENSITIVE);

        for (int i = 0; i < n; i++) {

            String text = in.nextLine();

            Matcher matcher = pattern.matcher(text);


            int counter = 0;
            while(matcher.find()){
                counter++;
            }


            String deecryptMessage = "";

            for (int j = 0; j < text.length(); j++) {
                deecryptMessage += String.valueOf(Character.toChars(text.charAt(j)-counter));
            }


            Pattern pattern1 = Pattern.compile("@([A-Za-z]+)(?:[^@,\\-!:>]*):(?:[^@,\\-!:>]*)([\\d]+)(?:[^@,\\-!:>]*)!([A|D])!(?:[^@,\\-!:>]*)->([\\d]+)");
            Matcher matcher1 = pattern1.matcher(deecryptMessage);


            while(matcher1.find()){
                String planetName = matcher1.group(1);
                String attackType = matcher1.group(3);



                if(attackType.equals("A")){
                    attackedPlanets.add(planetName);
                }else if(attackType.equals("D")){
                    destroyedPlanets.add(planetName);
                }
            }
        }


        System.out.println(String.format("Attacked planets: %d", attackedPlanets.size()));
        attackedPlanets.stream().sorted(String::compareTo)
                .forEach(e -> System.out.println(String.format("-> %s", e)));


        System.out.println(String.format("Destroyed planets: %d", destroyedPlanets.size()));
        destroyedPlanets.stream().sorted(String::compareTo)
                .forEach(e -> System.out.println(String.format("-> %s",e)));


    }
}
