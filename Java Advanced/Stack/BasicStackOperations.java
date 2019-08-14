package Stack;

import java.util.*;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] parameters = Arrays.stream(in.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int elementCout = parameters[0];
        int countToRemove = parameters[1];
        int lookupElement = parameters[2];

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        Arrays.stream(in.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .limit(elementCout)
                .forEach(numbers::push);

        for (int i = 0 ; i < countToRemove ; i++){
            numbers.pop();
        }

        if(numbers.contains(lookupElement)){
            System.out.println("true");
        }else {
            if(numbers.size() == 0){
                System.out.println(0);
            }else {
                System.out.println(Collections.min(numbers));

                /*
                int min = Integer.MAX_VALUE;
                while(!numbers.isEmpty()){
                    int number = numbers.pop();
                    if(number < min){
                        min = number;
                    }
                }
                System.out.println(min);
                 */
            }
        }


    }
}
