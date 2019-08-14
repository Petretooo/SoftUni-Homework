import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int person1 = Integer.parseInt(in.nextLine());
        int person2 = Integer.parseInt(in.nextLine());
        int person3 = Integer.parseInt(in.nextLine());
        int sum = person1 + person2 + person3;
        if (sum < 60) {
            if (sum >= 0 && sum <= 9) {
                System.out.println("0:0" + sum);
            } else {
                System.out.println("0:" + sum);
            }
        } else if (sum >= 60 && sum < 120) {
            sum -= 60;
            if (sum >= 0 && sum <= 9) {
                System.out.println("1:0" + sum);
            } else {
                System.out.println("1:" + sum);
            }
        } else if (sum >= 120 && sum < 180) {
            sum -= 120;
            if (sum >= 0 && sum <= 9) {
                System.out.println("2:0" + sum);
            } else {
                System.out.println("2:" + sum);
            }
        } else if (sum == 180) {
            System.out.println("3:00");
        }
    }
}
