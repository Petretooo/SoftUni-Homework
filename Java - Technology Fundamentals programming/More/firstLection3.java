import java.util.Scanner;

public class firstLection3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double money = Double.parseDouble(in.nextLine());
        int students = Integer.parseInt(in.nextLine());
        double lightsabers = Double.parseDouble(in.nextLine());
        double robes = Double.parseDouble(in.nextLine());
        double belts = Double.parseDouble(in.nextLine());

        double lightSabers = Math.ceil(students * 1.1);
        double robesCount = students;
        double beltsCount = (students == 0) ? 0 : students - (students / 6);

        double totalPrice = lightSabers * lightsabers + robesCount * robes + beltsCount * belts;

        if (money >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", Math.abs(totalPrice - money));
        }
    }
}
