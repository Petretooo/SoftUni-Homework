import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Еnter a number in the range [1...100]: ");
        int num = Integer.parseInt(in.nextLine());
        while (num < 1 || num > 100) {
            System.out.println("Invalid number!");
            System.out.print("Еnter a number in the range [1...100]:");
            num = Integer.parseInt(in.nextLine());
        }
        System.out.println("The number is: " + num);
    }
}
