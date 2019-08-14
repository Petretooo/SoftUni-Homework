package StoilExam;

import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = Integer.parseInt(in.nextLine());

        int maxSum = Integer.MIN_VALUE;
        String maxChef = "";

        for (int i = 0; i < number; i++) {

            String chef = in.nextLine();
            String grades = "";
            int sum = 0;

            while (!"Stop".equalsIgnoreCase(grades = in.nextLine())){
                int grade = Integer.parseInt(grades);
                sum+= grade;
            }
            System.out.println(String.format("%s has %d points.",chef,sum));
            if(sum > maxSum){
                maxSum = sum;
                maxChef = chef;
                System.out.println(String.format("%s is the new number 1!", maxChef));
            }
        }
        System.out.println(String.format("%s won competition with %d points!",maxChef,maxSum));
    }
}
