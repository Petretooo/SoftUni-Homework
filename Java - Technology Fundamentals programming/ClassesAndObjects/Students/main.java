package ClassesAndObjects.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        List<Students> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = in.nextLine().split("\\s+");
            Students students = new Students(data[0], data[1], Double.parseDouble(data[2]));
            people.add(students);
        }

        people.stream().sorted((e1, e2) -> Double.compare(e2.getGrade(), e1.getGrade()))
                .forEach(System.out::println);

    }
}
