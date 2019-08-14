package SOLID.Logger.loggerlib.layout.interfaces;

import SOLID.Logger.loggerlib.enumerations.ReportLevel;

public interface Layout {

   String format(String date, ReportLevel reportLevel, String message);
}
