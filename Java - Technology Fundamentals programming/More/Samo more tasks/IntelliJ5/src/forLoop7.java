import java.util.Scanner;

public class forLoop7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String number = Integer.toString(n);
        int lastNum = n;
        int oneNumber, nextNum;
        int a;
        for (int i = 1; i <= number.length(); i++) {
            oneNumber = lastNum % 10;
            nextNum = (lastNum - oneNumber) / 10;
            lastNum = nextNum;
            if (oneNumber == 0) {
                System.out.println("ZERO");
            }
            for (int j = 1; j <= oneNumber; j++) {
                a = oneNumber + 33;
                System.out.print((char) a);
            }
            if (oneNumber != 0) {
                System.out.println();
            }
        }
    }
}
