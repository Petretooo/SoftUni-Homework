package InterfacesAndAbstractions.armyFromLection.army;

import InterfacesAndAbstractions.armyFromLection.army.interfaces.Spy;

public class SpyIml extends SoldierImpl implements Spy {
    private String codeNumber;

    public SpyIml(int id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "\r\nCode Number: " + this.codeNumber;
    }

    @Override
    public String getCodeNumber() {
        return this.codeNumber;
    }
}
