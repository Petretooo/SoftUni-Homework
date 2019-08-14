package Stream.Files.Directories.TryCatch;

import java.io.*;
import java.lang.String;
import java.lang.System;

public class FirstTask {

    public static void main(String[] args) throws IOException {


        String filePath =
                "D:\\Programming\\Java\\Advanced\\src\\Stream\\res\\input.txt";

        String outputPath = filePath.substring(0, filePath.lastIndexOf("\\") + 1) + "asciSum.txt";

        FileWriter writer = new FileWriter(outputPath);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();

            while (line != null) {
                int asciisum = 0;
                for (char symbol : line.toCharArray()) {
                    asciisum += symbol;

                }

                writer.write(asciisum + "");
                writer.write(System.lineSeparator());
                line = reader.readLine();


            }

        } catch (IOException exx) {
            System.out.println(exx.getMessage());
        }
        writer.close();
    }
}
