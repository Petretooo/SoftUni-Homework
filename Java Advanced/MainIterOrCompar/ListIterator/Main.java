package MainIterOrCompar.ListIterator;

import MainIterOrCompar.ListIterator.ListlyIterator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<String> list = Arrays.stream(in.nextLine().split("\\s+"))
                .skip(1)
                .collect(Collectors.toList());


        ListlyIterator iterator = new ListlyIterator(list);

        String line;

        while(!("END").equals(line = in.nextLine())){
            String output = "";
            switch (line){
                case"Move":
                    output=iterator.move()? "true":"false";
                    System.out.println(iterator.move());
                    break;

                case"Print":
                    try {
                        output=iterator.print();
                    } catch (Exception e) {
                        output=e.getMessage();
                    }
                    break;

                case"HasNext":
                    output=iterator.hasNext()?"ture":"false";
                    System.out.println(iterator.hasNext());
                    break;
                case"PrintAll":
                    iterator.printAll();
                    System.out.println();
                    break;
            }
            if(!output.equals("")) {
                System.out.println(output);
            }
        }
    }
}
