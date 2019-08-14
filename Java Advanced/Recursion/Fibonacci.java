package Recursion;

import java.util.Scanner;

public class Fibonacci {


    private static long[] memory;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());
        memory = new long[num+1];

        System.out.println(fibonacci(num));
    }

    static long fibonacci(int n){
        if(n < 2){
            return 1;
        }
        if(memory[n] != 0){
            return memory[n];
        }
        return memory[n] = fibonacci(n-1) + fibonacci(n-2);
    }
}
