package Polymorphism.animal;

import Polymorphism.animal.Animal;

public class Cat extends Animal {


    private final static String MEEOW = "MEEOW";

    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        String explain = String.format("%s %n%s",
                super.baseExplain(), MEEOW);
        return explain;
    }
}
