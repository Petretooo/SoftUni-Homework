import java.util.Scanner;

public class ExamTask6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int male = Integer.parseInt(in.nextLine());
        int female = Integer.parseInt(in.nextLine());
        int numberTables = Integer.parseInt(in.nextLine());

        int counter = 0;

        for (int i = 1; i <= male; i++) {
            for (int j = 1; j <= female; j++) {

                if (counter == numberTables) {
                    return;
                }

                System.out.print("(" + i + " <-> " + j + ")" + " ");

                counter++;
            }
        }


    }
}
