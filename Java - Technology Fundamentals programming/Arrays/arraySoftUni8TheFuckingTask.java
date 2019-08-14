package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arraySoftUni8TheFuckingTask {
    private static Object ArrayIndexOutOfBoundsException;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = Integer.parseInt(in.nextLine());

        int[] array = Arrays.stream(in.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] array1 = new int[size];

        for (int i = 0; i < array.length; i++) {
            int indexBug = array[i];
            array1[indexBug] = 1;
        }
        String[] line = in.nextLine().split(" ");

        while (!line[0].equalsIgnoreCase("end")) {


            int index = Integer.parseInt(line[0]);
            String way = line[1];
            int possition = Integer.parseInt(line[2]);

            if (index >= 0 && index < size) {

                if (array1[index] == 1) {
                    array1[index] = 0;

                    if (way.equalsIgnoreCase("left")) {

                        if (possition > 0) {
                            if (index + possition * -1 < 0) {
                                line = in.nextLine().split(" ");
                                continue;
                            }
                        } else if (possition < 0) {
                            if (index + possition > array1.length - 1) {
                                line = in.nextLine().split(" ");
                                continue;
                            }
                        }
                        if (array1[index] != 0) {
                            array1[index + possition * 2] = 1;
                        } else {
                            array1[index + possition * -1] = 1;
                        }

                    } else if (way.equalsIgnoreCase("right")) {

                        if (possition > 0) {
                            if (index + possition * -1 < 0) {
                                line = in.nextLine().split(" ");
                                continue;
                            } else if (index + possition > array1.length - 1) {
                                line = in.nextLine().split(" ");
                                continue;
                            }
                        } else if (possition < 0) {
                            if (index + possition * -1 > array1.length - 1) {
                                line = in.nextLine().split(" ");
                                continue;
                            } else if (index + possition * -1 < 0) {
                                line = in.nextLine().split(" ");
                                continue;
                            }
                        }
                        if (array1[index] != 0) {
                            array1[index + possition * 2] = 1;
                        } else {
                            array1[index + possition] = 1;
                        }
                    }

                }
                    /*else{
                        Basic.array1[index] = 0;
                        if(way.equalsIgnoreCase("left")){
                            if(possition > 0){
                                possition = possition*-1;
                            }
                            if(index + possition < 0){
                                line = in.nextLine().split(" ");
                                continue;
                            }
                            if(Basic.array1[index] != 0){
                                Basic.array1[index+possition*2] = 1;
                            }else {
                                Basic.array1[index + possition] = 1;
                            }
                        }else if(way.equalsIgnoreCase("right")){
                            if(index + possition > Basic.array1.length-1){
                                line = in.nextLine().split(" ");
                                continue;
                            }
                            if(Basic.array1[index] != 0){
                                Basic.array1[index + possition*2] = 1;
                            }else {
                                Basic.array1[index + possition] = 1;
                            }
                        }
                    }*/

            }

            line = in.nextLine().split(" ");
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array1[i] + " ");
        }


    }
}
