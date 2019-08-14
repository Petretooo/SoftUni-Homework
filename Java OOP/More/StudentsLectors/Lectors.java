package StudentsLectors;

public class Lectors extends People {

    private Double salary;

    public Lectors(String name, String EGN, Double salary) {
        this.salary = salary;
        setEGN(EGN);
        setName(name);
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public void printInfo() {

    }
}
