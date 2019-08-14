package MainIterOrCompar.ComparingObjects;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        Collections.sort(people, new PersonByAge());

        String input;

        while (!("END").equals(input = in.nextLine())) {

            String[] tokens = input.split("\\s+");

            Person p = new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);

            people.add(p);
        }

        int index = Integer.parseInt(in.nextLine());

        Person find = people.get(index);

        int equalPeople = 0;

        for (Person person : people) {
            if (person.compareTo(find) == 0) {
                equalPeople++;
            }
        }

        if (equalPeople == 1) {
            System.out.println("No matches");
        } else {
            System.out.println(String.format("%d %d %d", equalPeople, people.size() - 1, people.size()));
        }


    }
}
