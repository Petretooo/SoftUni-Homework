package SOLID.Logger;

import SOLID.Logger.loggerlib.appenders.ConsoleAppender;
import SOLID.Logger.loggerlib.appenders.FileAppender;
import SOLID.Logger.loggerlib.appenders.interfaces.Appender;
import SOLID.Logger.loggerlib.customFiles.LogFile;
import SOLID.Logger.loggerlib.customFiles.interfaces.File;
import SOLID.Logger.loggerlib.enumerations.ReportLevel;
import SOLID.Logger.loggerlib.layout.SimpleLayout;
import SOLID.Logger.loggerlib.layout.XmlLayout;
import SOLID.Logger.loggerlib.layout.interfaces.Layout;
import SOLID.Logger.loggerlib.loggers.MessageLogger;
import SOLID.Logger.loggerlib.loggers.interfaces.Logger;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);




        //TEST ONE
//        Layout simpleLayout = new SimpleLayout();
//        Appender consoleAppender = new ConsoleAppender(simpleLayout);
//        Logger logger = new MessageLogger(consoleAppender);
//
//        logger.logError("3/26/2015 2:08:11 PM", "Error parsing JSON.");
//        logger.logInfo("3/26/2015 2:08:11 PM", "User Pesho successfully registered.");



        //TEST TWO
//        Layout simpleLayout = new SimpleLayout();
//        Appender consoleAppender = new ConsoleAppender(simpleLayout);
//
//        File file = new LogFile();
//        Appender fileAppender = new FileAppender(simpleLayout);
//        ((FileAppender) fileAppender).setFile(file);
//
//        Logger logger = new MessageLogger(consoleAppender, fileAppender);
//
//        logger.logError("3/26/2015 2:08:11 PM", "Error parsing JSON.");
//        logger.logInfo("3/26/2015 2:08:11 PM", "User Pesho successfully registered.");

        //TEST THREE

//        Layout simpleLayout = new SimpleLayout();
//        Appender consoleAppender = new ConsoleAppender(simpleLayout);
//        consoleAppender.setReportLevel(ReportLevel.ERROR);
//
//        Logger logger = new MessageLogger(consoleAppender);
//
//        logger.logInfo("3/31/2015 5:33:07 PM", "Everything seems fine");
//        logger.logWarning("3/31/2015 5:33:07 PM", "Warning: ping is too high - disconnect imminent");
//        logger.logError("3/31/2015 5:33:07 PM", "Error parsing request");
//        logger.logCritical("3/31/2015 5:33:07 PM", "No connection string found in App.config");
//        logger.logFatal("3/31/2015 5:33:07 PM", "mscorlib.dll does not respond");




        //TEST FOUR
        int n = Integer.parseInt(in.nextLine());

        Appender[] appenders = new Appender[n];

        int index = 0;
        while(n-- > 0){
            String[] tokens = in.nextLine().split("\\s+");
            Appender appender = null;

            Layout layout = null;

            if(tokens[1].equals("SimpleLayout")){
                layout = new SimpleLayout();
            }else {
                layout = new XmlLayout();
            }

            if(tokens[0].equals("ConsoleAppender")){
                appender = new ConsoleAppender(layout);
            }else {
                appender = new FileAppender(layout);
            }

            if(tokens.length == 3){
                appender.setReportLevel(ReportLevel.valueOf(tokens[2]));
            }

            appenders[index++] = appender;

        }

        Logger logger = new MessageLogger(appenders);
        String line = in.nextLine();
        while(!line.equals("END")){
            String[] tokens = line.split("\\|");

            switch (ReportLevel.valueOf(tokens[0])){
                case INFO:
                    logger.logInfo(tokens[1], tokens[2]);
                    break;
                case ERROR:
                    logger.logError(tokens[1], tokens[2]);
                    break;
                case FATAL:
                    logger.logFatal(tokens[1], tokens[2]);
                    break;
                case WARNING:
                    logger.logWarning(tokens[1], tokens[2]);
                    break;
                case CRITICAL:
                    logger.logCritical(tokens[1], tokens[2]);
                    break;
            }

            line = in.nextLine();

        }


        System.out.println(logger.toString());
    }
}
