package Polymorphism.farmLector.farm.animals;

public class Cat extends Feline {

    private String breed;

    public Cat(String name, String type, double weight, String livingRegion, String breed) {
        super(name, type, weight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        String baseToStr = super.toString();

        int index = baseToStr.indexOf(",");

        StringBuilder sb = new StringBuilder(baseToStr);

        sb.insert(index+2, this.breed + ", ");

        return sb.toString();
    }
}
