import java.util.Scanner;

public class beg1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double currency = Double.parseDouble(in.nextLine());
        String currencyIn = in.nextLine();
        String currencyOut = in.nextLine();
        if (currencyIn.equalsIgnoreCase("BGN")) {
            if (currencyOut.equalsIgnoreCase("EUR")) {
                double value = currency / 1.95583;
                System.out.printf("%.2f", value);
            } else if (currencyOut.equalsIgnoreCase("USD")) {
                double value = currency / 1.79549;
                System.out.printf("%.2f", value);
            } else if (currencyOut.equalsIgnoreCase("GBP")) {
                double value = currency / 2.53405;
                System.out.printf("%,2f", value);
            }
        } else if (currencyIn.equalsIgnoreCase("EUR")) {
            if (currencyOut.equalsIgnoreCase("BGN")) {
                double value = currency * 2.53405;
                System.out.printf("%.2f", value);
            } else if (currencyOut.equalsIgnoreCase("USD")) {
                double value = currency * 1.08930;
                System.out.printf("%.2f", value);
            } else if (currencyOut.equalsIgnoreCase("GBP")) {
                double value = currency * 0.77181;
                System.out.printf("%,2f", value);
            }
        } else if (currencyIn.equalsIgnoreCase("USD")) {
            if (currencyOut.equalsIgnoreCase("BGN")) {
                double value = currency * 1.79549;
                System.out.printf("%.2f", value);
            } else if (currencyOut.equalsIgnoreCase("EUR")) {
                double value = currency * 0.91801;
                System.out.printf("%.2f", value);
            } else if (currencyOut.equalsIgnoreCase("GBP")) {
                double value = currency * 0.70854;
                System.out.printf("%.2f", value);
            }
        } else if (currencyIn.equalsIgnoreCase("GBP")) {
            if (currencyOut.equalsIgnoreCase("BGN")) {
                double value = currency * 0.39462;
                System.out.printf("%.2f", value);
            } else if (currencyOut.equalsIgnoreCase("USD")) {
                double value = currency * 2.53405 / 1.79549;
                System.out.printf("%.2f", value);
            } else if (currencyOut.equalsIgnoreCase("EUR")) {
                double value = currency * 0.77181;
                System.out.printf("%.2f", value);
            }
        }
    }
}
