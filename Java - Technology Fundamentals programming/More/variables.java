import java.util.Scanner;

public class variables {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        String number = in.nextLine();
        int n = 0;
        n = Integer.parseInt(number);
        int sum = 0;

        int temp = 0;
        int temp1 = 0;

        for (int i = 0; i < number.length(); i++) {

            temp = n % 10;
            temp1 = (n - temp) / 10;
            n = temp1;


            sum += temp;

        }
        System.out.println(sum);
    }
}
