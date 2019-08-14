package ClassesAndObjects.ShapesWithEXTENDSandINTEFACES;

public class Workers extends Employee {

    private double fines;

    public Workers(String name, double payment, int workHours) {
        super(name, payment, workHours);
    }

    @Override
    public double calculatePayment() {
        return getPayment() * 12 / 52 / getWorkHours() - fines;
    }

    @Override
    public String employeeDuties() {
        String result = "Work from 9:00 to 18:00 without comlpaining";
        return result;
    }

    public void setFines(double fines) {
        this.fines = fines;
    }

    public double getFines() {
        return fines;
    }
}
