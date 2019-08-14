import java.io.Console;
import java.math.BigDecimal;
import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double number = Double.parseDouble(in.nextLine());
        String input_unit = in.nextLine();
        String output_unit = in.nextLine();
        int m_mm = 1000;
        int m_cm = 100;
        double m_mi = 0.000621371192;
        double m_in = 39.3700787;
        double m_km = 0.001;
        double m_ft = 3.2808399;
        double m_yd = 1.0936133;

        switch (input_unit) {
            case "m":
                switch (output_unit) {
                    case "m":
                        System.out.println(number + " " + output_unit);
                        break;
                    case "mm":
                        System.out.println(number * m_mm + " " + output_unit);
                        break;
                    case "cm":
                        System.out.println(number * m_cm + " " + output_unit);
                        break;
                    case "mi":
                        System.out.println(number * m_mi + " " + output_unit);
                        break;
                    case "in":
                        System.out.println(number * m_in + " " + output_unit);
                        break;
                    case "km":
                        System.out.println(number * m_km + " " + output_unit);
                        break;
                    case "ft":
                        System.out.println(number * m_ft + " " + output_unit);
                        break;
                    case "yd":
                        System.out.println(number * m_yd + " " + output_unit);
                        break;
                }
                break;
            case "mm":
                switch (output_unit) {
                    case "m":
                        System.out.println(number / m_mm + " " + output_unit);
                        break;
                    case "mm":
                        System.out.println(number + " " + output_unit);
                        break;
                    case "cm":
                        System.out.println((number / m_mm) * m_cm + " " + output_unit);
                        break;
                    case "mi":
                        System.out.println((number / m_mm) * m_mi + " " + output_unit);
                        break;
                    case "in":
                        System.out.println((number / m_mm) * m_in + " " + output_unit);
                        break;
                    case "km":
                        System.out.println((number / m_mm) * m_km + " " + output_unit);
                        break;
                    case "ft":
                        System.out.println((number / m_mm) * m_ft + " " + output_unit);
                        break;
                    case "yd":
                        System.out.println((number / m_mm) * m_yd + " " + output_unit);
                        break;
                }
                break;

            case "cm":
                switch (output_unit) {
                    case "cm":
                        System.out.println((number) + " " + output_unit);
                        break;
                    case "m":
                        System.out.println((number / m_cm) + " " + output_unit);
                        break;
                    case "mm":
                        System.out.println((number / m_cm) * m_mm + " " + output_unit);
                        break;
                    case "mi":
                        System.out.println((number / m_cm) * m_mi + " " + output_unit);
                        break;
                    case "in":
                        System.out.println((number / m_cm) * m_in + " " + output_unit);
                        break;
                    case "km":
                        System.out.println((number / m_cm) * m_km + " " + output_unit);
                        break;
                    case "ft":
                        System.out.println((number / m_cm) * m_ft + " " + output_unit);
                        break;
                    case "yd":
                        System.out.println((number / m_cm) * m_yd + " " + output_unit);
                        break;
                }
                break;

            case "mi":
                switch (output_unit) {
                    case "m":
                        System.out.println((number / m_mi) + " " + output_unit);
                        break;
                    case "mi":
                        System.out.println(number + " " + output_unit);
                        break;
                    case "mm":
                        System.out.println((number / m_mi) * m_mm + " " + output_unit);
                        break;
                    case "cm":
                        System.out.println((number / m_mi) * m_cm + " " + output_unit);
                        break;
                    case "in":
                        System.out.println((number / m_mi) * m_in + " " + output_unit);
                        break;
                    case "km":
                        System.out.println((number / m_mi) * m_km + " " + output_unit);
                        break;
                    case "ft":
                        System.out.println((number / m_mi) * m_ft + " " + output_unit);
                        break;
                    case "yd":
                        System.out.println((number / m_mi) * m_yd + " " + output_unit);
                        break;
                }
                break;

            case "in":
                switch (output_unit) {
                    case "in":
                        System.out.println(number + " " + output_unit);
                        break;
                    case "m":
                        System.out.println((number / m_in) + " " + output_unit);
                        break;
                    case "mm":
                        System.out.println((number / m_in) * m_mm + " " + output_unit);
                        break;
                    case "cm":
                        System.out.println((number / m_in) * m_cm + " " + output_unit);
                        break;
                    case "mi":
                        System.out.println((number / m_in) * m_mi + " " + output_unit);
                        break;
                    case "km":
                        System.out.println((number / m_in) * m_km + " " + output_unit);
                        break;
                    case "ft":
                        System.out.println((number / m_in) * m_ft + " " + output_unit);
                        break;
                    case "yd":
                        System.out.println((number / m_in) * m_yd + " " + output_unit);
                        break;
                }
                break;

            case "km":
                switch (output_unit) {
                    case "km":
                        System.out.println(number + " " + output_unit);
                        break;
                    case "m":
                        System.out.println((number / m_km) + " " + output_unit);
                        break;
                    case "mm":
                        System.out.println((number / m_km) * m_mm + " " + output_unit);
                        break;
                    case "cm":
                        System.out.println((number / m_km) * m_cm + " " + output_unit);
                        break;
                    case "mi":
                        System.out.println((number / m_km) * m_mi + " " + output_unit);
                        break;
                    case "in":
                        System.out.println((number / m_km) * m_in + " " + output_unit);
                        break;
                    case "ft":
                        System.out.println((number / m_km) * m_ft + " " + output_unit);
                        break;
                    case "yd":
                        System.out.println((number / m_km) * m_yd + " " + output_unit);
                        break;
                }
                break;

            case "ft":
                switch (output_unit) {
                    case "ft":
                        System.out.println(number + " " + output_unit);
                        break;
                    case "m":
                        System.out.println((number / m_ft) + " " + output_unit);
                        break;
                    case "mm":
                        System.out.println((number / m_ft) * m_mm + " " + output_unit);
                        break;
                    case "cm":
                        System.out.println((number / m_ft) * m_cm + " " + output_unit);
                        break;
                    case "mi":
                        System.out.println((number / m_ft) * m_mi + " " + output_unit);
                        break;
                    case "in":
                        System.out.println((number / m_ft) * m_in + " " + output_unit);
                        break;
                    case "km":
                        System.out.println((number / m_ft) * m_km + " " + output_unit);
                        break;
                    case "yd":
                        System.out.println((number / m_ft) * m_yd + " " + output_unit);
                        break;
                }
                break;

            case "yd":
                switch (output_unit) {
                    case "yd":
                        System.out.println(number + " " + output_unit);
                        break;
                    case "m":
                        System.out.println((number / m_yd) + " " + output_unit);
                        break;
                    case "mm":
                        System.out.println((number / m_yd) * m_mm + " " + output_unit);
                        break;
                    case "cm":
                        System.out.println((number / m_yd) * m_cm + " " + output_unit);
                        break;
                    case "mi":
                        System.out.println((number / m_yd) * m_mi + " " + output_unit);
                        break;
                    case "in":
                        System.out.println((number / m_yd) * m_in + " " + output_unit);
                        break;
                    case "km":
                        System.out.println((number / m_yd) * m_km + " " + output_unit);
                        break;
                    case "ft":
                        System.out.println((number / m_yd) * m_ft + " " + output_unit);
                        break;
                }
                break;
        }
    }
}