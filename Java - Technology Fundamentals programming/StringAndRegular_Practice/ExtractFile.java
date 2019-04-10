package StringAndRegular_Practice;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] path = in.nextLine().split("\\\\+");

        String lastLine = path[path.length - 1];

        String file = lastLine.substring(0, lastLine.lastIndexOf('.'));
        String format = lastLine.substring(lastLine.lastIndexOf('.') + 1);


        System.out.println(String.format("File name: %s%nFile extension: %s", file, format));
    }
}
