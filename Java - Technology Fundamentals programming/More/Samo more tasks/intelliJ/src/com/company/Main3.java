package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for (int row = 0; row <= n; row++) {
            int num = row;
            int num1 = n;
            for (int col = 0; col <= n; col++) {
                if (num > n) {
                    num1--;
                    System.out.print(num1 + " ");
                } else {
                    System.out.print(num + " ");
                    num++;
                }
            }
            System.out.println();
        }

    }
}
