package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            String destination = in.nextLine();
            double neededMoney = Double.parseDouble(in.nextLine());
            double money = 0;
            String saving = "";
            while (true) {
                saving = in.nextLine();
                if (saving.equalsIgnoreCase("end")) {
                    return;
                }
                money += Double.parseDouble(saving);
                if (money >= neededMoney) {
                    System.out.println();
                    System.out.printf("Going to %s", destination);
                    break;
                }
            }
            continue;
        }
    }
}