package Polymorphism.vehicles;


import Polymorphism.vehicles.vehicle.Bus;
import Polymorphism.vehicles.vehicle.Car;
import Polymorphism.vehicles.vehicle.Truck;
import Polymorphism.vehicles.vehicle.Vehicle;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Vehicle car = produceVehicle(in.nextLine().split("\\s+"));
        Vehicle truck = produceVehicle(in.nextLine().split("\\s+"));
        Vehicle bus = produceVehicle(in.nextLine().split("\\s+"));
        Map<String, Vehicle> vehicles = new LinkedHashMap<>();

        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        int n = Integer.parseInt(in.nextLine());

        while(n-- > 0){
            String[] tokens = in.nextLine().split("\\s+");
            String output = null;

            try {
                if (tokens[0].equals("Drive") || tokens[0].equals("DriveEmpty")) {
                    output = vehicles.get(tokens[1]).drive(Double.parseDouble(tokens[2]));
                } else {
                    vehicles.get(tokens[1]).reFuel(Double.parseDouble(tokens[2]));
                }
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

            if(output != null){

                System.out.println(output);

            }
        }

        vehicles.forEach((key, value) -> System.out.println(value));
    }

     public static Vehicle produceVehicle(String[] data) {
        Vehicle vehicle = null;
        if (data[0].equals("Car")) {
            vehicle = new Car(
                    Double.parseDouble(data[1]),
                    Double.parseDouble(data[2]),
                    Double.parseDouble(data[3]));
        } else if(data[0].equals("Truck")){
            vehicle = new Truck(
                    Double.parseDouble(data[1]),
                    Double.parseDouble(data[2]),
                    Double.parseDouble(data[3]));
        }else if(data[0].equals("Bus")){
            vehicle = new Bus(
                    Double.parseDouble(data[1]),
                    Double.parseDouble(data[2]),
                    Double.parseDouble(data[3]));
        }
        return vehicle;
    }
}
