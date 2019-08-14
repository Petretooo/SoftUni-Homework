import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Scanner;

public class loop4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = Long.parseLong(in.nextLine());
        int zeros = 0;
        for (long i = n - 1; i > 0; i--) {
            n *= i;
        }
        System.out.println(n);
        while (n % 10 == 0) {
            n /= 10;
            zeros++;
        }

        System.out.println("Zeros are: " + zeros);
    }
}
