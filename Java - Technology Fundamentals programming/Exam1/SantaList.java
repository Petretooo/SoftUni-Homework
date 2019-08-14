package Exam1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SantaList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> kids = Arrays.stream(in.nextLine().split("\\&+"))
                .collect(Collectors.toList());


        String input = "";

        while (!"Finished!".equalsIgnoreCase(input = in.nextLine())) {

            String[] data = input.split("\\s+");
            String command = data[0];
            String name = data[1];

            switch (command) {
                case "Bad":
                    if (kids.contains(name)) {
                        continue;
                    } else {
                        kids.add(0, name);
                    }
                    break;
                case "Good":
                    if (kids.contains(name)) {
                        kids.remove(name);
                    } else {
                        continue;
                    }
                    break;
                case "Rename":
                    String newName = data[2];
                    if (kids.contains(name)) {
                        int index = kids.indexOf(name);
                        kids.remove(name);
                        kids.add(index, newName);
                    } else {
                        continue;
                    }
                    break;
                case "Rearrange":
                    if (kids.contains(name)) {
                        int index = kids.indexOf(name);
                        kids.remove(name);
                        kids.add(kids.size(), name);
                    } else {
                        continue;
                    }
                    break;
            }
        }


        System.out.println(kids.toString().replaceAll("[\\[\\]]", ""));

    }
}
