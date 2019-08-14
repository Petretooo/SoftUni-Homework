package SOLID.p02_OpenClosedPrinciple.p01_FileStream;

public class Main {
    public static void main(String[] args) {

        StreambleObject file = new File();
        StreambleObject music = new Music();
        StreambleObject newObeject = new NewObject();

        System.out.println(Progress.getCurrentPercent(file));
        System.out.println(Progress.getCurrentPercent(music));
        System.out.println(Progress.getCurrentPercent(newObeject));
    }
}

