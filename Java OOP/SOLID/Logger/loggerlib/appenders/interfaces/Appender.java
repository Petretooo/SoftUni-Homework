package SOLID.Logger.loggerlib.appenders.interfaces;

import SOLID.Logger.loggerlib.enumerations.ReportLevel;

public interface Appender {



    void append(String date, ReportLevel reportLevel, String message);

    void setReportLevel(ReportLevel reportLevel);
    ReportLevel getReportLevel();
}
