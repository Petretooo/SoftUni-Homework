package Encapsulation.Box;

import Encapsulation.Box.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        double length = Double.parseDouble(in.nextLine());
        double width = Double.parseDouble(in.nextLine());
        double height = Double.parseDouble(in.nextLine());

        try {
            Box box = new Box(length, width, height);
            System.out.println(String.format("Surface Area - %.2f", box.calculateSurfaceArea()));
            System.out.println(String.format("Lateral Surface Area - %.2f", box.calculateLateralSurfaceArea()));
            System.out.println(String.format("Volume - %.2f", box.calculateVolume()));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
