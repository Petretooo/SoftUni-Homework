package InterfacesAndAbstractions.armyFromLection.army.commands;

import InterfacesAndAbstractions.armyFromLection.army.interfaces.Soldier;
import InterfacesAndAbstractions.armyFromLection.army.factories.SoldierFactory;

import java.util.List;

public class SpyCommand extends BaseCommand {


    public SpyCommand(List<Soldier> soldiers) {
        super(soldiers);
    }

    @Override
    public void execute(List<String> args) {
        super.add(SoldierFactory.produceSpy(args));
    }
}
