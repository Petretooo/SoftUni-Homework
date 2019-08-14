package InterfacesAndAbstractions.armyFromLection.army.commands;

import InterfacesAndAbstractions.armyFromLection.army.interfaces.Soldier;
import InterfacesAndAbstractions.armyFromLection.army.commands.interfaces.Command;

import java.util.List;

public abstract class BaseCommand implements Command {

    private List<Soldier> soldiers;

    public BaseCommand(List<Soldier> soldiers) {
        this.soldiers = soldiers;
    }

    protected List<Soldier> getSoldiers(){
        return this.soldiers;
    }

    public void add(Soldier soldier){
        this.soldiers.add(soldier);
    }
}
