package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int l = Integer.parseInt(in.nextLine());
        for (int d1 = 1; d1 <= n; d1++) {
            for (int d2 = 1; d2 <= n; d2++) {
                for (char l1 = 'a'; l1 <= 'a' + 1; l1++) {
                    for (char l2 = 'a'; l2 <= 'a' + 1; l2++) {
                        for (int d3 = Math.max(d1, d2) + 1; d3 <= n; d3++) {
                            System.out.printf(" %d%d%c%c%d", d1, d2, l1, l2, d3);
                        }
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
