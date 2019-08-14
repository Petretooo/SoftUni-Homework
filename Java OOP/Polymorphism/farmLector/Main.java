package Polymorphism.farmLector;

import Polymorphism.farmLector.farm.animals.*;
import Polymorphism.farmLector.farm.foods.Food;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input;


        List<Animal> animals = new ArrayList<>();
        while(!"End".equals(input = in.nextLine())){

            String[] animalTokens = input.split("\\s+");
            String[] foodTokens = in.nextLine().split("\\s+");


            Animal animal = produceAnimal(animalTokens);

            Food food = produceFood(foodTokens);

            animal.makeSound();

            try {
                animal.eat(food);
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

            animals.add(animal);
        }

        animals.forEach( e -> System.out.println(e.toString()));

    }

    private static Food produceFood(String[] foodTokens) {
        String type = foodTokens[0];

        Food food = null;
        try {
            Class foodClass = Class.forName("Polymorphism.farmLector.Polymorphism.farm.farm.foods." + type);
            Constructor constructor = foodClass.getConstructor(int.class);
            food = (Food) constructor.newInstance(Integer.parseInt(foodTokens[1]));
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return food;
    }

    private static Animal produceAnimal(String[] tokens) {
        Animal animal = null;

        String type = tokens[0];

        if(type.equals("Mouse")){
            animal = new Mouse(tokens[1], tokens[0], Double.parseDouble(tokens[2]), tokens[3]);
        }else if(type.equals("Zebra")){
            animal = new Zebra(tokens[1], tokens[0], Double.parseDouble(tokens[2]), tokens[3]);
        }else if(type.equals("Cat")){
            animal = new Cat(tokens[1], tokens[0], Double.parseDouble(tokens[2]), tokens[3], tokens[4]);
        }else if(type.equals("Tiger")){
            animal = new Tiger(tokens[1], tokens[0], Double.parseDouble(tokens[2]), tokens[3]);

        }

        return animal;
    }
}
