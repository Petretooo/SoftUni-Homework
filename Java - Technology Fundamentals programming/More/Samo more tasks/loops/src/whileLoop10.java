import java.util.Scanner;

public class whileLoop10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int grades = Integer.parseInt(in.nextLine());

        int counter = 0;
        int secondCounter = 0;
        double sum = 0;

        String task = "";
        String lastTask = "";

        while (true) {

            task = in.nextLine();

            if (task.equalsIgnoreCase("enough")) {

                break;

            }

            int grade = Integer.parseInt(in.nextLine());
            counter++;
            sum += grade;
            lastTask = task;

            if (grade <= 4) {
                secondCounter++;
                if (secondCounter == grades) {
                    break;
                }
            }

        }

        if (task.equalsIgnoreCase("enough")) {

            double finalGrade = sum / counter;

            System.out.printf("Average score: %.2f%n", finalGrade);
            System.out.println("Number of problems: " + counter);
            System.out.println("Last problem: " + lastTask);
        } else {
            System.out.printf("You need a break, %d poor grades.", secondCounter);
        }
    }
}
