package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (true) {
            int min = Integer.MAX_VALUE;

            int sum = 0;
            String name = in.nextLine();

            for (int i = 0; i <= name.length(); i++) {
                sum += (int) name.charAt(i);
                if (name.equalsIgnoreCase("stop")) {
                    break;
                }
                if (i == name.length()) {
                    break;
                }
            }
            if (sum < min) {
                min = sum;
            }
            System.out.println(min);
            continue;
        }

    }
}