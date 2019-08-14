package StudentsLectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        List<People> people = new ArrayList<>();

        String name;
        String EGN;
        double salary;
        String gender;
        double grade;


        Students s1 = new Students(name = in.nextLine(), EGN = in.nextLine(), gender = in.nextLine(), grade = Double.parseDouble(in.nextLine()));
        Students s2 = new Students(name = in.nextLine(), EGN = in.nextLine(), gender = in.nextLine(), grade = Double.parseDouble(in.nextLine()));

        Lectors t1 = new Lectors(name = in.nextLine(), EGN = in.nextLine(), salary = Double.parseDouble(in.nextLine()));
        Lectors t2 = new Lectors(name = in.nextLine(), EGN = in.nextLine(), salary = Double.parseDouble(in.nextLine()));


        people.add(s1);
        people.add(s2);
        people.add(t1);
        people.add(t2);


        double max = Double.MIN_VALUE;
        People person = null;
        for (People p : people) {
            if (p instanceof Students) {
                if (((Students) p).getGender().equals("famale")) {
                    if (((Students) p).getGrade() > max) {
                        person = p;
                        max = ((Students) p).getGrade();
                    }
                }
            }
        }

        person.printInfo();

        int counter = 0;
        double sum = 0;
        for (People p : people) {
            if (p instanceof Lectors) {
                sum += ((Lectors) p).getSalary();
                counter++;
            }
        }

        System.out.println("Avarage salary: " + (sum / counter));


    }
}
