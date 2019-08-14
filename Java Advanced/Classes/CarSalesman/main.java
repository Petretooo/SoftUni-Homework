package Classes.CarSalesman;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        Map<String, List<Engine>> engines = new LinkedHashMap<>();
        Map<String, List<Car>> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] engineLine = in.nextLine().split("\\s+");
            Engine engine;
            String model = engineLine[0];
            int power = Integer.parseInt(engineLine[1]);
            int displacement;
            String efficiency;
            if(engineLine.length ==2){
                displacement = -1;
                efficiency = "n/a";
                engine = new Engine(model,power,displacement,efficiency);
                if(!engines.containsKey(model)){
                    engines.put(model, new ArrayList<>());
                    engines.get(model).add(engine);
                }else {
                    engines.get(model).add(engine);
                }
            }
            if (engineLine.length == 3) {
                if (tryParse(engineLine[2])) {
                    displacement = Integer.parseInt(engineLine[2]);
                    efficiency = "n/a";
                    engine = new Engine(model, power, displacement, efficiency);
                    if(!engines.containsKey(model)){
                        engines.put(model, new ArrayList<>());
                        engines.get(model).add(engine);
                    }else {
                        engines.get(model).add(engine);
                    }

                } else {
                    displacement = -1;
                    efficiency = engineLine[2];
                    engine = new Engine(model, power, displacement, efficiency);
                    if(!engines.containsKey(model)){
                        engines.put(model, new ArrayList<>());
                        engines.get(model).add(engine);
                    }else {
                        engines.get(model).add(engine);
                    }

                }
            } else if (engineLine.length == 4) {
                displacement = Integer.parseInt(engineLine[2]);
                efficiency = engineLine[3];
                engine = new Engine(model, power, displacement, efficiency);
                if(!engines.containsKey(model)){
                    engines.put(model, new ArrayList<>());
                    engines.get(model).add(engine);
                }else {
                    engines.get(model).add(engine);
                }

            }
        }

        int m = Integer.parseInt(in.nextLine());
        for (int i = 0; i < m; i++) {
            String[] carLine = in.nextLine().split("\\s+");
            Car car;
            String carModel = carLine[0];
            String engineModel = carLine[1];

            int weight;
            String color;
            if(carLine.length ==2){
                weight =-1;
                color = "n/a";
                car = new Car(carModel,engines.get(engineModel).get(0), weight,color);
                engines.remove(0);
                if(!cars.containsKey(carModel)){
                    cars.put(carModel, new ArrayList<>());
                    cars.get(carModel).add(car);
                }else {
                    cars.get(carModel).add(car);
                }
            }

            if (carLine.length == 3) {
                if (tryParse(carLine[2])) {
                    weight = Integer.parseInt(carLine[2]);
                    color = "n/a";
                    car = new Car(carModel, engines.get(engineModel).get(0), weight, color);
                    engines.remove(0);
                    if(!cars.containsKey(carModel)){
                        cars.put(carModel, new ArrayList<>());
                        cars.get(carModel).add(car);
                    }else {
                        cars.get(carModel).add(car);
                    }
                } else {
                    weight = -1;
                    color = carLine[2];
                    car = new Car(carModel, engines.get(engineModel).get(0), weight, color);
                    engines.remove(0);
                    if(!cars.containsKey(carModel)){
                        cars.put(carModel, new ArrayList<>());
                        cars.get(carModel).add(car);
                    }else {
                        cars.get(carModel).add(car);
                    }
                }
            } else if (carLine.length == 4) {
                weight = Integer.parseInt(carLine[2]);
                color = carLine[3];
                car = new Car(carModel, engines.get(engineModel).get(0), weight, color);
                engines.remove(0);
                if(!cars.containsKey(carModel)){
                    cars.put(carModel, new ArrayList<>());
                    cars.get(carModel).add(car);
                }else {
                    cars.get(carModel).add(car);
                }

            }
        }
        System.out.println();

        cars.values().forEach(car -> System.out.println(car.toString().replaceAll("[\\[\\]\\,]", "")));


    }

    private static boolean tryParse(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
