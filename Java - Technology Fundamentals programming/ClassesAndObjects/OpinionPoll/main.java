package ClassesAndObjects.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        List<Opinion> people = new ArrayList<>();

        while (n-- > 0) {
            String[] data = in.nextLine().split("\\s+");
            String name = data[0];
            int age = Integer.parseInt(data[1]);

            Opinion person = new Opinion(name, age);
            people.add(person);


        }

        people.stream().filter(person -> person.getAge() > 30)
                .sorted(Comparator.comparing(Opinion::getName))
                .forEach(System.out::println);


    }
}
