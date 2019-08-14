package AbstractionsEnumerationsStatic.greedyTimes;

public class Gold extends Item{
    protected Gold(long quantity) {
        super(quantity);
    }
    @Override
    public String toString() {
        return String.format("<Gold> %d", this.getQuantity());
    }
}
