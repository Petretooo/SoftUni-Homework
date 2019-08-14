package Reflections.barracksWars.core.factories;

import Reflections.barracksWars.interfaces.UnitFactory;
import Reflections.barracksWars.interfaces.Unit;
import Reflections.barracksWars.interfaces.UnitFactory;

import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@SuppressWarnings("unchecked")
public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "barracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException {
        Unit unit = null;

        try {
            Class clazz =  Class.forName(UNITS_PACKAGE_NAME + unitType);
            Constructor ctor = clazz.getConstructor();
            unit = (Unit) ctor.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return unit;
    }
}
