package StringAndRegular;

import java.util.Scanner;
import java.util.regex.Pattern;

public class extractFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //    String word = in.nextLine();


        String[] words = in.nextLine().split("\\\\+");

        String lastLine = words[words.length - 1];

        String fileName = lastLine.substring(0, lastLine.lastIndexOf('.'));
        String fileExtension = lastLine.substring(lastLine.lastIndexOf('.') + 1);

        System.out.println(String.format("File name: %s%nFile extension: %s%n", fileName, fileExtension));

    }
}
