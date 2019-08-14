package Classes.RowData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = Integer.parseInt(in.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < count; i++) {

            String[] tokens = in.nextLine().split("\\s+");
            String model = tokens[0];
            int speed = Integer.parseInt(tokens[1]);
            int power = Integer.parseInt(tokens[2]);
            int weight = Integer.parseInt(tokens[3]);
            String type = tokens[4];
            List<Tire> tires = new ArrayList<>();
            for (int j = 5; j < tokens.length-1; j+=2) {
                double pressure = Double.parseDouble(tokens[j]);
                int age = Integer.parseInt(tokens[j + 1]);
                tires.add(new Tire(pressure, age));
            }
            Engine engine = new Engine(speed, power);
            Cargo cargo = new Cargo(weight, type);

            cars.add(new Car(model, engine, cargo, tires));


        }

        String command = in.nextLine();

        if (command.equals("fragile")) {

            cars.stream()
                    .filter(s -> s.getCargo().getType().equals("fragile"))
                    .filter(s -> {
                        for (Tire tire: s.getTires()){
                            if(tire.getPressure() <1){
                                return true;
                            }
                        }
                        return false;
                    }).forEach(s -> System.out.println(s.getModel()));
        }else if(command.equals("flamable")) {

            cars.stream().filter(car -> car.getCargo().getType().equals("flamable")).filter(car -> car.getEngine().getPower() > 250).forEach(car -> System.out.println(car.getModel()));

        }
    }
}
