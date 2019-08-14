package Arrays;

import java.util.Scanner;

public class arrayBook2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] alphabet = new char[70];

        for (char i = 'A'; i <= 'z'; i++) {
            if (i >= 91 && i <= 96) {
                continue;
            } else {
                alphabet[i - 'A'] = i;
            }
        }

        for (char i = 0; i <= 52; i++) {
            System.out.println(alphabet[i]);
        }
        System.out.println();
        String name = in.nextLine();
        System.out.println(name);

        for (int i = 0; i <= name.length(); i++) {
            char c = name.charAt(i);
            for (int j = 0; j <= 52; j++) {
                if (c == alphabet[j]) {
                    System.out.println(j);

                    break;
                }
            }
        }


    }
}
