package StudentTeachers2;

public abstract class People2 {

    private String name;
    private String EGN;


    public abstract void printInfto();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEGN() {
        return EGN;
    }

    public void setEGN(String EGN) {
        this.EGN = EGN;
    }
}
