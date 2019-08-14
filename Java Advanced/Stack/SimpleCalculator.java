package Stack;

import java.util.Scanner;
import java.util.Stack;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        Stack<String> s = new Stack<>();
        String exp = in.nextLine();

        String[] els = exp.split("\\s+");

        for (int i = els.length-1 ; i >= 0 ; i--){
            s.push(els[i]);
        }

        while(s.size() > 1){
            Integer firstNum = Integer.parseInt(s.pop());
            String op = s.pop();
            Integer secondNum = Integer.parseInt(s.pop());

            if("+".equalsIgnoreCase(op)){
                s.push(firstNum+secondNum+"");
            }else {
                s.push(firstNum-secondNum+"");
            }
        }

        System.out.println(s.peek());



    }
}
