package Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] parameters = Arrays.stream(in.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int elementsPush = parameters[0];
        int elementsPop = parameters[1];
        int elemetsToCheck = parameters[2];

        ArrayDeque<Integer> queueNumbers = new ArrayDeque<>();

        Arrays.stream(in.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .limit(elementsPush)
                .forEach(queueNumbers::add);


        for (int i = 0 ; i< elementsPop ; i++){
            queueNumbers.poll();
        }

        if(queueNumbers.contains(elemetsToCheck)){
            System.out.println("true");
        }else {
            if(queueNumbers.size() == 0){
                System.out.println(0);
            }else {
                System.out.println(Collections.min(queueNumbers));
            }
        }
    }
}
