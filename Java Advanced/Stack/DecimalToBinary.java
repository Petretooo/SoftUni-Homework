package Stack;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        String numberText = in.nextLine();

        for (int i = 0 ; i < numberText.length() ; i++){
            int num = Integer.parseInt(String.valueOf(numberText.charAt(i)));
            if(num == 0){
                stack.push(num);
            }else {
                while(num != 0){
                    stack.push(num % 2);
                    num /= 2;
                }
            }
        }

        System.out.println(stack);

    }
}
