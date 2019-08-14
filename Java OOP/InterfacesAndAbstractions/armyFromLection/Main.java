package InterfacesAndAbstractions.armyFromLection;

import InterfacesAndAbstractions.armyFromLection.army.commands.*;
import InterfacesAndAbstractions.armyFromLection.army.interfaces.Soldier;
import InterfacesAndAbstractions.armyFromLection.army.commands.interfaces.Command;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();


        Map<String, Command> commands = new HashMap<>();

        List<Soldier> soldiers = new ArrayList<>();

        commands.put("Private", new PrivateCommand(soldiers));
        commands.put("LieuttenantGeneral", new LieutenantGeneralCommand(soldiers));
        commands.put("Engineer", new EngineerCommand(soldiers));
        commands.put("Commando", new CommandoCommand(soldiers));
        commands.put("Spy", new SpyCommand(soldiers));

        while(!"End".equals(input = in.nextLine())){

            String command = input.substring(0, input.indexOf(" "));

            commands.get(command).execute(
                    Arrays.stream(input.split("\\s+"))
                    .skip(1)
                    .collect(Collectors.toList())
            );

        }


        for (Soldier soldier : soldiers) {
            System.out.println(soldier.toString());
        }
    }
}
