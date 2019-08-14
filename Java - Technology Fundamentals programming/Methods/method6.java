package Methods;

import java.util.Scanner;


public class method6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        int counter = 1;
        if (word.length() % 2 == 1) {
            for (int i = word.length() / 2; ; i--) {
                char character = word.charAt(i);
                System.out.println(character);
                break;
            }
        } else if (word.length() % 2 == 0) {
            for (int i = (word.length() - 1) / 2; ; i++) {
                char character = word.charAt(i);
                System.out.print(character);
                if (counter == 2)
                    break;
                counter++;
            }
        }


    }
}
