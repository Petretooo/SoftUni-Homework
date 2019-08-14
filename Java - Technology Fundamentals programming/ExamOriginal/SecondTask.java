package ExamOriginal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SecondTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> products = Arrays.stream(in.nextLine().split("\\|+"))
                .collect(Collectors.toList());

        Double budget = Double.parseDouble(in.nextLine());
        List<Double> newPrice = new ArrayList<>();
        double profit = 0;

        for (int i = 0; i < products.size(); i++) {

            String[] data = products.get(i).split("->");
            String product = data[0];
            double price = Double.parseDouble(data[1]);

            if (product.equalsIgnoreCase("Shoes")) {
                if (price > 35) {
                    continue;
                }
            }
            if (product.equalsIgnoreCase("Clothes")) {
                if (price > 50) {
                    continue;
                }
            }
            if (product.equalsIgnoreCase("Accessories")) {
                if (price > 20.50) {
                    continue;
                }
            }

            if (product.equalsIgnoreCase("Shoes")) {
                if (price > budget) {
                    continue;
                } else {
                    budget -= price;
                    profit += price * 0.4;
                    price += price * 0.4;
                    newPrice.add(price);
                }
            } else if (product.equalsIgnoreCase("Clothes")) {
                if (price > budget) {
                    continue;
                } else {
                    budget -= price;
                    profit += price * 0.4;
                    price += price * 0.4;
                    newPrice.add(price);
                }
            } else if (product.equalsIgnoreCase("Accessories")) {
                if (price > budget) {
                    continue;
                } else {
                    budget -= price;
                    profit += price * 0.4;
                    price += price * 0.4;
                    newPrice.add(price);
                }
            }
        }
        double sum = 0;
        for (int i = 0; i < newPrice.size(); i++) {
            sum += newPrice.get(i);
        }
        for (int i = 0; i < newPrice.size(); i++) {
            System.out.printf("%.2f ", newPrice.get(i));
        }
        System.out.println();
        sum = sum + budget;
        System.out.printf("Profit: %.2f%n", profit);
        if (sum >= 150) {
            System.out.println("Hello, France!");
        } else {
            System.out.println("Time to go.");
        }


    }
}
