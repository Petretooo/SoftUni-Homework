package Polymorphism.farmLector.farm.animals;

public class Tiger extends Feline {

    public Tiger(String name, String type, double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public String toString() {
        return  super.toString();
    }
}
