package InterfacesAndAbstractions.armyFromLection.army.interfaces;

import InterfacesAndAbstractions.armyFromLection.army.helperClasses.interfaces.Repair;

import java.util.Collection;

public interface Engineer {
    void addRepai(Repair repair);
    Collection<Repair> getRepair();
}
