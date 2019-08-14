package StoilExam;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int firstPlayer = Integer.parseInt(in.nextLine());
        int secondPlayer = Integer.parseInt(in.nextLine());
        String command = "";

        while (!"End of battle".equalsIgnoreCase(command = in.nextLine())){
            if(command.equalsIgnoreCase("one")){
                secondPlayer-=1;
            }else if(command.equalsIgnoreCase("two")){
                firstPlayer-=1;
            }

            if(firstPlayer < 1){
                System.out.println(String.format("Player one is out of eggs. Player two has %d eggs laft", secondPlayer));
                return;
            }
            if(secondPlayer < 1){
                System.out.println(String.format("Player one is out of eggs. Player two has %d eggs laft", firstPlayer));
                return;
            }
        }
        System.out.println(String.format("Player one has %d eggs left.",firstPlayer));
        System.out.println(String.format("Player two has %d eggs left.",secondPlayer));
    }
}
