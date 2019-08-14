package InterfacesAndAbstractions.phone;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> phonenumbers = Arrays.asList(in.nextLine().split("\\s+"));
        List<String> sites = Arrays.asList(in.nextLine().split("\\s+"));


        Smartphone smartphone = new Smartphone(phonenumbers, sites);

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());

    }
}


//    @Override
//    public String browse() {
//        StringBuilder browsedURLs = new StringBuilder();
//        for (String url : this.urls) {
//            if (!url.matches(".*\\d.*")) {
//                browsedURLs
//                        .append("Browsing: ")
//                        .append(url)
//                        .append("!")
//                        .append(System.lineSeparator());
//            } else {
//                browsedURLs.append("Invalid URL!").append(System.lineSeparator());
//            }
//        }
//        return browsedURLs.toString().trim();
//    }
//
//    @Override
//    public String call() {
//        StringBuilder calledNumbers = new StringBuilder();
//        for (String number : this.numbers) {
//            if (!number.matches(".*[A-Za-z].*")) {
//                calledNumbers.append("Calling... ").append(number).append(System.lineSeparator());
//            } else {
//                calledNumbers.append("Invalid number!").append(System.lineSeparator());
//            }
//        }
//        return calledNumbers.toString().trim();
//    }