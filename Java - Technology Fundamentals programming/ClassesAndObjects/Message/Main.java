package ClassesAndObjects.Message;

import ClassesAndObjects.Message.Message;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int n = Integer.parseInt(in.nextLine());

        Message message = new Message();

        for (int i = 0; i < n; i++) {
            System.out.println(message.randomMessage());
        }
    }
}
