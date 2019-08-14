import java.util.Scanner;

public class whileLoop11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double needMoney = Double.parseDouble(in.nextLine());
        double haveMoney = Double.parseDouble(in.nextLine());

        double diference = 0;

        int secondCounter = 0;
        int counter = 0;
        double sum = 0;

        while (true) {

            String word = in.nextLine();

            double money = Double.parseDouble(in.nextLine());
            counter++;

            if (word.equalsIgnoreCase("spend")) {
                secondCounter++;
                haveMoney -= money;
                if (haveMoney < 0) {
                    haveMoney = 0;
                }
            } else if (word.equalsIgnoreCase("save")) {
                secondCounter = 0;
                haveMoney += money;
            }

            if (word.equalsIgnoreCase("spend")) {
                if (secondCounter == 5) {
                    System.out.println("You can't save the money.");
                    System.out.println(counter);
                    break;
                }
            } else if (haveMoney >= needMoney) {
                System.out.printf("You saved the money for %d days.", counter);
                break;
            }


        }
    }
}
