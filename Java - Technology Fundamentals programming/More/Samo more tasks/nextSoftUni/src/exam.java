import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        //      Scanner in = new Scanner(System.in);
       /* int numberSectors = Integer.parseInt(in.nextLine());
        int capacity = Integer.parseInt(in.nextLine());
        double priceTicket = Double.parseDouble(in.nextLine());
        double profit = (capacity*priceTicket)/numberSectors;
        double totalProfit = profit * numberSectors;
        System.out.printf("Total income - %.2f BGN%n", totalProfit);
        double carity = (totalProfit - (profit * 0.75))/8;
        System.out.printf("Money for charity - %.2f BGN", carity);*/


        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        System.out.println(a + b);
        System.out.println((char) (a + b));


    }
}
