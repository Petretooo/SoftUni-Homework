package SOLID.p02_OpenClosedPrinciple.p03_ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart();
        cart.add(new OrderItem("gkspdgks", 20));
        Order order = new OnlineOrder(cart, "fsfs@gmail.com");

        System.out.println("Hello World");
    }
}
