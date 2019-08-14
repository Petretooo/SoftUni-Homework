package Exam1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PresentDelivery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> houseMembers = Arrays.stream(in.nextLine().split("\\@+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String commands = "";

        int santaPosition = 0;
        int lastPosition = 0;

        while (!"Merry Xmas!".equalsIgnoreCase(commands = in.nextLine())) {
            String[] data = commands.split("\\s+");
            int jump = Integer.parseInt(data[1]);
            while (jump >= houseMembers.size()) {
                jump -= houseMembers.size();
            }

            santaPosition += jump;
            if (santaPosition >= houseMembers.size()) {
                santaPosition -= houseMembers.size();
            }
            lastPosition = santaPosition;
            if ((houseMembers.get(santaPosition) - 2) >= 0) {
                houseMembers.set(santaPosition, houseMembers.get(santaPosition) - 2);
            } else if (houseMembers.get(santaPosition) == 0) {
                System.out.printf("House %d will have a Merry Christmas. %n", santaPosition);
            }
        }

        int count = 0;
        for (int i = 0; i < houseMembers.size(); i++) {
            if (houseMembers.get(i) > 0) {
                count++;
            }
        }
        System.out.printf("Santa's last position was %d.%n", lastPosition);
        if (count == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Santa has failed %d houses.", count);
        }
    }
}