package ClassesAndObjects.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        String input = "";
        List<Order> people = new ArrayList<>();

        while (!"End".equalsIgnoreCase(input = in.nextLine())) {
            String[] data = input.split("\\s+");
            Order person = new Order(data[0], data[1], Integer.parseInt(data[2]));
            people.add(person);
        }

        people.stream().sorted(Comparator.comparing(Order::getAge)).forEach(System.out::println);
    }
}
