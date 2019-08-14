package Generics;

import java.util.ArrayList;
import java.util.List;

public class SM {

}


class MultiGenericContainer<T, S> {
    private T firstPosition;
    private S secondPosition;

    public MultiGenericContainer(T firstPosition, S secondPosition) {
        this.firstPosition = firstPosition;
        this.secondPosition = secondPosition;
    }

    public T getFirstPosition() {
        return firstPosition;
    }

    public void setFirstPosition(T firstPosition) {
        this.firstPosition = firstPosition;
    }

    public S getSecondPosition() {
        return secondPosition;
    }

    public void setSecondPosition(S secondPosition) {
        this.secondPosition = secondPosition;
    }
}

class yes {
    public static void main(String[] args) {

        MultiGenericContainer<String, String> mondayWeather = new MultiGenericContainer<String, String>("Monday", "Sunny");
        MultiGenericContainer<Integer, Double> dayOfWeekDegrees = new MultiGenericContainer<Integer, Double>(1, 78.0);
        String mondayForecast = mondayWeather.getFirstPosition();
        double sundayDegrees = dayOfWeekDegrees.getSecondPosition();

        System.out.println(mondayForecast);
        System.out.println(sundayDegrees);
    }
}