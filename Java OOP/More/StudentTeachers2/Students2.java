package StudentTeachers2;

public class Students2 extends People2 {

    private String FAK = "10101010";

    public Students2(String name, String EGN, String FAK) {
        this.FAK = FAK;
        setEGN(EGN);
        setName(name);
    }


    public String getFAK() {
        return FAK;
    }

    public void setFAK(String FAK) {
        if (FAK.length() > 8) {
            System.out.println("Error!");
        }
        this.FAK = FAK;
    }

    @Override
    public void printInfto() {
        System.out.printf("Name: %s, EGN: %s, FAK: %s%n", getName(), getEGN(), getFAK());

    }
}
