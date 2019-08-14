package ClassesAndObjects.Students;

public class Students {


    private String firstName;
    private String lastName;
    private double grade;


    public Students(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f", this.getFirstName(), this.getLastName(),
                this.getGrade());
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
