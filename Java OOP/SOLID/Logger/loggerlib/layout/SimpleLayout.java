package SOLID.Logger.loggerlib.layout;

import SOLID.Logger.loggerlib.enumerations.ReportLevel;
import SOLID.Logger.loggerlib.layout.interfaces.Layout;

public class SimpleLayout implements Layout {

    @Override
    public String format(String date, ReportLevel reportLevel, String message) {
        return String.format("%s - %s - %s", date, reportLevel.toString(), message);
    }
}
