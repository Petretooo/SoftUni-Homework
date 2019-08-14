package Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class thirdTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> elements = Arrays.stream(in.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = "";

        while (!"Retire!".equals(input = in.nextLine())) {

            String[] data = input.split(" - ");
            String command = data[0];

            if (command.equals("Start")) {
                if (!elements.contains(data[1])) {
                    elements.add(data[1]);
                }
            } else if (command.equals("Complete")) {
                elements.remove(data[1]);
            } else if (command.equals("Side Quest")) {
                String[] questData = data[1].split(":");
                String questName = questData[0];
                String sideQuest = questData[1];

                int index = elements.indexOf(questName);
                if (index != -1 && !elements.contains(sideQuest)) {
                    elements.add(index + 1, sideQuest);
                }

            } else if (command.equals("Renew")) {
                if (elements.contains(data[1])) {
                    elements.remove(data[1]);
                    elements.add(data[1]);
                }
            }


        }
        for (int i = 0; i < elements.size(); i++) {
            if (i == elements.size() - 1) {
                System.out.print(elements.get(i));
            } else {
                System.out.print(elements.get(i) + ", ");
            }

        }

    }
}
