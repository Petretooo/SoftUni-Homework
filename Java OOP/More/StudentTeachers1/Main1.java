package StudentTeachers1;

import StudentTeachers.People;
import StudentTeachers.Teachers;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String name;
        String EGN;
        String KAT;
        String FAK;


        List<People1> people1s = new ArrayList<>();

        Students1 s1 = new Students1(name = in.nextLine(), EGN = in.nextLine(), FAK = in.nextLine());
        Students1 s2 = new Students1(name = in.nextLine(), EGN = in.nextLine(), FAK = in.nextLine());

        Teachers1 t1 = new Teachers1(name = in.nextLine(), EGN = in.nextLine(), KAT = in.nextLine());
        Teachers1 t2 = new Teachers1(name = in.nextLine(), EGN = in.nextLine(), KAT = in.nextLine());


        people1s.add(s1);
        people1s.add(s2);
        people1s.add(t1);
        people1s.add(t2);


        //Teachers references first
        for (int i = 0; i < people1s.size(); i++) {

            if (people1s.get(i) instanceof Teachers1) {
                People1 temp = people1s.remove(i);
                people1s.add(0, temp);
            }
        }
        for (People1 p : people1s) {
            p.printInfo();
        }
        System.out.println();


        //sum ot the list by EGN
        int sum = 0;
        for (People1 p : people1s) {
            sum += Integer.parseInt(p.getEGN());
        }
        System.out.println(sum);
        System.out.println();


        //Reversed sublist ot the list and sorted
        List<People1> subPeople = new ArrayList<>();
        for (int i = 0; i < people1s.size(); i++) {
            if (people1s.get(i) instanceof Students1) {
                subPeople.add(people1s.get(i));
                people1s.remove(i);
                i = 0;
            }
        }
        Collections.sort(subPeople, Comparator.comparing(People1::getName));
        people1s.addAll(0, subPeople);
        for (People1 p : people1s) {
            p.printInfo();
        }
        System.out.println();


        //sorting by name
        Collections.sort(people1s, Comparator.comparing(People1::getName));
        for (People1 p : people1s) {
            p.printInfo();
        }
        System.out.println();


        //sorting by EGN
        Collections.sort(people1s, Comparator.comparing(People1::getEGN));
        for (People1 p :
                people1s) {
            p.printInfo();
        }
        System.out.println();


        // output by Students
        for (People1 p : people1s) {
            if (p instanceof Students1) {
                p.printInfo();
            }

        }
        System.out.println();


        //MAX by EGN
        int max = Integer.MIN_VALUE;
        People1 temp = null;
        for (People1 p : people1s) {
            if (Integer.parseInt(p.getEGN()) > max) {
                max = Integer.parseInt(p.getEGN());
                temp = p;
            }
        }
        temp.printInfo();
        System.out.println();


    }
}