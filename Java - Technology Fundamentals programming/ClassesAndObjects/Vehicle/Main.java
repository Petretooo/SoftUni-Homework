package ClassesAndObjects.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String input = "";

        List<Vehicle> vehicles = new ArrayList<>();

        while (!"End".equals(input = in.nextLine())) {
            String[] data = input.split("\\s+");
            Vehicle vehicle = new Vehicle(data[0], data[1], data[2],
                    Integer.parseInt(data[3]));

            vehicles.add(vehicle);

        }

        String model = in.nextLine();

        while (!"Close the Catalogue".equals(model)) {
            String finalModel = model;
            vehicles.stream().filter(v -> v.getModel().equals(finalModel))
                    .forEach(System.out::println);

            model = in.nextLine();
        }
        System.out.println(String.format("Cars have average horsepower of: %.2f.",
                avarage(vehicles.stream().filter(v -> v.getType().equals("car")).collect(Collectors.toList()))));
        System.out.println(String.format("Trucks have average horsepower of: %.2f.",
                avarage(vehicles.stream().filter(v -> v.getType().equals("truck")).collect(Collectors.toList()))));


    }


    public static double avarage(List<Vehicle> vehicles) {
        if (vehicles.size() == 0) {
            return 0.0;
        }
        double sum = 0;

        for (Vehicle vehicle : vehicles) {
            sum += vehicle.getHorsePower();
        }
        return sum / vehicles.size();


    }


}
