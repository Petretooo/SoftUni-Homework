package IteratorsAndComparators.Froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Lake lake = new Lake(Stream.of(reader.readLine().split("[,\\s]+")).map(Integer::parseInt).toArray(Integer[]::new));
        StringBuilder result = new StringBuilder();
        for (Integer integer : lake) {
            result.append(integer).append(", ");
        }
        System.out.println(result.substring(0, result.length() - 2));
    }
}
