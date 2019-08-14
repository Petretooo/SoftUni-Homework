import java.util.Scanner;

public class ExamTask4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double budget = Double.parseDouble(in.nextLine());
        String type = "";
        String flowers = "", balloons = "", candles = "", ribbon = "";


        double sum = 0;
        double price = 0;
        int flowersNum = 0, ballonsNum = 0, candlesNum = 0, ribbonNum = 0;

        while (!type.equalsIgnoreCase("Stop")) {
            type = in.nextLine();

            if (type.equalsIgnoreCase("Stop")) {
                System.out.printf("Spend money: %.2f%n", sum);
                System.out.printf("Money left: %.2f%n", Math.abs(budget - sum));
                System.out.printf("Purchased decoration is %d %s, %d m %s, %d %s and %d %s.%n", ballonsNum, balloons, ribbonNum, ribbon, flowersNum, flowers, candlesNum, candles);
                break;
            }

            int number = Integer.parseInt(in.nextLine());

            if (type.equalsIgnoreCase("flowers")) {
                price = number * 1.5;
            } else if (type.equalsIgnoreCase("balloons")) {
                price = number * 0.1;
            } else if (type.equalsIgnoreCase("candles")) {
                price = number * 0.5;
            } else if (type.equalsIgnoreCase("ribbon")) {
                price = number * 2;
            }

            sum += price;

            if (type.equalsIgnoreCase("flowers")) {
                flowers = type;
                flowersNum += number;
            } else if (type.equalsIgnoreCase("balloons")) {
                balloons = type;
                ballonsNum += number;
            } else if (type.equalsIgnoreCase("candles")) {
                candles = type;
                candlesNum += number;
            } else if (type.equalsIgnoreCase("ribbon")) {
                ribbon = type;
                ribbonNum += number;
            }


            if (sum >= budget) {
                System.out.println("All money is spent!");
                System.out.printf("Purchased decoration is %d %s, %d m %s, %d %s and %d %s.%n", ballonsNum, balloons, ribbonNum, ribbon, flowersNum, flowers, candlesNum, candles);
                break;
            }
        }
    }
}
