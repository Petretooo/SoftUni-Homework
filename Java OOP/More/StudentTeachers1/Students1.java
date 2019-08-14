package StudentTeachers1;

public class Students1 extends People1 {

    private String FAK = "10101010";

    public Students1(String name, String EGN, String FAK) {
        this.FAK = FAK;
        setName(name);
        setEGN(EGN);
    }

    public String getFAK() {
        return FAK;
    }

    public void setFAK(String FAK) {
        if (FAK.length() > 8) {
            System.out.println("Error");
        }
        this.FAK = FAK;
    }

    @Override
    public void printInfo() {
        System.out.printf("Name: %s, EGN: %s, FAK: %s%n", getName(), getEGN(), getFAK());
    }
}
