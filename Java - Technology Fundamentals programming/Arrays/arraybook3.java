package Arrays;

import java.math.BigDecimal;
import java.util.Scanner;

public class arraybook3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigDecimal BD = new BigDecimal("");

        int n = Integer.parseInt(in.nextLine());
        int highestSnow = 0;
        int highestTime = 0;
        int highestQuality = 0;
        BigDecimal B = new BigDecimal("0");

        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(in.nextLine());
            int snowballTime = Integer.parseInt(in.nextLine());
            int snowballQuality = Integer.parseInt(in.nextLine());
            BigDecimal formula = new BigDecimal(snowballSnow / snowballTime);
            formula = BD.pow(snowballQuality);
            int a = formula.compareTo(B);
            if (a == 1) {
                highestSnow = snowballSnow;
                highestTime = snowballTime;
                highestQuality = snowballQuality;
                B = formula;
            }
        }
        System.out.printf("%d : %d = %d (%d)", highestSnow, highestTime, B, highestQuality);
    }
}
