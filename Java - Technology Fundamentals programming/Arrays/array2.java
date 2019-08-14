package Arrays;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String firstText = in.nextLine();
        String[] firstTextArray = firstText.split(" ");

        int firstLength = firstTextArray.length;

        char[] first = new char[firstLength];
        for (int i = 0; i < first.length; i++) {
            first[i] = firstTextArray[i].charAt(0);
        }

        String secondText = in.nextLine();
        String[] secondTextArray = secondText.split(" ");

        char[] second = new char[secondTextArray.length];
        for (int i = 0; i < second.length; i++) {
            second[i] = secondTextArray[i].charAt(0);
        }

        int smallerLength = Math.min(first.length, second.length);

        char[] smallest = first.length <= second.length ? first : second;
        char[] biggest = second.length > first.length ? second : first;

        for (int i = 0; i < smallerLength; i++) {
            if (first[i] < second[i]) {
                break;
            }
            if (second[i] < first[i]) {
                smallest = second;
                biggest = first;
                break;
            }
        }

        for (int i = 0; i < smallest.length; i++) {
            System.out.print(smallest[i]);
        }
        System.out.println();
        for (int i = 0; i < biggest.length; i++) {
            System.out.print(biggest[i]);
        }
    }
}
