import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double width = Double.parseDouble(in.nextLine());
        double length = Double.parseDouble(in.nextLine());
        double height = Double.parseDouble(in.nextLine());
        double astronautLenght = Double.parseDouble(in.nextLine());

        double vRocket = width * length * height;
        double vRoom = (astronautLenght + 0.4) * 2 * 2;

        double numberAstronaut = Math.floor(vRocket / vRoom);

        if (numberAstronaut >= 3 && numberAstronaut <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.%n", numberAstronaut);
        } else if (numberAstronaut < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (numberAstronaut > 10) {
            System.out.println("The spacecraft is too big.");
        }
    }
}
