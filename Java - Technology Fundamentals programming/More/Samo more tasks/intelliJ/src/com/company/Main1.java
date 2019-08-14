package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");


        while (true) {
            double avarage = 0;
            int badGrades = 0;
            int goodGrades = 0;
            double sum = 0;


            String name = in.nextLine();

            for (int i = 1; i <= 12; i++) {
                String grade1 = in.nextLine();

                while (!grade1.equalsIgnoreCase("end")) {
                    if (grade1.equalsIgnoreCase("end")) {
                        System.out.println();
                        System.out.println();
                    }

                    double grade = Double.parseDouble(grade1);
                    sum += grade;

                    if (grade >= 4) {
                        goodGrades++;
                        break;
                    }

                    if (grade < 4 && grade > 1) {
                        badGrades++;
                        break;
                    }
                }
                if (grade1.equalsIgnoreCase("end")) {
                    if (badGrades >= 1) {
                        System.out.printf("%s has been excluded at: %d grade%n", name, badGrades);
                    }
                    break;
                }
            }
            avarage = sum / 12;
            if (goodGrades >= 12 || goodGrades >= 11) {
                System.out.printf("%n%s graduated. Average grade: %.2f", name, avarage);
                continue;
            } else if (badGrades <= 1) {
                System.out.printf("%s has been excluded at: %.2f grade%n", name, badGrades);
                break;
            }
        }

    }
}
