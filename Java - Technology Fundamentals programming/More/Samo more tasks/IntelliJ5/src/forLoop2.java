import java.util.Scanner;

public class forLoop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String destination = in.nextLine();
        double priceDestination = Double.parseDouble(in.nextLine());

        double sum = 0;


        while (!destination.equalsIgnoreCase("end")) {

            while (true) {

                double price = Double.parseDouble(in.nextLine());
                sum += price;

                if (sum >= priceDestination) {
                    System.out.printf("Goind to %s!%n", destination);
                    break;
                }
            }
            sum = 0;
            destination = in.nextLine();
            priceDestination = Integer.parseInt(in.nextLine());
            if (destination.equalsIgnoreCase("end")) {
                System.out.printf("%nGoing to %s!%n", destination);
            }
        }

    }
}
