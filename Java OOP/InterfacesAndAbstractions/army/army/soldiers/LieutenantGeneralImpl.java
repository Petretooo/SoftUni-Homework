package InterfacesAndAbstractions.army.army.soldiers;

import InterfacesAndAbstractions.army.army.baseClasses.Soldier;
import InterfacesAndAbstractions.army.army.comparators.PrivateComparator;
import InterfacesAndAbstractions.army.army.repositories.SoldierRepository;

import java.util.TreeSet;

public class LieutenantGeneralImpl extends PrivateImpl {

    private TreeSet<Soldier> privates;
    private static PrivateComparator comparator;

    static {
        comparator = new PrivateComparator();
    }
    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary, String... PrivatesIDs) {
        super(id, firstName, lastName, salary);
        this.privates = new TreeSet<>(comparator);

    }



    private void addPrivate(String[] privatesIDs){
        for (String id : privatesIDs) {
            int idNum = Integer.parseInt(id);
            Soldier soldier = SoldierRepository.getPrivateById(idNum);
            if(soldier != null){
                this.privates.add(soldier);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString())
                .append("Privates:")
                .append(System.lineSeparator());

        for (Soldier PVT : this.privates) {
            sb.append("\t")
                    .append(PVT.toString());
        }
        return sb.toString();
    }
}
