package ClassesAndObjects.Articles2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        String command = "";
        List<Article> lists = new ArrayList<>();

        for (int i = 0; i < n + 1; i++) {
            String[] input = in.nextLine().split(", ");
            command = input[0];
            if (command.equals("content") ||
                    command.equals("title") ||
                    command.equals("author")) {
                break;
            }
            Article article = new Article(input[0], input[1], input[2]);
            lists.add(article);
        }


        switch (command) {
            case "title":
                lists.stream().sorted(Comparator.comparing(Article::getTitle))
                        .forEach(System.out::println);
                break;
            case "content":
                lists.stream().sorted(Comparator.comparing(Article::getContent))
                        .forEach(System.out::println);
                break;
            case "author":
                lists.stream().sorted(Comparator.comparing(Article::getAuthor))
                        .forEach(System.out::println);
                break;
        }
    }
}
