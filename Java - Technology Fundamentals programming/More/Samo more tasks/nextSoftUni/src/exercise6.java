import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int steps = Integer.parseInt(in.nextLine());
        int dancers = Integer.parseInt(in.nextLine());
        int days = Integer.parseInt(in.nextLine());

        double stepsDays = Math.ceil((double) steps / days / steps * 100);
        double procentStepsByDancer = stepsDays / dancers;

        if (stepsDays < 13) {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", procentStepsByDancer);
        } else if (stepsDays > 13) {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.", procentStepsByDancer);
        }
    }
}
