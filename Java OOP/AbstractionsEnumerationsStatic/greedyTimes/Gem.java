package AbstractionsEnumerationsStatic.greedyTimes;

public class Gem extends Item{
    private String name;

    protected Gem(String name, long quantity) {
        super(quantity);
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("##%s - %d",this.name,this.getQuantity());
    }
}
