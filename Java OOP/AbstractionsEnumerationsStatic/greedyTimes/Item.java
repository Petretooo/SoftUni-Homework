package AbstractionsEnumerationsStatic.greedyTimes;

public class Item {
    private long quantity;

    protected Item(long quantity){
        this.quantity = quantity;
    }

    public long getQuantity(){
        return this.quantity;
    }

    public long addQuantity(long quantity){
        return this.quantity + quantity;
    }

}
