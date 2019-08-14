package StoilExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class sm {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        ArrayList<String> firstLIST = new ArrayList<>();

        firstLIST.add("faf  "); //TEST
        firstLIST.add("  fafa");//TEST
        firstLIST.add("faf  "); //TEST
        firstLIST.add("  fafa");//TEST        firstLIST.add("faf  "); //TEST
        firstLIST.add("  fafa");//TEST        firstLIST.add("faf  "); //TEST
        firstLIST.add("  fafa");//TEST        firstLIST.add("faf  "); //TEST
        firstLIST.add("  fafa");//TEST        firstLIST.add("faf  "); //TEST
        firstLIST.add("  fafa");//TEST        firstLIST.add("faf  "); //TEST
        firstLIST.add("  fafa");//TEST


        Object[] second = firstLIST.stream().map(String::trim).toArray();
        Arrays.stream(second).forEach(System.out::println);


    }
}
