package Stream.Files.Directories.TryCatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

public class SecondTask {

    public SecondTask() throws IOException {


        String filePath =
                "D:\\Programming\\Java\\Advanced\\src\\Stream\\res\\input.txt";

        FileReader fileReader = new FileReader(filePath);
        BufferedReader reader = new BufferedReader(fileReader);

        String line = reader.readLine();
        BigInteger totalSum = BigInteger.ZERO;

        while(line != null){

            for (char symbol : line.toCharArray()) {
                totalSum = totalSum.add(BigInteger.valueOf(symbol));
            }
            line = reader.readLine();
        }
        PrintWriter print = new PrintWriter("BigInOut.txt");

        print.println(totalSum.toString());
        print.close();


    }

}
