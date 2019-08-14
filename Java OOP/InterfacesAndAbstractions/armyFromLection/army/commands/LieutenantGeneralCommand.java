package InterfacesAndAbstractions.armyFromLection.army.commands;

import InterfacesAndAbstractions.armyFromLection.army.interfaces.Soldier;
import InterfacesAndAbstractions.armyFromLection.army.factories.SoldierFactory;

import java.util.List;

public class LieutenantGeneralCommand extends BaseCommand {
    public LieutenantGeneralCommand(List<Soldier> soldiers) {
        super(soldiers);
    }

    @Override
    public void execute(List<String> args) {
        super.add(SoldierFactory.produceLeiutenantGenaral(args, super.getSoldiers()));
    }
}
