import java.util.Scanner;

public class examTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = "";

        boolean isTrue = true;
        int counterInvalid = 0;
        int counterValid = 0;

        while (!name.equalsIgnoreCase("statistic")) {

            name = in.nextLine();

            if (name.equalsIgnoreCase("statistic")) {
                break;
            }

            String b = "";
            String c = "";

            for (int i = 0; i < name.length(); i++) {

                char a = name.charAt(i);

                if ((a >= 0 && a <= 64) || (a >= 91 && a <= 96) || (a >= 123 && a <= 127)) {

                    System.out.println("Invalid name!");
                    counterInvalid++;
                    isTrue = false;
                    break;

                }


                c = c + name.charAt(i);

            }

            if (isTrue) {

                counterValid++;
                String output = c.substring(0, 1).toUpperCase() + c.substring(1, c.length()).toLowerCase();
                System.out.println(output);

            }

            isTrue = true;


        }
        double counter3 = counterInvalid + counterValid;

        System.out.printf("Valid names are %.2f%% from %.0f names.%n", ((counterValid / counter3) * 100), counter3);
        System.out.printf("Invalid names are %.2f%% from %.0f names.%n", ((counterInvalid / counter3) * 100), counter3);


    }
}
