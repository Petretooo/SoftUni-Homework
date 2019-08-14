package Exceptions;

import barracksWars.anotation.Inject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class firtsLection {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int num = Integer.parseInt(reader.readLine());

        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Good bye!");
        }


    }
}
