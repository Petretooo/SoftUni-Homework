package StudentsLectors;

public class Students extends People {

    private String gender;
    private Double grade;

    public Students(String name, String EGN, String gender, Double grade) {
        this.gender = gender;
        this.grade = grade;
        setEGN(EGN);
        setName(name);
    }


    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void printInfo() {
        System.out.printf("Name: %s, Grade: %f%n", getName(), getGrade());

    }
}
