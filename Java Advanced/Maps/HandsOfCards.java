package Maps;

import java.util.*;
import java.util.stream.Collectors;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input;

        LinkedHashMap<String, HashSet<String>> players = new LinkedHashMap<>();

        while(!"JOKER".equalsIgnoreCase(input = in.nextLine())){

            String name = input.substring(0,input.indexOf(":"));
            ArrayList<String> cards = Arrays.stream(input.substring(input.indexOf(":") + 2).split(", "))
                    .collect(Collectors.toCollection(ArrayList::new));

            if(!players.containsKey(name)){
                players.put(name, new HashSet<>(){
                    {
                        addAll(cards);
                    }
                });

            }else {
                players.get(name).addAll(cards);
            }

        }


        for (Map.Entry<String, HashSet<String>> entry : players.entrySet()) {

            int deckPower = calculateDeckPower(entry.getValue());

            System.out.println(String.format("%s: %d",entry.getKey(),deckPower));
        }
    }

    private static int calculateDeckPower(HashSet<String> deck) {

        int sumPower = 0;

        for (String cards: deck) {

            int power = 0;

            if(Character.isDigit(cards.charAt(0)) && cards.charAt(0) != '1'){
                power += cards.charAt(0) - '0';
            }else {
                switch (cards.charAt(0)){
                    case '1':
                        power+=10;
                        break;
                    case 'J':
                        power += 11;
                        break;
                    case 'Q':
                        power += 12;
                        break;
                    case 'K':
                        power +=13;
                        break;
                    case 'A':
                        power+=14;
                        break;
                }
            }

            switch (cards.charAt(cards.length()-1)){
                case'S':
                    power *= 4;
                    break;
                case'H':
                    power *= 3;
                    break;
                case'D':
                    power *= 2;
                    break;
            }

            sumPower += power;

        }

        return  sumPower;
    }
}
