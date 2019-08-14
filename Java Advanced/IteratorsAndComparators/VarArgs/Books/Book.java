package IteratorsAndComparators.VarArgs.Books;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {

    private int SerialNum;
    private String name;
    private List<String> authors;

    public Book(int serialNum, String name, String... authors) {
        SerialNum = serialNum;
        this.name = name;
        this.authors = Arrays.asList(authors);
    }

    public int getSerialNum() {
        return SerialNum;
    }

    public void setSerialNum(int serialNum) {
        SerialNum = serialNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%d%n", getSerialNum()));
        sb.append(String.format("%s%n",getName()));
        for (String author : authors) {
            sb.append(String.format("%s%n",author));
        }
        return sb.toString();
    }
}
