package SOLID.p02_OpenClosedPrinciple.p03_ShoppingCart;

public class NewTypeOrder extends Order {

    protected NewTypeOrder(Cart cart, String customerEmail) {
        super(cart, customerEmail);
    }

}
