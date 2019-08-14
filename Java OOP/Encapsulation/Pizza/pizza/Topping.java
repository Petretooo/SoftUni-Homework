package Encapsulation.Pizza.pizza;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String type, double weight) {
        this.setToppingType(type);
        this.setWeight(weight);
    }

    public void setToppingType(String toppingType) {
        Validator.validateToppingType(toppingType);
        this.toppingType = toppingType;
    }

    public void setWeight(double weight) {
        Validator.validateToppingWeight(this.toppingType, weight);
        this.weight = weight;
    }

    public double calculateCalories() {
        double calories = 2 * this.weight;

        switch (this.toppingType) {
            case "Meat":
                calories *= 1.2;
                break;
            case "Veggies":
                calories *= 0.8;
                break;
            case "Cheese":
                calories *= 1.1;
                break;
            default:
                calories *= 0.9;
                break;
        }

        return calories;
    }
}
