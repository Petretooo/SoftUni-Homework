package ClassesAndObjects.VehicleExtendsOOP;

public class Bicycle extends Vehicle {

    public String color;

    public Bicycle(String location, String color) {
        super(location);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void infoForBicycle() {
        System.out.printf("The color of the bicycle is: %s", this.getColor());
    }
}
