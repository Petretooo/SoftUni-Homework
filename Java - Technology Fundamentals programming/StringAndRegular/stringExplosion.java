package StringAndRegular;

import java.util.Scanner;

public class stringExplosion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String text = in.nextLine();
        String result = "";
        int strenght = 0;

        for (int i = 0; i < text.length(); i++) {

            result += text.charAt(i);


            if (text.charAt(i) == '>') {
                strenght += Integer.parseInt(String.valueOf(text.charAt(i + 1)));

            }

            while (strenght > 0) {
                strenght--;
                i++;
                try {
                    //If construction can can be done with -> (i+1 >= text.lenght() || text.chartAt(i+1)=='>')
                    if (text.charAt(i + 1) == '>') {
                        break;
                    }
                } catch (IndexOutOfBoundsException e) {
                    continue;
                }
            }


        }

        System.out.println(result);

    }
}
