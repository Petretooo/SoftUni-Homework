import java.util.Scanner;

public class newClass1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       /* double length = Double.parseDouble(in.nextLine());
        double width = Double.parseDouble(in.nextLine());
        double sideWardrobe = Double.parseDouble(in.nextLine());
        double room = (length*100) * (width*100);
        double sizeWardrobe = (sideWardrobe*100) * (sideWardrobe*100);
    double sizeBench = room / 10;
    double freeSpace = room - sizeWardrobe - sizeBench;
    double numberOfDancers = freeSpace / (40+7000);
        System.out.printf("%.0f", Math.floor(numberOfDancers));*/

        double pricewhiskey = Double.parseDouble(in.nextLine());
        double beer = Double.parseDouble(in.nextLine());
        double wine = Double.parseDouble(in.nextLine());
        double rakia = Double.parseDouble(in.nextLine());
        double whiskey = Double.parseDouble(in.nextLine());
        double priceRakia = pricewhiskey / 2;
        double priceWine = priceRakia - (priceRakia * 0.4);
        double priceBeer = priceRakia - (priceRakia * 0.8);
        double sumRakia = rakia * priceRakia;
        double sumWine = wine * priceWine;
        double sumBeer = beer * priceBeer;
        double sumWhiskey = pricewhiskey * whiskey;
        System.out.printf("%.2f", (sumBeer + sumRakia + sumWine + sumWhiskey));
    }
}