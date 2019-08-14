package InterfacesAndAbstractions.car;

public class Seat implements Car {

    private String model;
    private String color;
    private int horsePower;
    private String countryProduced;

    public Seat(String model, String color, Integer horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    public String getCountryProduced() {
        return countryProduced;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public int getHorsePower() {
        return 0;
    }

    @Override
    public String countryProduced() {
        return null;
    }


    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires", this.getModel(), this.countryProduced(), TIRES);
    }
}
