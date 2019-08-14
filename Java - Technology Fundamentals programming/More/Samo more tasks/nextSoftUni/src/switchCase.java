import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String animal = in.nextLine();

        switch (animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
                System.out.println("reptile");
                break;
            case "tortoise":
                System.out.println("reptile");
                break;
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");

        }
    }
}
