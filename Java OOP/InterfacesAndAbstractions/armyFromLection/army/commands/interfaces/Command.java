package InterfacesAndAbstractions.armyFromLection.army.commands.interfaces;

import java.util.List;

public interface Command {

    void execute(List<String> args);
}
