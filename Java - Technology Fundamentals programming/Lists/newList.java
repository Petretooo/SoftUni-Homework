package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class newList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> playerOne = Arrays.stream(in.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> playerTwo = Arrays.stream(in.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        boolean isEmpty = false;
        while (!isEmpty) {


            int firstCardPlayerOne = playerOne.get(0);
            int firstCardPlayerTwo = playerTwo.get(0);

            if (firstCardPlayerOne > firstCardPlayerTwo) {
                playerOne.add(firstCardPlayerOne);
                playerOne.add(firstCardPlayerTwo);
                playerOne.remove(playerOne.get(0));
                playerTwo.remove(playerTwo.get(0));
            } else if (firstCardPlayerTwo > firstCardPlayerOne) {
                playerTwo.add(firstCardPlayerTwo);
                playerTwo.add(firstCardPlayerOne);
                playerTwo.remove(playerTwo.get(0));
                playerOne.remove(playerOne.get(0));
            } else if (firstCardPlayerOne == firstCardPlayerTwo) {
                playerOne.remove(playerOne.get(0));
                playerTwo.remove(playerTwo.get(0));
            }

            if (playerOne.size() == 0 || playerTwo.size() == 0) {
                if (playerOne.size() != 0) {
                    System.out.printf("First player wins! Sum: %d", playerOne.stream().mapToInt(Integer::intValue).sum());
                } else if (playerTwo.size() != 0) {
                    System.out.printf("Second player wins! Sum: %d", playerTwo.stream().mapToInt(Integer::intValue).sum());
                }
                isEmpty = true;
            }


        }

    }
}
