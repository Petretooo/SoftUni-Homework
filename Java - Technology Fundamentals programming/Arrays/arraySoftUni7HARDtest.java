package Arrays;

import java.util.Scanner;

public class arraySoftUni7HARDtest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size = Integer.parseInt(in.nextLine());

        String input = "";

        int bestSequenceIndex = Integer.MIN_VALUE;
        int bestSumSequence = 0;
        int bestSequenceIndexRow = 0;
        int bestSequenceRowOutPut = 0;
        String sequenceOutout = "";

        while (!"Clone them!".equals(input = in.nextLine())) {
            ++bestSequenceIndexRow;
            String[] data = input.split("!+");
            int[] numbers = new int[size];
            int index = 0;
            for (int i = 0; i < data.length; i++) {
                numbers[index++] = Integer.parseInt(data[i]);
            }
            int maxCount = 0;
            int sequenceIndex = 0;
            for (int i = 0; i < numbers.length; i++) {
                int currentCount = 0;
                for (int j = i; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        currentCount++;
                        if (currentCount > maxCount) {
                            maxCount = currentCount;
                            sequenceIndex = i;
                        }
                    } else {
                        break;
                    }
                }
            }
            int sequenceSum = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == 1) {
                    sequenceSum += numbers[i];
                }
            }
            if (sequenceIndex < bestSequenceIndex || sequenceSum > bestSumSequence) {
                sequenceOutout = "";
                bestSequenceIndex = sequenceIndex;
                bestSumSequence = sequenceSum;
                bestSequenceRowOutPut = bestSequenceIndexRow;
                for (int i = 0; i < numbers.length; i++) {
                    sequenceOutout += numbers[i] + " ";
                }
            }
        }
        System.out.println(String.format("Best DNA sample %d with sum: %d.",
                bestSequenceRowOutPut, bestSumSequence));

        System.out.println(sequenceOutout.trim());
    }
}