package Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String input = in.nextLine();
        String[] numbers = input.split("\\s+");

        List<Double> doubleList = new ArrayList<>();

        for (String number : numbers) {
            doubleList.add(Double.parseDouble(number));
        }

        for (int i = 0; i < doubleList.size() - 1; i++) {
            double firstNumber = doubleList.get(i);
            double secondNumber = doubleList.get(i + 1);

            if (firstNumber == secondNumber) {
                double sum = firstNumber + secondNumber;

                doubleList.set(i, sum);
                doubleList.remove(i + 1);
                i = -1;
            }
        }

        System.out.println(concatListELements(doubleList));

    }

    static String concatListELements(List<Double> list) {
        String someString = "";

        DecimalFormat format = new DecimalFormat("#.###");

        for (Double num : list) {
            someString += format.format(num) + " ";


        }
        return someString.trim();

    }

}
