package DemoExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*List<String> elements = Arrays.stream(in.nextLine().split("\\#+"))
                        .collect(Collectors.toList());

*/
        String input = "";

        int bestSum = 0;
        int bestCount = 0;
        int bestLenght = 0;
        String bestBatch = "";


        while (!"Bake It!".equals(input = in.nextLine())) {

            String[] data = input.split("\\#+");


            int sum = 0;
            int count = 0;
            int lenght = 0;

            for (int i = 0; i < data.length; i++) {
                if (Integer.parseInt(data[i]) < -100 && Integer.parseInt(data[i]) > 100) {
                    continue;
                }
                sum += Integer.parseInt(data[i]);
                lenght = data.length;
                count++;

            }


            if (sum > bestSum) {
                bestBatch = "";
                bestSum = sum;
                bestCount = count;
                bestLenght = lenght;
                for (int i = 0; i < data.length; i++) {
                    bestBatch += data[i] + " ";
                }
                continue;
            }

            if (sum == bestSum) {
                int firstSum = sum;
                int secondSum = bestSum;
                double avarageSum1 = (double) firstSum / count;
                double avarageSum2 = (double) secondSum / bestCount;
                if (avarageSum1 > avarageSum2) {
                    bestBatch = "";
                    bestSum = sum;
                    bestLenght = lenght;
                    bestCount = count;
                    for (int i = 0; i < data.length; i++) {
                        bestBatch += data[i] + " ";
                    }
                }
            } else if (bestSum == sum && (bestSum / bestCount == sum / count)) {
                if (lenght < bestLenght) {
                    bestBatch = "";
                    for (int i = 0; i < data.length; i++) {
                        bestSum = sum;
                        bestBatch += data[i] + " ";
                    }

                }
            }


        }


        System.out.println("Best Batch quality: " + bestSum);
        System.out.println(bestBatch.trim());
    }
}
