import java.util.Scanner;

public class exam5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int budget = Integer.parseInt(in.nextLine());
        int n = Integer.parseInt(in.nextLine());
        String article;
        int sum = 0;
        int i = 0;
        while (i < n) {
            article = in.nextLine();
            i++;
            if (article.equalsIgnoreCase("hoodie")) {
                sum += 30;
            } else if (article.equalsIgnoreCase("keychain")) {
                sum += 4;
            } else if (article.equalsIgnoreCase("T-shirt")) {
                sum += 20;
            } else if (article.equalsIgnoreCase("flag")) {
                sum += 15;
            } else if (article.equalsIgnoreCase("sticker")) {
                sum += 1;
            }
            if (i == n) {
                System.out.println();
                if (sum <= budget) {
                    System.out.printf("You bought %d items and left with %d lv.", i, (budget - sum));
                } else if (sum > budget) {
                    System.out.printf("Not enough money, you need %d more lv.", Math.abs(budget - sum));
                }
            }
        }
    }
}
