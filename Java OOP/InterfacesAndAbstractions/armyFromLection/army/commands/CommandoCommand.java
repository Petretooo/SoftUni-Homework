package InterfacesAndAbstractions.armyFromLection.army.commands;

import InterfacesAndAbstractions.armyFromLection.army.interfaces.Soldier;
import InterfacesAndAbstractions.armyFromLection.army.factories.SoldierFactory;

import java.util.List;

public class CommandoCommand extends BaseCommand {

    public CommandoCommand(List<Soldier> soldiers) {
        super(soldiers);
    }

    @Override
    public void execute(List<String> args) {
        super.add(SoldierFactory.produceCommando(args));
    }
}
