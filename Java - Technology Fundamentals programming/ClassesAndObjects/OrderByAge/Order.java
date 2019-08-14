package ClassesAndObjects.OrderByAge;

public class Order {

    private String name;
    private String ID;
    private int age;

    public Order(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.",
                this.getName(), this.getID(), this.getAge());
    }


    public String getName() {
        return this.name;
    }

    public String getID() {
        return this.ID;
    }

    public int getAge() {
        return this.age;
    }
}
