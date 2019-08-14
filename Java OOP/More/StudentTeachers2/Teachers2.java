package StudentTeachers2;

public class Teachers2 extends People2 {


    private String KAT;

    public Teachers2(String name, String EGN, String KAT) {
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
    public void printInfto() {
        System.out.printf("Name: %s, EGN: %s, KAT: %s%n", getName(), getEGN(), getKAT());

    }
}
