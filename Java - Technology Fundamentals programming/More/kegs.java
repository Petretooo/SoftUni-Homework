import java.util.Scanner;

public class kegs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int number = Integer.parseInt(in.nextLine());

        double formula = 0;
        double maxFormula = 0;
        String maxKeg = "";
        for (int i = 0; i < number; i++) {
            String keg = in.nextLine();
            for (int j = 0; j < 1; j++) {
                double radius = Double.parseDouble(in.nextLine());
                double height = Double.parseDouble(in.nextLine());
                formula = 3.14 * Math.pow(radius, 2) * height;
            }
            if (formula > maxFormula) {
                maxFormula = formula;
                maxKeg = keg;
            }
            formula = 0;
        }
        System.out.println(maxKeg);
    }
}
