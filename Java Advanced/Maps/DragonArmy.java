package Maps;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class DragonArmy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int n = Integer.parseInt(in.nextLine());

        LinkedHashMap<String, TreeMap<String,int[]>> dragons = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = in.nextLine().split("\\s+");

            String type = tokens[0];
            String name = tokens[1];

            int damage = tokens[2].equals("null") ? 45 : Integer.parseInt(tokens[2]);
            int health = tokens[3].equals("null") ? 250 : Integer.parseInt(tokens[3]);
            int armor = tokens[4].equals("null") ? 10 : Integer.parseInt(tokens[4]);

            if(!dragons.containsKey(type)){
                dragons.put(type,new TreeMap<>(){
                    {
                        put(name,new int[]{damage, health, armor});
                    }
                });
            }else {
                if(!dragons.get(type).containsKey(name)){
                    dragons.get(type).put(name, new int[] {damage,health,armor});
                }else {
                    dragons.get(type).get(name)[0] = damage;
                    dragons.get(type).get(name)[1] = health;
                    dragons.get(type).get(name)[2] = armor;
                }
            }
        }

        dragons.entrySet().stream().forEach(entry -> {

            double avgDamage = 0;
            double avgHealth = 0;
            double avrArmor = 0;

            int[] aggregatedDate = new int[3];

            entry.getValue().entrySet().stream().forEach(innerEntry -> {
                int damage = innerEntry.getValue()[0];
                int health = innerEntry.getValue()[1];
                int armor = innerEntry.getValue()[2];

                aggregatedDate[0]+=damage;
                aggregatedDate[1]+=health;
                aggregatedDate[2]+=armor;

            });

            int dragonCount = entry.getValue().size();

            avgDamage = aggregatedDate[0] / (dragonCount*1.00);
            avgHealth = aggregatedDate[1] / (dragonCount*1.00);
            avrArmor = aggregatedDate[2] / (dragonCount*1.00);

            System.out.println(String.format("%s::(%.2f/%.2f/%.2f)",
                    entry.getKey(),avgDamage,avgHealth,avrArmor
            ));


            entry.getValue().entrySet().stream().forEach(dragon -> {
                System.out.println(String.format("-%s -> damage: %d, health: %d, armor: %d",
                        dragon.getKey(),
                        dragon.getValue()[0],
                        dragon.getValue()[1],
                        dragon.getValue()[2]
                ));
            });

        });
    }
}
