package StringAndRegular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyPlanets = new ArrayList<>();

        int n = Integer.parseInt(in.nextLine());

        Pattern pattern = Pattern.compile("[star]", Pattern.CASE_INSENSITIVE);


        while (n-- > 0) {
            String encriptedMessage = in.nextLine();

            Matcher matcher = pattern.matcher(encriptedMessage);

            int countLetters = 0;
            while (matcher.find()) {
                countLetters++;
            }

            String decryptMessage = "";
            for (int i = 0; i < encriptedMessage.length(); i++) {
                decryptMessage += String.valueOf(
                        Character.toChars(
                                encriptedMessage.charAt(i) - countLetters));
            }


            Pattern patternPlanets = Pattern.compile("@([A-Za-z]+)(?:[^@!\\-:>]*):(\\d+)(?:[^@!\\-:>]*)!([AD])!(?:[^@!\\-:>]*)->(\\d+)");

            Matcher matcherPlanet = patternPlanets.matcher(decryptMessage);

            while (matcherPlanet.find()) {
                String planetName = matcherPlanet.group(1);
                String attackType = matcherPlanet.group(3);


                if (attackType.equals("A")) {
                    attackedPlanets.add(planetName);
                } else {
                    destroyPlanets.add(planetName);
                }
            }
        }

        System.out.println(String.format("Attacked planets: %d", attackedPlanets.size()));
        attackedPlanets.stream()
                .sorted(String::compareTo)
                .forEach(e -> {
                    System.out.println(String.format("-> %s", e));
                });

        System.out.println(String.format("Destroyed planets: %d", destroyPlanets.size()));
        destroyPlanets.stream()
                .sorted(String::compareTo)
                .forEach(e -> {
                    System.out.println(String.format("-> %s", e));
                });


    }
}
