package Encapsulation.shopping.shoping;

public class Validation {
    public static void nameValidation(String name) {
        if(name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    public static void costValidate(double cost) {
        if(cost < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }


}
