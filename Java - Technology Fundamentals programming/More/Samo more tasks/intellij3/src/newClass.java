import java.util.Scanner;

public class newClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    /* int tables = Integer.parseInt(in.nextLine());
     double length = Double.parseDouble(in.nextLine());
     double width = Double.parseDouble(in.nextLine());
     double totalArea = tables * (length + 2 * 0.30) * (width + 2 * 0.30);
     double totalArea1 = tables * (length/2) * (length/2);
     double dollar =  (totalArea*7) + (totalArea1*9);
        System.out.printf("%.2f USD%n", dollar);
        System.out.printf("%.2f BGN", (dollar * 1.85));*/
        int days = Integer.parseInt(in.nextLine());
        int confectioner = Integer.parseInt(in.nextLine());
        int cakes = Integer.parseInt(in.nextLine());
        int waffles = Integer.parseInt(in.nextLine());
        int pancakes = Integer.parseInt(in.nextLine());
        double cakePrice = cakes * 45;
        double wafflePrice = waffles * 5.80;
        double pancakePrice = pancakes * 3.20;
        double totalPrice = (cakePrice + wafflePrice + pancakePrice) * confectioner;
        double priceFromCompany = totalPrice * days;
        System.out.printf("%.2f", (priceFromCompany - (priceFromCompany / 8)));
    }
}
