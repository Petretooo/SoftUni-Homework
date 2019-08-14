import java.util.Scanner;

public class whileLoop1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();

        int counter = 1;
        int secondCounter = 0;
        double sum = 0;

        while (counter <= 12) {
            double grade = Double.parseDouble(in.nextLine());
            if (grade < 4.00) {
                secondCounter++;
                if (secondCounter >= 1) {
                    System.out.printf("%s has been excluded at %d grade", name, counter);
                    return;
                }
            }
            counter++;
            sum += grade;
        }
        double result = sum / 12;
        System.out.printf("%s graduated. Average grade: %.2f", name, result);
    }
}
