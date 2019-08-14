package Queues;

import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Robotics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] input = in.nextLine().split(";");

        String[] robots = new String[input.length];
        int[] processTime = new int[input.length];
        int[] workTime = new int[input.length];

        for (int i = 0 ; i < input.length ; i++) {
            String[] data = input[i].split("-");
            String name = data[0];
            int time = Integer.parseInt(data[1]);
            robots[i] = name;
            processTime[i] = time;
        }

        String startTime = in.nextLine();

        ArrayDeque<String> products = new ArrayDeque<>();
        String inputProduct;
        while (!("End").equalsIgnoreCase(inputProduct = in.nextLine())){
            products.offer(inputProduct);
        }

        String[] timeData = startTime.split(":");
        int hours = Integer.parseInt(timeData[0]);
        int minutes = Integer.parseInt(timeData[1]);
        int seconds = Integer.parseInt(timeData[2]);

        int beginSecond = hours * 3600 + minutes * 60 + seconds;
        while (!products.isEmpty()){
            beginSecond++;

            String product = products.poll();
            boolean isAssigned = false;
            for (int i = 0; i < robots.length; i++) {
                if(workTime[i] == 0 && !isAssigned){
                    workTime[i] = processTime[i];
                    isAssigned = true;
                    printRobotsData(robots[i], product, beginSecond);
                }
                if(workTime[i] > 0){
                    workTime[i]--;
                }

            }

            if(!isAssigned){
                products.offer(product);
            }

        }


    }

    private static void printRobotsData(String robot, String product, int beginSecond) {
        long s = beginSecond %60;
        long m = (beginSecond / 60) % 60;
        long h = (beginSecond / (60*60))%24;
        System.out.println(robot + " - " + product +
                String.format(" [%02d:%02d:%02d]",h,m,s));


    }
}
