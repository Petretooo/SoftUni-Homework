package Polymorphism.mathOperation;

public class MathOperation {


    public int add(int a, int b){
        return this.sumTwoNumbers(a,b);
    }
    public int add(int a, int b, int c){
        return this.sumTwoNumbers(a,b,c);
    }
    public int add(int a, int b, int c, int d){
        return this.sumTwoNumbers(a,b,c,d);
    }


    private int sumTwoNumbers(int... args){
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
