package StudentTeachers2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String name;
        String EGN;
        String KAT;
        String FAK;

        List<People2> people2 = new ArrayList<>();


        Students2 s1 = new Students2(name = in.nextLine(), EGN = in.nextLine(), FAK = in.nextLine());
        Students2 s2 = new Students2(name = in.nextLine(), EGN = in.nextLine(), FAK = in.nextLine());


        Teachers2 t1 = new Teachers2(name = in.nextLine(), EGN = in.nextLine(), KAT = in.nextLine());
        Teachers2 t2 = new Teachers2(name = in.nextLine(), EGN = in.nextLine(), KAT = in.nextLine());


        people2.add(s1);
        people2.add(s2);
        people2.add(t1);
        people2.add(t2);

        for (int i = 0; i < people2.size(); i++) {

            if (people2.get(i) instanceof Teachers2) {
                People2 temp = people2.remove(i);
                people2.add(0, temp);
            }
        }


        for (People2 p :
                people2) {
            p.printInfto();
        }


    }
}
