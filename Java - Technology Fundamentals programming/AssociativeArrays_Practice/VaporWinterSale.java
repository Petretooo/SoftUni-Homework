package AssociativeArrays_Practice;

import java.util.*;
import java.util.stream.Collectors;

public class VaporWinterSale {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] games = in.nextLine().split(", ");

        LinkedHashMap<String, Double> gamesWithDLC = new LinkedHashMap<>();
        LinkedHashMap<String, Double> gamesWithoutDLC = new LinkedHashMap<>();


        for (int i = 0; i < games.length; i++) {

            String[] game;

            if (games[i].contains("-")) {
                game = games[i].split("-");
                if (!gamesWithoutDLC.containsKey(game[0])) {
                    gamesWithoutDLC.put(game[0], Double.parseDouble(game[1]));
                } else {
                    gamesWithoutDLC.put(game[0], Double.parseDouble(game[1]));
                }
            } else if (games[i].contains(":")) {
                game = games[i].split(":");
                if (!gamesWithDLC.containsKey(game[0])) {
                    double price = 0.0;
                    if (gamesWithoutDLC.containsKey(game[0])) {
                        price = gamesWithoutDLC.get(game[0]);
                        price += price * 0.2;
                        gamesWithoutDLC.remove(game[0]);
                    }
                    if (price != 0) {
                        price -= price * 0.5;
                    }
                    String gameStr = String.format("%s - %s", game[0], game[1]);
                    gamesWithDLC.put(gameStr, price);
                } else {
                    double price = 0.0;
                    if (gamesWithoutDLC.containsKey(game[0])) {
                        price = gamesWithoutDLC.get(game[0]);
                        price += price * 0.2;
                        gamesWithoutDLC.remove(game[0]);
                    }
                    if (price != 0) {
                        price -= price * 0.5;
                    }
                    String gameStr = String.format("%s - %s", game[0], game[1]);
                    gamesWithDLC.put(gameStr, price);
                }
            }
        }

        for (Map.Entry<String, Double> entry : gamesWithoutDLC.entrySet()) {
            String game = entry.getKey();
            Double price = entry.getValue();
            if (price != 0) {
                price -= price * 0.2;
            }
            gamesWithoutDLC.put(game, price);
        }


        gamesWithDLC.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(e -> System.out.println(String.format("%s - %.2f", e.getKey(), e.getValue())));


        gamesWithoutDLC.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> System.out.println(String.format("%s - %.2f", e.getKey(), e.getValue())));


    }
}
