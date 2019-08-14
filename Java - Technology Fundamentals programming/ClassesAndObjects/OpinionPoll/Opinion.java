package ClassesAndObjects.OpinionPoll;

public class Opinion {

    private String name;
    private int age;

    public Opinion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name = name;
    }


    public int getAge() {
        return this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", this.getName(), getAge());
    }

}
