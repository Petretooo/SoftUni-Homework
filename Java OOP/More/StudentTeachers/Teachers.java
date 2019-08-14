package StudentTeachers;

public class Teachers extends People {
    private String KAT;

    public Teachers(String name, String EGN, String KAT) {
        this.KAT = KAT;
        setEGN(EGN);
        setName(name);
    }

    public String getKAT() {
        return KAT;
    }

    public void setKAT(String KAT) {
        this.KAT = KAT;
    }

    @Override
    public void printInfo() {
        System.out.println("Name = " + getName() +
                " EGN = " + getKAT() + " kat = " + getKAT());
    }
}
