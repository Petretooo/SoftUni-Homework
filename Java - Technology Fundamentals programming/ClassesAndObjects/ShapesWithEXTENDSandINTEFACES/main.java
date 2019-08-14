package ClassesAndObjects.ShapesWithEXTENDSandINTEFACES;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String name = in.nextLine();
        double paument = Double.parseDouble(in.nextLine());
        int hours = Integer.parseInt(in.nextLine());


        Workers w1 = new Workers(name, paument, hours);

        w1.setFines(2);


        System.out.println(w1.calculatePayment());
        System.out.println(w1.employeeDuties());


        OTK otk = new OTK("Gancho", 1500, 30);

        otk.setBonus(1);

        System.out.println(otk.calculatePayment());
        System.out.println(otk.employeeDuties());
    }
}
