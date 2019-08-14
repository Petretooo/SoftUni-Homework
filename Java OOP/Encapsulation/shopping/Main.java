package Encapsulation.shopping;

import Encapsulation.shopping.shoping.Person;
import Encapsulation.shopping.shoping.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String[] peopleData = bfr.readLine().split(";");
        Map<String, Person> people = new LinkedHashMap<>();

        for (String data : peopleData) {
            String[] person = data.split("=");
            String name = person[0];
            double money = Double.parseDouble(person[1]);


            try {
                Person dude = new Person(name, money);
                people.put(name, dude);
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }

        String[] productData = bfr.readLine().split(";");
        Map<String, Product> groceries = new HashMap<>();

        for (String data : productData) {
            String[] products = data.split("=");
            String name = products[0];
            double cost = Double.parseDouble(products[1]);

            try{
                Product product = new Product(name, cost);
                groceries.put(name, product);
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }


        String input;

        while(!"END".equals(input = bfr.readLine())){
            String[] line = input.split(" ");
            String name = line[0];
            String product = line[1];

            Person buyer = null;
            if(people.containsKey(name)){
                buyer = people.get(name);
            }
            Product purchase = null;
            if(groceries.containsKey(product)){
                purchase = groceries.get(product);
            }

            if(buyer != null && purchase != null){
                try {
                    buyer.buyProduct(purchase);
                } catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                    continue;
                }
                System.out.println(String.format("%s bought %s", name, product));
            }
        }


        for (Person value : people.values()) {
            System.out.println(value);

        }

    }
}
