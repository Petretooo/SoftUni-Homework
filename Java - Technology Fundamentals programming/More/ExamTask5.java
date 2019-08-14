import java.util.Scanner;

public class ExamTask5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double numberPeople = Double.parseDouble(in.nextLine());
        double numberPresents = Double.parseDouble(in.nextLine());

        double counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0;

        for (int i = 1; i <= numberPresents; i++) {

            String type = in.nextLine();

            if (type.equalsIgnoreCase("A")) {
                counter1++;
            } else if (type.equalsIgnoreCase("B")) {
                counter2++;
            } else if (type.equalsIgnoreCase("V")) {
                counter3++;
            } else if (type.equalsIgnoreCase("G")) {
                counter4++;
            }
        }

        System.out.printf("%.2f%%", counter1 / numberPresents * 100);
        System.out.println();
        System.out.printf("%.2f%%", counter2 / numberPresents * 100);
        System.out.println();
        System.out.printf("%.2f%%", counter3 / numberPresents * 100);
        System.out.println();
        System.out.printf("%.2f%%", counter4 / numberPresents * 100);
        System.out.println();
        System.out.printf("%.2f%%", numberPresents / numberPeople * 100);


    }
}
