package Methods;

import java.util.Scanner;

public class method8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String polindrome = in.nextLine();


        while (!polindrome.equalsIgnoreCase("end")) {

            for (int i = 0; i < polindrome.length(); i++) {
                char character = polindrome.charAt(0);
                char character1 = polindrome.charAt(polindrome.length() - 1);

                if (character % character1 == 0) {
                    System.out.println("true");
                    break;
                } else {
                    System.out.println("false");
                    break;
                }
            }

            polindrome = in.nextLine();

        }
    }
}
