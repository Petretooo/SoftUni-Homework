import java.util.Scanner;

public class ExamTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        double lenght = Double.parseDouble(in.nextLine());
        double width = Double.parseDouble(in.nextLine());
        double bar = Double.parseDouble(in.nextLine());

        double sizeRoom = lenght * width;
        double sizeBar = bar * bar;
        double dancing = sizeRoom * 0.19;
        double emptyPlace = sizeRoom - sizeBar - dancing;
        double number = emptyPlace / 3.2;

        System.out.printf("%.0f", Math.ceil(number));


    }
}
