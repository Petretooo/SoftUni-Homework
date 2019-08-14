package ClassesAndObjects.Car;

public class Car {
    private int numberofWheels;
    private int horsePower;
    private String brand;
    private String model;
    private String location;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public int getNumberofWheels() {
        return numberofWheels;
    }

    public void setNumberofWheels(int numberofWheels) {
        this.numberofWheels = numberofWheels;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String drive(String adress) {
        String result = "Goes " + this.location + " to " + adress;
        //location = adress;
        return result;
    }

    public void printInfo() {
        System.out.println("Model " + this.getModel() + " brand " + this.getBrand());
    }
}
