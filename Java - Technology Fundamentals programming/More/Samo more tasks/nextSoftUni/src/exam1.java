import java.util.Scanner;

public class exam1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double priceTicketGo = Double.parseDouble(in.nextLine());
        double priceTicketCome = Double.parseDouble(in.nextLine());
        double priceTicketMatch = Double.parseDouble(in.nextLine());
        int numberMatches = Integer.parseInt(in.nextLine());
        double procent = Double.parseDouble(in.nextLine());
        double sumTicket = (priceTicketGo + priceTicketCome) * 6;
        double ticketAfterDifference = sumTicket - (sumTicket * (procent * 0.01));
        double totalSum = numberMatches * 6 * priceTicketMatch;
        double sumNeedPay = totalSum + ticketAfterDifference;
        System.out.printf("Total sum: %.2f lv.%n", sumNeedPay);
        System.out.printf("Each friend has to pay %.2f lv.", (sumNeedPay / 6));
    }
}
