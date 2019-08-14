import java.util.Scanner;

public class exam4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        String command = "";
        int goals;
        int min = 1000;
        int yes = 0;
        while (true) {
            name = in.nextLine();
            if (name.equalsIgnoreCase("end")) {
                break;
            }
            goals = Integer.parseInt(in.nextLine());
            if (goals == yes) {
                break;
            }
            command = name;
            yes = goals;
            if (goals < min) {
                min = goals;
            } else {
                min = goals;
            }
            if (goals >= 10) {
                min = goals;
                break;
            }
        }
        System.out.println();
        System.out.printf("%s is the best player!%n", command);
        if (min >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", min);
        } else if (min < 3) {
            System.out.printf("He has scored %d goals.", min);
        }
    }
}


// 90 / 100           https://pastebin.com/M4rYwnmh


//        https://judge.softuni.bg/Contests/Practice/Index/1127#10