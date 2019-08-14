package StoilExam;

import java.util.Scanner;

public class firstTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int people = Integer.parseInt(in.nextLine());
        int budget = Integer.parseInt(in.nextLine());

        int peopleSecond = people;
        int counterKozunak = 0;
        while(peopleSecond > 0){
            peopleSecond-=3;
            counterKozunak++;
        }

        int eggsPeople = people*2;

        double kuzunakPrice = counterKozunak*4;
        double eggsPrice = eggsPeople * 0.45;

        double totalSum = kuzunakPrice + eggsPrice;


        if(totalSum > budget){
            System.out.println("Lyobo doesn't have enough money.");
            System.out.println(String.format("He needs %.2f lv. more.", Math.abs(totalSum-budget)));
        }else {
            System.out.println(String.format("Lyobo bought %d Eastern bread and %d",counterKozunak,eggsPeople ));
            System.out.println(String.format("He has %.2f lv. left.", Math.abs(totalSum-budget)));
        }
    }
}
