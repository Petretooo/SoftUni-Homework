package ClassesAndObjects.VehicleExtendsOOP;

public class Vehicle {

    private int year;
    private String brand;
    private String model;
    private String location;

    public Vehicle(String location) {
        this.location = location;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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


    public String drive(String address) {
        String result = "Goes from " + this.getLocation() + " to " + address;
        return result;
    }


    public void modelBrand() {
        System.out.println("There is no brand or model of the bicycle");
    }
}
