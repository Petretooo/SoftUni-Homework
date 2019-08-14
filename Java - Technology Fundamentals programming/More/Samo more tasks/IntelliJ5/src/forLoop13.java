import java.util.Scanner;

public class forLoop13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int daily = Integer.parseInt(in.nextLine());

        String fish = "";
        char fish1;

        int counter = 0;
        double sum = 0;
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;

        while (!fish.equalsIgnoreCase("stop")) {
            fish = in.nextLine();
            if (fish.equalsIgnoreCase("stop")) {
                break;
            }
            double kilo = Double.parseDouble(in.nextLine());
            counter++;
            for (int i = 0; i < fish.length(); i++) {
                fish1 = fish.charAt(i);
                sum += fish1;
            }
            sum1 = sum / kilo;

            if (counter % 3 == 0) {
                sum3 += sum1;
            } else {
                sum2 += sum1;
            }

            if (counter == daily) {
                System.out.println("Lyubo fulfilled the quota!");
                break;
            }


            sum = 0;
            sum1 = 0;
        }
        if (sum3 > sum2) {
            System.out.printf("Lyubo's profit from %d fishes is %.2f leva.", counter, Math.abs(sum3 - sum2));
        } else if (sum2 > sum3) {
            System.out.printf("Lyubo lost %.2f leva today.", Math.abs(sum2 - sum3));
        }


    }
}