package IteratorsAndComparators.StrategyPattern;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        if (first.getName().length() == second.getName().length()) {
            return Character.compare(first.getName().toLowerCase().charAt(0), second.getName().toLowerCase().charAt(0));
            //return Collator.getInstance().compare(first.getName(), second.getName());
        }
        return first.getName().length() - second.getName().length();
    }
}