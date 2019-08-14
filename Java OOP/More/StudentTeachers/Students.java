package StudentTeachers;

public class Students extends People {

    private String fakNum = "10101010";

    public String getFakNum() {
        return fakNum;
    }

    public void setFakNum(String fakNum) {

        if (fakNum.length() > 8) {
            System.out.println("ERROR!");
            return;
        }
        this.fakNum = fakNum;
    }

    @Override
    public void printInfo() {
        System.out.println("Name = " + getName() +
                " EGN = " + getEGN() + " fakNum = " + getFakNum());
    }
}
