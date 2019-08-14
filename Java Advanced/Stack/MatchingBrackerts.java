package Stack;

import java.util.Scanner;
import java.util.Stack;

public class MatchingBrackerts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String expr = in.nextLine();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0 ; i < expr.length(); i++){
            char openBracket = expr.charAt(i);
            if('(' == openBracket){
                stack.push(i);
            }else if (')'==openBracket){
                System.out.println(expr.substring(stack.pop(), i + 1));
            }
        }

    }
}
