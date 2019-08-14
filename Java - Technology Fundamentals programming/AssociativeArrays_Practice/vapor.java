package AssociativeArrays_Practice;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class vapor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedHashMap<String, Double> gamesWithDLC = new LinkedHashMap<>();
        LinkedHashMap<String, Double> gamesWithoutDLC = new LinkedHashMap<>();


        String[] games = in.nextLine().split(", ");

        for (int i = 0; i < games.length; i++) {
            if(games[i].contains("-")){
                String[] gamesWithout = games[i].split("-");
                String game = gamesWithout[0];
                double price = Double.parseDouble(gamesWithout[1]);

                if(!gamesWithoutDLC.containsKey(game)){
                    gamesWithoutDLC.put(game,price);
                }

            }else if(games[i].contains(":")){
                String[] gamesWith = games[i].split(":");
                String game = gamesWith[0];
                String WithDLC = String.format("%s - %s",game,gamesWith[1]);

                if(!gamesWithDLC.containsKey(game)){
                    if(gamesWithoutDLC.containsKey(game)){
                        double newPrice = gamesWithoutDLC.get(game)+(gamesWithoutDLC.get(game)*0.2);
                        gamesWithDLC.put(WithDLC,newPrice);
                        gamesWithoutDLC.remove(game);
                    }
                }
            }
        }


        for (Map.Entry<String, Double> a: gamesWithDLC.entrySet()){
            double reducedPrice = a.getValue()-a.getValue()*0.5;
            gamesWithDLC.put(a.getKey(), reducedPrice);
        }

        for (Map.Entry<String, Double> a: gamesWithoutDLC.entrySet()){
            double reducedPrice = a.getValue()-a.getValue()*0.2;
            gamesWithoutDLC.put(a.getKey(), reducedPrice);
        }

        gamesWithDLC.entrySet().stream()
                .sorted(Comparator.comparingDouble(Map.Entry::getValue))
                .forEach(e -> System.out.println(String.format("%s - %.2f",e.getKey(),e.getValue())));


        gamesWithoutDLC.entrySet().stream()
                .sorted((e1,e2) -> Double.compare(e2.getValue(),e1.getValue()))
                .forEach(e -> System.out.println(String.format("%s - %.2f",e.getKey(),e.getValue())));




    }
}
