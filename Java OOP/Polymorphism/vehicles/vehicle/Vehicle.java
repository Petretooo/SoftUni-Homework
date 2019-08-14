package Polymorphism.vehicles.vehicle;

import java.text.DecimalFormat;

public abstract class Vehicle {

    private double fuelQuantity;
    private boolean airConditionIsOn;
    private double fuelConsumption;
    private double additionalConsumption;
    private double tankCapacity;

    protected Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity, double additionalConsumption) {
        this.setFuelQuantity(fuelQuantity);
        this.setAirConditionIsOn();
        this.additionalConsumption = additionalConsumption;
        this.setFuelConsumption(fuelConsumption);
        this.tankCapacity = tankCapacity;
    }


    protected void setFuelConsumption(double fuelConsumption){
        if(airConditionIsOn) {
            this.fuelConsumption = fuelConsumption + additionalConsumption;
        }else {
            this.fuelConsumption = fuelConsumption;
        }
    }

    protected void setFuelQuantity(double fuelQuantity){
        if(fuelQuantity < 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        this.fuelQuantity = fuelQuantity;
    }

    private void setAirConditionIsOn(){
        this.airConditionIsOn = true;
    }

    public String drive(double distance){
        String output = null;
        double fuelNeeded = distance * this.fuelConsumption;

        if (fuelNeeded <= this.fuelQuantity){
            this.fuelQuantity -= fuelNeeded;
            DecimalFormat format =
                    new DecimalFormat("#.##");
            output =
                    String.format(
                            "%s travelled %s km"
                            , this.getClass().getSimpleName()
                            , format.format(distance));
        }else {
            output = String.format("%s needs refueling"
                    , this.getClass().getSimpleName());
        }

        return output;
    }

    public void reFuel(double fuel){
        if(fuel <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if(this.tankCapacity < fuel + this.fuelQuantity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity += fuel;

    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
