package InterfacesAndAbstractions.army.army.soldiers;

import InterfacesAndAbstractions.army.army.baseClasses.SoldierImpl;

public class PrivateImpl extends SoldierImpl {

    private double salary;

    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s Salary: %.2f%n", super.toString(), this.getSalary());
    }
}
