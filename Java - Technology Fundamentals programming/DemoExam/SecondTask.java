package DemoExam;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int energy = 100;
        int coins = 100;

        String[] event = in.nextLine().split("\\|+");

        String input = "";

        for (int i = 0; i < event.length; i++) {
            String[] data = event[i].split("-");
            String command = data[0];

            switch (command) {
                case "rest":
                    int number = Integer.parseInt(data[1]);
                    if (energy == 100) {
                        System.out.println("You gained 0 energy.");
                    }
                    if (energy < 100) {
                        int currentHealth = Math.abs(100 - energy);
                        if (currentHealth < number) {
                            System.out.printf("You gained %d energy.%n", currentHealth);
                        } else if (currentHealth > number) {
                            System.out.printf("You gained %d energy.%n", number);
                        }

                        energy += number;

                        if (energy > 100) {
                            energy = 100;
                        }
                    }
                    System.out.printf("Current energy: %d.%n", energy);
                    break;

                case "order":
                    int number1 = Integer.parseInt(data[1]);
                    if (energy - 30 >= 0) {
                        energy -= 30;
                        coins += number1;
                        System.out.printf("You earned %d coins.%n", number1);
                    } else if (energy - 30 < 0) {
                        // energy-=30;
                        energy += 50;
                        System.out.printf("You had to rest!%n");
                        continue;
                    }

                    break;

                default:
                    int number2 = Integer.parseInt(data[1]);
                    if (coins - number2 <= 0) {
                        System.out.printf("Closed! Cannot afford %s.%n", data[0]);
                        return;
                    } else {
                        coins -= number2;
                        System.out.printf("You bought %s.%n", data[0]);
                    }
            }
        }


        System.out.println("Day completed!");
        System.out.printf("Coins: %d%n", coins);
        System.out.printf("Energy: %d%n", energy);

    }
}
