package Methods;

import java.util.Scanner;

public class method3 {

    public static void allCharacterBetweenTwo(char a, char b) {
        if (a > b)
            for (int i = b + 1; i < a; i++) {

                System.out.print((char) i + " ");
            }
        else {
            for (int i = a + 1; i < b; i++) {

                System.out.print((char) i + " ");
            }
        }

    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char firstCharacter = in.nextLine().charAt(0);
        char secondCharacter = in.nextLine().charAt(0);


        allCharacterBetweenTwo(firstCharacter, secondCharacter);
    }
}
