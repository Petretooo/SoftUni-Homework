package DemoExam;

import java.util.*;
import java.util.stream.Collectors;

public class MakeASalad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] salad = in.nextLine().split("\\s+");
        int[] calories = Arrays.stream(in.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt)
                                .toArray();

        ArrayDeque<String> stackSalad = new ArrayDeque<>();
        ArrayDeque<Integer> queueCalories = new ArrayDeque<>();


        List<String> listSALAD = new ArrayList<>();

        List<Integer> usedCalories = new ArrayList<>();




        for (int i = 0; i < salad.length; i++) {
            stackSalad.offer(salad[i]);
        }
        for (int i = 0; i < calories.length; i++) {
            queueCalories.push(calories[i]);
        }

        int currentCal =0;
        while (stackSalad.size() != 0){
            if(currentCal <= 0 && queueCalories.size() != 0) {
                currentCal = queueCalories.pop();
                usedCalories.add(currentCal);
            }
            String product = stackSalad.poll();
            listSALAD.add(product);

            if(product.equals("tomato")){
                currentCal -= 80;
            }else if(product.equals("potato")){
                currentCal -= 215;
            }else if(product.equals("carrot")){
                currentCal -= 136;
            }else if(product.equals("lettuce")){
                currentCal -= 109;
            }
            if(queueCalories.size() == 0){
                break;
            }
        }
        if(queueCalories.size() != 0 &&
        stackSalad.size() == 0){
            usedCalories.stream().forEach(e -> System.out.print(e + " "));
            System.out.println();
            queueCalories.stream().forEach(e -> System.out.print(queueCalories.pop() + " "));
        }else if(stackSalad.size() != 0 &&
        queueCalories.size() == 0){

            usedCalories.stream().forEach(e -> System.out.print(e + " "));
            System.out.println();
            stackSalad.stream().forEach(e -> System.out.print(stackSalad.poll() + " "));
        }
    }
}
