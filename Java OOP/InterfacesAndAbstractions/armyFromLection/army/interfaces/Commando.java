package InterfacesAndAbstractions.armyFromLection.army.interfaces;

import InterfacesAndAbstractions.armyFromLection.army.helperClasses.interfaces.Mission;

import java.util.Collection;

public interface Commando {
    void addMission(Mission mission);
    Collection<Mission> getMissions();
}
