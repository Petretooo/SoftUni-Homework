package DemoExam;

import java.util.*;

public class ClubParty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hallCapacity = Integer.parseInt(in.nextLine());
        String[] input = in.nextLine().split("\\s+");
        Stack<String> hallsAndReservations = initializeStack(input, hallCapacity);

        Queue<String> halls = new LinkedList<>();
        Queue<Integer> currentHallReservation = new LinkedList<>();

        int currentHallCapacity =0;


        while(!hallsAndReservations.isEmpty()){
            String currentElement = hallsAndReservations.pop();
            if(Character.isDigit(currentElement.charAt(0))){
                int reservation = Integer.parseInt(currentElement);
                if(currentHallCapacity + reservation > hallCapacity){
                    printHall(halls, currentHallReservation);
                    currentHallCapacity=0;
                }
                if(halls.isEmpty()){
                    continue;
                }
                currentHallCapacity+=reservation;
                currentHallReservation.offer(reservation);
            }else {
                halls.offer(currentElement);
            }
        }
    }

    private static void printHall(Queue<String> halls, Queue<Integer> currentHallReservation) {
        System.out.print(halls.poll() + " -> ");
        while (!currentHallReservation.isEmpty()) {
            if(currentHallReservation.size()==1){
                System.out.print(currentHallReservation.poll());
            }else {
                System.out.print(currentHallReservation.poll()+", ");
            }

        }
        System.out.println();
    }

    private static Stack<String> initializeStack(String[] input, int hallCapacity) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < input.length; i++) {
            stack.push(input[i]);
        }
        return stack;
    }
}