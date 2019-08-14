package Generics.GenericBoxOfInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int n = Integer.parseInt(in.nextLine());

        while(n-- > 0){
            int str = Integer.parseInt(in.nextLine());

            Box<Integer> box = new Box<>(str);

            System.out.println(box.toString());
        }
    }

}
