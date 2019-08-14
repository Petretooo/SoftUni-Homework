package Generics.GenericSwap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        List<Box<Integer>> boxes = new ArrayList<>();
        while(n-- >0){
            String str = in.nextLine();
            Box<Integer> box = new Box<>(Integer.parseInt(str));
            boxes.add(box);
        }

        int firstInd = in.nextInt();
        int secondInd = in.nextInt();

        swapElements(boxes, firstInd, secondInd);

        for (Box<Integer> box : boxes) {
            System.out.println(box.toString());
        }
    }

    private static <T>void swapElements(List<Box<T>> boxes, int firstInd, int secondInd) {
        Box<T> temp = boxes.get(firstInd);
        boxes.set(firstInd,boxes.get(secondInd));
        boxes.set(secondInd, temp);
    }
}
