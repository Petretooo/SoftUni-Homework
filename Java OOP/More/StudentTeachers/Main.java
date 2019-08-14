package StudentTeachers;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<People> people = new ArrayList<>();

        Students s1 = new Students();
        s1.setEGN("1234567");
        s1.setFakNum("1804853725");
        s1.setName("Peter");


        Students s2 = new Students();
        s2.setEGN("43556");
        s2.setFakNum("7567568");
        s2.setName("Ivanka");

        Teachers t1 = new Teachers("Georgi", "1258702", "i");
        Teachers t2 = new Teachers("Michael", "125870532", "fi");


        people.add(s1);
        people.add(s2);
        people.add(t1);
        people.add(t2);


        for (int i = 0; i < people.size(); i++) {

            if (people.get(i) instanceof Teachers) {
                People temp = people.remove(i);
                people.add(0, temp);
            }

        }

        for (People p : people) {
            p.printInfo();
        }


    }
}
