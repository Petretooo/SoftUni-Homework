package Arrays;

import java.util.Scanner;

public class arraySoftUni7HARD {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        String input = "";

        int bestSequenceIndex = Integer.MAX_VALUE;
        int bestSequenceSum = 0;
        int bestSequenceIndexRow = 0;
        int bestSequenceIndexRowOutput = 0;
        String sequenceOutout = "";

        while (!"Clone them!".equals(input = in.nextLine())) {
            ++bestSequenceIndexRow;
            String[] data = input.split("!+");
            int[] sequenceDNA = new int[n];
            int index = 0;
            for (int i = 0; i < data.length; i++) {
                sequenceDNA[index++] = Integer.parseInt(data[i]);
            }
            int maxCount = 0;
            int squenceIndex = 0;
            for (int i = 0; i < sequenceDNA.length; i++) {
                int currentCount = 0;
                for (int j = i; j < sequenceDNA.length; j++) {
                    if (sequenceDNA[i] == sequenceDNA[j]) {
                        currentCount++;
                        if (currentCount > maxCount) {
                            maxCount = currentCount;
                            squenceIndex = i;
                        }
                    } else {
                        break;
                    }
                }
            }
            int sequenceSum = 0;
            for (int i = 0; i < sequenceDNA.length; i++) {
                if (sequenceDNA[i] == 1) {
                    sequenceSum += sequenceDNA[i];
                }
            }
            if (squenceIndex < bestSequenceIndex || sequenceSum > bestSequenceSum) {
                sequenceOutout = "";
                bestSequenceIndex = squenceIndex;
                bestSequenceSum = sequenceSum;
                bestSequenceIndexRowOutput = bestSequenceIndexRow;
                for (int i = 0; i < sequenceDNA.length; i++) {
                    sequenceOutout += sequenceDNA[i] + " ";
                }
            }
        }
        System.out.println(String.format("Best DNA sample %d with sum: %d.",
                bestSequenceIndexRowOutput, bestSequenceSum));

        System.out.println(sequenceOutout.trim());
    }
}