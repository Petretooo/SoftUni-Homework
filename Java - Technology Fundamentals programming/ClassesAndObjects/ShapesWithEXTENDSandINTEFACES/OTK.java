package ClassesAndObjects.ShapesWithEXTENDSandINTEFACES;

public class OTK extends Employee {
    public double bonus;

    public OTK(String name, double payment, int workHours) {
        super(name, payment, workHours);
    }


    @Override
    public double calculatePayment() {
        return getPayment() * 12 / 52 / getWorkHours() + bonus;
    }

    @Override
    public String employeeDuties() {
        String result = "Woal around and complains about" + " worker's performance";
        return result;
    }


    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getName() {
        return super.getName();
    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
