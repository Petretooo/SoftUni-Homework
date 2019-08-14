package ClassesAndObjects.ShapesWithEXTENDSandINTEFACES;

import java.util.Scanner;

public class mainShape {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        {//RECTANGLE

            double a = Double.parseDouble(in.nextLine());
            double b = Double.parseDouble(in.nextLine());

            Rectangle r = new Rectangle(a, b);

            System.out.println(r.calculateArea());
            System.out.println(r.calculatePerimeter());


        }

        {//Triangle

            double a = Double.parseDouble(in.nextLine());
            double b = Double.parseDouble(in.nextLine());
            double c = Double.parseDouble(in.nextLine());
            double h = Double.parseDouble(in.nextLine());

            Triangle t = new Triangle(a, b, c, h);

            System.out.println(t.calculateArea());
            System.out.println(t.calculatePerimeter());

        }

        {//Hexagon

            double a = Double.parseDouble(in.nextLine());

            Hexagon h = new Hexagon(a);

            System.out.println(h.calculateArea());
            System.out.println(h.calculatePerimeter());

        }


    }
}
