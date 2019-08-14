package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    for (int l = 1; l <= n; l++) {
                        if (n % i == 0 && n % j == 0 && n % k == 0 && n % l == 0) {
                            System.out.printf(" %d%d%d%d", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}