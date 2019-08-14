package StudentTeachers1;

public class Teachers1 extends People1 {

    private String KAT;


    public Teachers1(String name, String EGN, String KAT) {
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
        System.out.printf("Name: %s, EGN: %s, KAT: %s%n", getName(), getEGN(), getKAT());
    }
}
