package Exam;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FirstTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Glass = 25;
        int Aluminium = 50;
        int Lithium = 75;
        int CarbonFiber = 100;


        ArrayDeque<Integer> liquids = Arrays.stream(in.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(ArrayDeque::new));


        ArrayDeque<Integer> physical = new ArrayDeque<>();
        Arrays.stream(in.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(physical::push);


        HashMap<String, Integer> items = new HashMap<>();

        int countGlass = 0;
        int countAlum = 0;
        int countLith = 0;
        int countCar = 0;


        while (!liquids.isEmpty() || !physical.isEmpty()) {
            int liq = liquids.poll();
            int psy = physical.pop();

            int sum = liq + psy;

            if (sum == Glass) {
                countGlass++;
                if (items.containsKey("Glass")) {
                    items.put("Glass", countGlass);
                } else {
                    items.put("Glass", countGlass);
                }
            } else if (sum == Aluminium) {
                countAlum++;
                if (items.containsKey("Aluminium")) {
                    items.put("Aluminium", countAlum);
                } else {
                    items.put("Aluminium", countAlum);
                }
            } else if (sum == Lithium) {
                countLith++;
                if (items.containsKey("Lithium")) {
                    items.put("Lithium", countLith);
                } else {
                    items.put("Lithium", countLith);
                }
            } else if (sum == CarbonFiber) {
                countCar++;
                if (items.containsKey("Carbon fiber")) {
                    items.put("Carbon fiber", countCar);
                } else {
                    items.put("Carbon fiber", countCar);
                }
            } else {
                psy += 3;
                physical.push(psy);

            }



            if (liquids.isEmpty()) {
                break;
            }
            if(physical.isEmpty()){
                break;
            }


        }


        if (items.containsKey("Glass")) {
            items.put("Glass", countGlass);
        } else {
            items.put("Glass", countGlass);
        }

        if (items.containsKey("Aluminium")) {
            items.put("Aluminium", countAlum);
        } else {
            items.put("Aluminium", countAlum);
        }

        if (items.containsKey("Lithium")) {
            items.put("Lithium", countLith);
        } else {
            items.put("Lithium", countLith);
        }

        if (items.containsKey("Carbon fiber")) {
            items.put("Carbon fiber", countCar);
        } else {
            items.put("Carbon fiber", countCar);
        }


        boolean isFull = true;


//        for (String s : items.keySet()) {
//            if (items.get(s) > 1 || items.get(s) == 0) {
//                isFull = false;
//            }
//        }

        if(countAlum == 0){
            isFull = false;
        }
        if(countCar == 0){
            isFull = false;
        }
        if(countGlass == 0){
            isFull = false;
        }
        if(countLith == 0){
            isFull = false;
        }






        if (isFull) {
            System.out.println("Wohoo! You succeeded in building the spaceship!");
            if (liquids.isEmpty()) {
                System.out.println("Liquids left: none");
            } else {
                System.out.printf("Liquids left: %s", String.join(", ",liquids.toString().replaceAll("[\\[\\]]","")));
                System.out.println();
            }

            if (physical.isEmpty()) {
                System.out.println("Physical items left: none");
            } else {
                System.out.printf("Physical items left: %s", String.join(", ",physical.toString().replaceAll("[\\[\\]]","")));
                System.out.println();

            }

            System.out.println("Aluminium: " + countAlum);
            System.out.println("Carbon fiber: " + countCar);
            System.out.println("Glass: " + countGlass);
            System.out.println("Lithium: " + countLith);

        } else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to build the spaceship.");
            if (liquids.isEmpty()) {
                System.out.println("Liquids left: none");
            } else {
                System.out.printf("Liquids left: %s", String.join(", ",liquids.toString().replaceAll("[\\[\\]]","")));
                System.out.println();
            }

            if (physical.isEmpty()) {
                System.out.println("Physical items left: none");
            } else {
                System.out.printf("Physical items left: %s", String.join(", ",physical.toString().replaceAll("[\\[\\]]","")));
                System.out.println();
            }

            System.out.println("Aluminium: " + countAlum);
            System.out.println("Carbon fiber: " + countCar);
            System.out.println("Glass: " + countGlass);
            System.out.println("Lithium: " + countLith);



        }


    }
}
