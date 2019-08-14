package Exam;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SecondTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int health = 100;
        int coins = 0;

        String[] rooms = in.nextLine().split("\\|");


        for (int i = 0; i < rooms.length; i++) {

            String[] things = rooms[i].split(" ");

            String command = things[0];
            int number = Integer.parseInt(things[1]);

            switch (command) {
                case "potion":
                    if (health == 100) {
                        System.out.println("You healed for 0 hp.");
                    }
                    if (health < 100) {
                        int currentHealth = Math.abs(100 - health);
                        if (currentHealth < number) {
                            System.out.printf("You healed for %d hp.%n", currentHealth);
                        } else if (currentHealth > number) {
                            System.out.printf("You healed for %d hp.%n", number);
                        }

                        health += number;

                        if (health > 100) {
                            health = 100;
                        }
                        System.out.printf("Current health: %d hp.%n", health);
                    }
                    break;
                case "chest":
                    coins += number;
                    System.out.printf("You found %d coins.%n", number);
                    break;
                default:
                    health -= number;
                    if (health <= 0) {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", i + 1);
                        return;
                    } else {
                        System.out.printf("You slayed %s.%n", command);
                    }

            }

        }


        System.out.println("You've made it!");
        System.out.printf("Coins: %d%n", coins);
        System.out.printf("Health: %d%n", health);


    }
}
