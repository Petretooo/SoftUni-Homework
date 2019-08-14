package Stream.Files.Directories.TryCatch;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ThirdTask {
    public static void main(String[] args) throws IOException {

        String filePath =
                "D:\\Programming\\Java\\Advanced\\src\\Stream\\res\\input.txt";

        FileReader fileReader = new FileReader(filePath);
        BufferedReader reader = new BufferedReader(fileReader);

        String text = Files.readString(Path.of(filePath)).replaceAll("\r\n"," ");

        int[] countData = new int[3];

        String vowels = "aeiou";
        String pon = "!,.?";
        for (char symbol : text.toCharArray()) {
            if(Character.isAlphabetic(symbol)){
                if(vowels.contains(symbol+"")){
                    countData[0]++;
                }
                else if(pon.contains(symbol+"")){
                    countData[2]++;
                }
                else if(symbol != ' '){
                    countData[1]++;
                }
            }
        }

        PrintWriter printer = new PrintWriter("TypeOutput.txt");

        printer.println(String.format("Voweols: %d\n + " +
                "Consonants: %d\n + " +
                "Punctuation: %d\n", countData[0],countData[1],countData[2]));

        printer.close();
    }
}
