package Exam1;

import java.util.Scanner;

public class SoftuniReception {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int totalPerHour = 0;

        for (int i = 0; i < 3; i++) {
            int employee = Integer.parseInt(in.nextLine());
            totalPerHour += employee;
        }

        int students = Integer.parseInt(in.nextLine());
        int hour = 0;
        int restHour = 0;
        if (totalPerHour > students) {
            System.out.println("Time needed: " + ++hour);
            return;
        } else {

            while (students > 0) {

                hour++;

                if (hour % 4 != 0) {
                    students -= totalPerHour;
                }
                if (hour % 4 == 0) {
                    restHour++;
                }


            }

        }

        System.out.printf("Time needed: %dh.", hour);


    }
}
