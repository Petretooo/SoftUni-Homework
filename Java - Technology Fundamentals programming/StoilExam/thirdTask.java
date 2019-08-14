package StoilExam;

import java.util.Scanner;

public class thirdTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String size = in.nextLine();
        String color = in.nextLine();
        int numberEggs = Integer.parseInt(in.nextLine());

        int price = 0;
        double finalPrice = 0;
        if(color.equalsIgnoreCase("Red")){
            if(size.equalsIgnoreCase("small")){
                price = 9;
                finalPrice = numberEggs * price;
                finalPrice = finalPrice - (finalPrice*0.35);
                System.out.println(String.format("%.2f leva.",finalPrice));
            }else if(size.equalsIgnoreCase("Medium")){
                price = 13;
                finalPrice = numberEggs * price;
                finalPrice = finalPrice - (finalPrice*0.35);
                System.out.println(String.format("%.2f leva.",finalPrice));
            }else if(size.equalsIgnoreCase("Large")){
                price = 16;
                finalPrice = numberEggs * price;
                finalPrice = finalPrice - (finalPrice*0.35);
                System.out.println(String.format("%.2f leva.",finalPrice));
            }
        }else if(color.equalsIgnoreCase("Green")){
            if(size.equalsIgnoreCase("small")){
                price = 8;
                finalPrice = numberEggs * price;
                finalPrice = finalPrice - (finalPrice*0.35);
                System.out.println(String.format("%.2f leva.",finalPrice));
            }else if(size.equalsIgnoreCase("Medium")){
                price = 9;
                finalPrice = numberEggs * price;
                finalPrice = finalPrice - (finalPrice*0.35);
                System.out.println(String.format("%.2f leva.",finalPrice));
            }else if(size.equalsIgnoreCase("Large")){
                price = 12;
                finalPrice = numberEggs * price;
                finalPrice = finalPrice - (finalPrice*0.35);
                System.out.println(String.format("%.2f leva.",finalPrice));
            }
        }else if(color.equalsIgnoreCase("Yellow")){
            if(size.equalsIgnoreCase("small")){
                price = 5;
                finalPrice = numberEggs * price;
                finalPrice = finalPrice - (finalPrice*0.35);
                System.out.println(String.format("%.2f leva.",finalPrice));
            }else if(size.equalsIgnoreCase("Medium")){
                price = 7;
                finalPrice = numberEggs * price;
                finalPrice = finalPrice - (finalPrice*0.35);
                System.out.println(String.format("%.2f leva.",finalPrice));
            }else if(size.equalsIgnoreCase("Large")){
                price = 9;
                finalPrice = numberEggs * price;
                finalPrice = finalPrice - (finalPrice*0.35);
                System.out.println(String.format("%.2f leva.",finalPrice));
            }
        }
    }
}
