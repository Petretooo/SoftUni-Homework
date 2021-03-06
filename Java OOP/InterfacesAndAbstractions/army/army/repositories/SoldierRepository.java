package InterfacesAndAbstractions.army.army.repositories;

import InterfacesAndAbstractions.army.army.baseClasses.Soldier;

import java.util.LinkedHashMap;
import java.util.Map;

public class SoldierRepository {

    private static Map<Integer, Soldier> privates = new LinkedHashMap<>();

    public static void addPrivate(Soldier soldier){
        privates.put(soldier.getId(), soldier);
    }

    public static Soldier getPrivateById(int id){
        if(privates.containsKey(id)){
            return privates.get(id);
        }
        return null;
    }
}
