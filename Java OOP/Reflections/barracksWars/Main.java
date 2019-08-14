package Reflections.barracksWars;

import Reflections.barracksWars.interfaces.Repository;
import Reflections.barracksWars.interfaces.Runnable;
import Reflections.barracksWars.interfaces.UnitFactory;
import Reflections.barracksWars.core.Engine;
import Reflections.barracksWars.core.factories.UnitFactoryImpl;
import Reflections.barracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
