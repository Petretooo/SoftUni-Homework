package ClassesAndObjects.VehicleExtendsOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String location = in.nextLine();
        String from = in.nextLine();
        String color = in.nextLine();

        Bicycle vehicle = new Bicycle(location, color);

        System.out.println(vehicle.drive(from));
        vehicle.infoForBicycle();
        vehicle.modelBrand();
    }
}
