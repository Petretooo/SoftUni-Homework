package StoilExam;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = Integer.parseInt(in.nextLine());

        int orange = 0;
        int red = 0;
        int blue = 0;
        int green = 0;

        while(number != 0){
            String color = in.nextLine();
            if("Orange".equalsIgnoreCase(color)){
                orange++;
            }else if("Red".equalsIgnoreCase(color)){
                red++;
            }else if("Green".equalsIgnoreCase(color)){
                green++;
            }else if("Blue".equalsIgnoreCase(color)){
                blue++;
            }
            number--;

        }
        String maxEgg = "";
        if(orange > blue && orange > red && orange > green){
            maxEgg = "orange";
        }else if(blue > orange && blue > red && blue > green){
            maxEgg = "blue";
        }else if(red > orange && red > blue && red > green){
            maxEgg = "red";
        }else if(green > orange && green > blue && green > red){
            maxEgg = "green";
        }
        System.out.println(String.format("Red eggs:%d", red));
        System.out.println(String.format("Orange eggs:%d", orange));
        System.out.println(String.format("Blue eggs:%d", blue));
        System.out.println(String.format("Green eggs:%d", green));
        int max = Math.max(Math.max(Math.max(orange,red),blue),green);
        System.out.println(String.format("Max eggs:%d->%s",max,maxEgg));
    }
}
