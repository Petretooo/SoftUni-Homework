package SOLID.Logger.loggerlib.appenders;

import SOLID.Logger.loggerlib.appenders.interfaces.Appender;
import SOLID.Logger.loggerlib.enumerations.ReportLevel;
import SOLID.Logger.loggerlib.layout.interfaces.Layout;

public abstract class AppenderImpl implements Appender {


    private Layout layout;
    private ReportLevel reportLevel;
    private int loggedMessages;

    protected AppenderImpl(Layout layout){
        this.layout = layout;
        this.setReportLevel(ReportLevel.INFO);
        this.loggedMessages = 0;
    }

    protected AppenderImpl(Layout layout, ReportLevel reportLevel) {
        this.layout = layout;
        this.setReportLevel(reportLevel);
        this.loggedMessages = 0;
    }

    @Override
    public ReportLevel getReportLevel(){
        return this.reportLevel;
    }

    protected String format(String date, ReportLevel reportLevel, String message){
        this.loggedMessages++;
        return this.layout.format( date,  reportLevel,  message);
    }

    @Override
    public void setReportLevel(ReportLevel reportLevel) {

        this.reportLevel =reportLevel;
    }


    @Override
    public String toString() {
        return String.format("Appender type: %s, Layout type: %s, Report level: %s, Message appended: %d",
           this.getClass().getSimpleName(), this.layout.getClass().getSimpleName(),
                this.reportLevel.toString(), this.loggedMessages);
    }
}
