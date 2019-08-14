package InterfacesAndAbstractions.armyFromLection.army;

import InterfacesAndAbstractions.armyFromLection.army.enums.Corps;
import InterfacesAndAbstractions.armyFromLection.army.helperClasses.interfaces.Repair;
import InterfacesAndAbstractions.armyFromLection.army.interfaces.Engineer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {

    private List<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new ArrayList<>();
    }


    @Override
    public void addRepai(Repair repair) {
        this.repairs.add(repair);
    }

    @Override
    public Collection<Repair> getRepair() {
        return this.repairs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append(System.lineSeparator())
                .append("Repair:")
                .append(System.lineSeparator());

        for (Repair repair : repairs) {
            sb.append("  ")
                    .append(repair.toString())
                    .append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}
