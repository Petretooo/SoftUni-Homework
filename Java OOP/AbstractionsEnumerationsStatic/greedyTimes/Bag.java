package AbstractionsEnumerationsStatic.greedyTimes;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private long capacity;
    private List<List<Item>> items;
    public Bag(long capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
        this.items.add(new ArrayList<>());
        this.items.add(new ArrayList<>());
        this.items.add(new ArrayList<>());
    }

    public long getCapacity() {
        return capacity;
    }

    public void addGem(String name, long quantity) {
        if(this.getItemAmout(0) >= this.getItemAmout(1) + quantity){
            this.capacity -= quantity;
            Item item = new Gem(name,quantity);
            this.items.get(1).add(item);
        }

    }

    private long getGoldAmount() {
        return this.items.get(0).get(0).getQuantity();
    }

    public void addCash(String name, long quantity) {
        if(this.getItemAmout(1) >= this.getItemAmout(2) + quantity){
            this.capacity -= quantity;
            Item item = new Cash(name,quantity);
            this.items.get(2).add(item);
        }

    }

    private long getItemAmout(int index){
        return this.items.get(index).stream().mapToLong(Item::getQuantity).sum();
    }

    public void addGold(long quantity) {
        if(this.items.get(0).size() == 0){
            this.items.get(0).add(new Gold(quantity));
        }else {
            this.items.get(0).get(0).addQuantity(quantity);
        }
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(this.items.get(0).get(0).toString()).append(System.lineSeparator());

        if(this.getItemAmout(0) != 0){
            builder.append("##Gold - ").append(this.getItemAmout(0)).append(System.lineSeparator());
        }

        long gemsAmount = this.getItemAmout(1);
        builder.append(String.format("<Gem> $%d", gemsAmount)).append(System.lineSeparator());

        if(gemsAmount != 0){
            this.items.get(1).forEach(item -> builder.append(items.toString()).append(System.lineSeparator()));
        }



        long cashAmount = this.getItemAmout(2);

        builder.append(String.format("<Cash> $%d", gemsAmount)).append(System.lineSeparator());

        if(gemsAmount != 0){
            this.items.get(2).forEach(item -> builder.append(items.toString()).append(System.lineSeparator()));
        }

        return builder.toString();
    }
}
