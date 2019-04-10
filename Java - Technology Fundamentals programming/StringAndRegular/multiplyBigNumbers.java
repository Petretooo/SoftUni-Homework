package StringAndRegular;

import java.math.BigInteger;
import java.util.Scanner;

public class multiplyBigNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger firstNumber = new BigInteger(in.nextLine());
        BigInteger secondNumber = new BigInteger(in.nextLine());
        BigInteger result = firstNumber.multiply(secondNumber);
        System.out.println(result);
    }
}
