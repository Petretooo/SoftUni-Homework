package InterfacesAndAbstractions.carShop;

import InterfacesAndAbstractions.carShop.Car;

public interface Rentable extends Car {


    int getMinRentDay();
    double getPricePerDay();

}
