package Polymorphism.farmLector.farm.animals;

import Polymorphism.farmLector.farm.foods.Food;

public class Zebra extends Mammal {

    public Zebra(String name, String type, double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }


    @Override
    public void eat(Food food){

        super.eat(food);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
