package SOLID.Logger.loggerlib.appenders;

import SOLID.Logger.loggerlib.appenders.interfaces.Appender;
import SOLID.Logger.loggerlib.customFiles.LogFile;
import SOLID.Logger.loggerlib.customFiles.interfaces.File;
import SOLID.Logger.loggerlib.enumerations.ReportLevel;
import SOLID.Logger.loggerlib.layout.interfaces.Layout;

import java.io.IOException;

public class FileAppender extends AppenderImpl {
    private File file;

    public FileAppender(Layout layout) {
        super(layout);

    }

    public FileAppender(Layout layout, ReportLevel reportLevel) {
        super(layout, reportLevel);
    }

    public void setFile(File file){
        this.file = file;
    }


    @Override
    public void append(String date, ReportLevel reportLevel, String message) {

        if(this.file == null){
            //throw new NullPointerException("File reference not set to an instance of an object");

            try {
                this.setFile(new LogFile());
            } catch (IOException e) {
                System.out.println(e.getMessage());;
            }
        }


        this.file.appendBuffer(this.format(date, reportLevel, message));
        this.file.write();
    }


    @Override
    public String toString() {
        return super.toString() + ", File size: " + this.file.getSize();
    }
}
