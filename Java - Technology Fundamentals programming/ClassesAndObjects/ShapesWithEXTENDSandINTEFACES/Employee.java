package ClassesAndObjects.ShapesWithEXTENDSandINTEFACES;

public abstract class Employee {
    private String name;
    private int age;
    private String EGN;
    private double payment;
    private int workHours;

    public Employee(String name, double payment, int workHours) {
        this.name = name;
        this.payment = payment;
        this.workHours = workHours;
    }

    public abstract double calculatePayment();

    public abstract String employeeDuties();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEGN() {
        return EGN;
    }

    public void setEGN(String EGN) {
        this.EGN = EGN;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
}
