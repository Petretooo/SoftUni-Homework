import java.util.Scanner;

public class variables1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int waterTank = 255;
        int capacity = waterTank;
        int number = Integer.parseInt(in.nextLine());
        int water = 0;
        for (int i = 0; i < number; i++) {
            water = Integer.parseInt(in.nextLine());
            if (capacity - water >= 0) {
                capacity -= water;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        int filled = waterTank - capacity;
        System.out.println(filled);
    }
}
