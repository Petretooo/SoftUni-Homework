package Arrays;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LadyBugs {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int fieldSize = Integer.parseInt(in.nextLine());


        int[] ladybugs = new int[fieldSize];

        int[] ladybugIndices = Arrays.stream(in.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .filter(e -> e >= 0 && e < fieldSize)
                .toArray();


        for (int i = 0; i < ladybugIndices.length; i++) {
            ladybugs[ladybugIndices[i]] = 1;
        }

        String input = "";

        while (!"end".equalsIgnoreCase(input = in.nextLine())) {
            String[] data = input.split("\\s+");

            int ladybigIndex = Integer.parseInt(data[0]);
            String command = data[1];
            int flyLenght = Integer.parseInt(data[2]);


            if (ladybigIndex >= 0 && ladybigIndex < ladybugs.length
                    && ladybugs[ladybigIndex] == 1) {
                ladybugs[ladybigIndex] = 0;
                while (true) {
                    switch (command) {
                        case "left":
                            ladybigIndex -= flyLenght;
                            break;

                        case "right":
                            ladybigIndex += flyLenght;
                            break;
                    }

                    if (ladybigIndex < 0 || ladybigIndex >= fieldSize) {
                        break;
                    }

                    if (ladybugs[ladybigIndex] == 1) {
                        continue;
                    }

                    if (ladybugs[ladybigIndex] == 0) {
                        ladybugs[ladybigIndex] = 1;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.stream(ladybugs)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));


    }
}
