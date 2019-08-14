import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int width = Integer.parseInt(in.nextLine());
        int lenght = Integer.parseInt(in.nextLine());
        int height = Integer.parseInt(in.nextLine());

        int room = width * lenght * height;

        String box = "";
        int sum = 0;

        while (!box.equalsIgnoreCase("Done")) {
            box = in.nextLine();
            if (box.equalsIgnoreCase("done")) {
                if (sum > room) {
                    System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(sum - room));
                } else {
                    System.out.printf("%d Cubic meters left.", Math.abs(sum - room));
                }
                break;
            }
            int boxValue = Integer.parseInt(box);
            sum += boxValue;
            if (sum > room) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(sum - room));
                break;
            }
        }
    }
}
