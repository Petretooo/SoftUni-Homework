import java.util.Scanner;

public class ifElse8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        double x1 = Double.parseDouble(in.nextLine());
        double y1 = Double.parseDouble(in.nextLine());
        double x2 = Double.parseDouble(in.nextLine());
        double y2 = Double.parseDouble(in.nextLine());
        double x = Double.parseDouble(in.nextLine());
        double y = Double.parseDouble(in.nextLine());


        /*  x съвпада с x1 или x2 и същевременно y е между y1 и y2
            y съвпада с y1 или y2 и същевременно x е между x1 и x2*/

        if (x == x1 && y >= y1 && y <= y2 || x == x2 && y >= y1 && y <= y2 ||
                y == y1 && x >= x1 && x <= x2 || y == y2 && x >= x1 && x <= x2) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }


    }
}
