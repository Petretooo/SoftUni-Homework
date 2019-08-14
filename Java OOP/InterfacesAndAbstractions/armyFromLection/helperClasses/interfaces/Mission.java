package InterfacesAndAbstractions.armyFromLection.army.helperClasses.interfaces;

import InterfacesAndAbstractions.armyFromLection.army.enums.State;

public interface Mission{
    void completeMission();
    String getCodeName();
    State getState();
}
