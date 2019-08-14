package ClassesAndObjects.Car;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String brand = in.nextLine();
        String model = in.nextLine();
        String address = in.nextLine();
        String from = in.nextLine();


        Car vehicle = new Car(brand, model);

        vehicle.setLocation(from);

        System.out.println(vehicle.drive(address));
        vehicle.printInfo();

    }
}
