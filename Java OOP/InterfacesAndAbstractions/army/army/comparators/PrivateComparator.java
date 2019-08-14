package InterfacesAndAbstractions.army.army.comparators;

import InterfacesAndAbstractions.army.army.baseClasses.Soldier;

import java.util.Comparator;

public class PrivateComparator implements Comparator<Soldier> {
    @Override
    public int compare(Soldier f, Soldier s) {
        return Integer.compare(s.getId(), f.getId());
    }
}
