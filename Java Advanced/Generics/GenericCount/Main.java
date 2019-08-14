package Generics.GenericCount;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int n = Integer.parseInt(in.nextLine());
        List<Box<Double>> boxes = new ArrayList<>();
        while (n-- > 0) {
            String str = in.nextLine();
            Box<Double> box = new Box<>(Double.parseDouble(str));
            boxes.add(box);
        }
        Box<Double> element = new Box<>(Double.parseDouble(in.nextLine()));
        int count = Box.countGreaterElements(boxes, element);
        System.out.println(count);
    }



}
