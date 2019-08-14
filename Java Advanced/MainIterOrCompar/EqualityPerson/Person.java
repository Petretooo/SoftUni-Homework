package MainIterOrCompar.EqualityPerson;

public class Person{

    private String name;
    private Integer age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public boolean equals(Object other) {
        if(this == other){
            return true;
        }

        if(other instanceof Person){
            if(this.name.equals(((Person) other).name)
                    && this.age.equals(((Person) other).age)){

                return true;

            }
        }
        return false;
    }


    @Override
    public int hashCode() {
        return this.name.hashCode() + this.age.hashCode();
    }

}
