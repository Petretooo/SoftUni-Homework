package Exam1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftuniCoursePlanning {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> course = Arrays.stream(in.nextLine().split(", "))
                .collect(Collectors.toList());


        String input = "";

        while (!"course start".equalsIgnoreCase(input = in.nextLine())) {

            String[] data = input.split("\\:+");
            String command = data[0];
            String lessonTitle = "";
            switch (command) {

                case "Add":
                    lessonTitle = data[1];
                    if (course.contains(lessonTitle)) {
                        continue;
                    } else {
                        course.add(course.size(), lessonTitle);
                    }
                    break;
                case "Insert":
                    lessonTitle = data[1];
                    int index = Integer.parseInt(data[2]);

                    if (course.contains(lessonTitle)) {
                        continue;
                    } else {
                        if (index >= 0 && index < course.size()) {
                            course.add(index, lessonTitle);
                        }
                    }
                    break;
                case "Remove":
                    lessonTitle = data[1];
                    if (course.contains(lessonTitle)) {
                        course.remove(lessonTitle);
                        if (command.contains(lessonTitle + "-Exercise")) {
                            course.remove(lessonTitle + "-Exercise");
                        }
                    } else {
                        if (command.contains(lessonTitle + "-Exercise")) {
                            course.remove(lessonTitle + "-Exercise");
                        } else {
                            continue;
                        }
                    }
                    break;
                case "Swap":
                    lessonTitle = data[1];
                    String lessonTitle1 = data[2];

                    if (course.contains(lessonTitle) && course.contains(lessonTitle1)) {
                        int index1 = course.indexOf(lessonTitle);
                        int index2 = course.indexOf(lessonTitle1);

                        if (!course.contains(lessonTitle + "-Exercise") && !course.contains(lessonTitle1 + "-Exercise")) {
                            course.set(index1, lessonTitle1);
                            course.set(index2, lessonTitle);
                        }

                        if (course.contains(lessonTitle + "-Exercise") && course.contains(lessonTitle1 + "-Exercise")) {
                            int indexExercise1 = course.indexOf(lessonTitle + "-Exercise");
                            int indexExercise2 = course.indexOf(lessonTitle + "-Exercise");

                            course.set(indexExercise1, lessonTitle1 + "-Exercise");
                            course.set(indexExercise2, lessonTitle + "-Exercise");
                            continue;
                        } else if (course.contains(lessonTitle + "-Exercise")) {
                            int indexEx = course.indexOf(lessonTitle + "-Exercise");
                            course.set(index2, lessonTitle);
                            course.set(index1, lessonTitle1);
                            course.remove(indexEx);
                            course.add(index2 + 1, lessonTitle + "-Exercise");
                            continue;
                        } else if (course.contains(lessonTitle1 + "-Exercise")) {
                            int indexEx = course.indexOf(lessonTitle1 + "-Exercise");
                            course.set(index1, lessonTitle1);
                            course.set(index2, lessonTitle);
                            course.remove(indexEx);
                            course.add(index1 + 1, lessonTitle1 + "-Exercise");
                        } else {
                            continue;
                        }
                    }
                    break;
                case "Exercise":
                    lessonTitle = data[1];
                    if (course.contains(lessonTitle + "-Exercise")) {
                        continue;
                    } else if (course.contains(lessonTitle)) {
                        int indexLesson = course.indexOf(lessonTitle);
                        course.add(indexLesson + 1, lessonTitle);
                        continue;
                    } else if (!course.contains(lessonTitle)) {
                        course.add(course.size(), lessonTitle);
                        course.add(course.size(), lessonTitle + "-Exercise");
                        continue;
                    }
                    break;
            }
        }
        String[] finalCource = new String[course.size()];
        int j = 0;
        for (int i = 0; i < course.size(); i++) {
            finalCource[i] = course.get(i);
            j++;
            System.out.printf("%d.%s%n", j, finalCource[i]);
        }


    }
}
