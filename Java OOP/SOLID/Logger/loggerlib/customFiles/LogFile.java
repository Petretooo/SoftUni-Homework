package SOLID.Logger.loggerlib.customFiles;

import SOLID.Logger.loggerlib.customFiles.interfaces.File;

import java.io.FileWriter;
import java.io.IOException;

public class LogFile implements File {

    private StringBuilder buffer;
    private FileWriter fileWriter;

    public LogFile() throws IOException {
        this.buffer = new StringBuilder();
        this.setFileWriter(System.getProperty("user.dir") + "\\Output.txt");
    }

    public void setFileWriter(String path)throws IOException{
        this.fileWriter = new FileWriter(path);
    }

    public void appendBuffer(String text){

        this.buffer.append(text).append("\r\n");
    }

    @Override
    public void write() {
        try {
            this.setFileWriter(System.getProperty("user.dir")+"\\Output.txt");
            String text = buffer.toString();
            this.fileWriter.append(text);
            this.fileWriter.close();
            //this.buffer = new StringBuilder();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    @Override
    public int getSize() {
        int size = 0;
        for (Character o : this.buffer.toString().toCharArray()) {
            if((o >= 65 && o <= 90) || (o >= 97 && o <=122)){
                size += o;
            }
        }
        return size;
    }
}
