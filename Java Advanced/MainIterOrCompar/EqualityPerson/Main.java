package MainIterOrCompar.EqualityPerson;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        TreeSet<Person> peopleTree = new TreeSet<>();
        HashSet<Person> peopleHash = new HashSet<>();




        int n = in.nextInt();
        while (n-- > 0) {
            String input = in.nextLine();
            String[] tokens = input.split("\\s+");

            Person p = new Person(tokens[0], Integer.parseInt(tokens[1]));


            peopleTree.add(p);
            peopleHash.add(p);

            input = in.nextLine();
        }

        System.out.println(peopleTree.size());
        System.out.println(peopleHash.size());



    }
}
