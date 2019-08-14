package Methods;

import java.util.Scanner;

public class method7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String password = in.nextLine();


        password(password);


    }

    private static void password(String password) {

        boolean isTrue = true;

        if (isTrue) {

            if (password.length() < 6 || password.length() > 10) {
                System.out.println("Password must be between 6 and 10 characters");
                isTrue = false;
            }

            for (int i = 0; i < password.length(); i++) {
                char character = password.charAt(i);
                if (character >= 32 && character <= 47 ||
                        character >= 58 && character <= 64 ||
                        character >= 91 && character <= 96 ||
                        character >= 123 && character <= 127) {
                    System.out.println("Password must consist only of letters and digits");
                    isTrue = false;
                    break;
                }
            }
            int counter = 0;
            for (int i = 0; i < password.length(); i++) {
                char character = password.charAt(i);
                if (character >= 48 && character <= 57) {
                    counter++;
                }
            }
            if (counter < 2) {
                isTrue = false;
                System.out.println("Password must have at least 2 digits");
            }
        }

        if (isTrue) {
            System.out.println("Password is valid");
        }


    }
}
