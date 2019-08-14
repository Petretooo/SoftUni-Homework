package ClassesAndObjects.Article;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String[] data = in.nextLine().split(", ");
        Article article = new Article(data[0], data[1], data[2]);
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = in.nextLine().split(": ");
            String command = input[0];

            switch (command) {
                case "Edit":
                    article.edit(input[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(input[1]);
                    break;
                case "Rename":
                    article.rename(input[1]);
                    break;
            }

        }

        System.out.println(article);
    }
}
