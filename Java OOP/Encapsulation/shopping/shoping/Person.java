package Encapsulation.shopping.shoping;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        Validation.nameValidation(name);
        this.name = name;
    }

    private void setMoney(double money) {
        Validation.costValidate(money);
        this.money = money;
    }

    public boolean canAffordProduct(Product product){
        return this.money - product.getCost() >= 0;
    }


    public void buyProduct(Product product){
        if(canAffordProduct(product)) {
            this.products.add(product);
            this.money -= product.getCost();
        }else {
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, product.getName()));
        }
    }

    @Override
    public String toString() {
        StringBuilder contents = new StringBuilder();
        contents.append(this.name).append(" - ");
        for (Product product : this.products) {
            contents.append(product.getName()).append(", ");
        }
        if(this.products.isEmpty()){
            contents.append("Nothing bought");
        }else {
            contents.delete(contents.length() - 2, contents.length());
        }
        return contents.toString();
    }


}
