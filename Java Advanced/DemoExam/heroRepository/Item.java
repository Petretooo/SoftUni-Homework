package DemoExam.heroRepository;

public class Item {
    private int strength;
    private int agility;
    private int intelligence;

    public Item(int strength, int agility, int intelligence) {
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getAgility() {
        return this.agility;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Item:" + System.lineSeparator());
        sb.append(String.format("  *  Strength: %s%n",this.getStrength()));
        sb.append(String.format("  *  Agility: %s%n",this.getAgility()));
        sb.append(String.format("  *  Intelligence: %s",this.getIntelligence()));

        return sb.toString().trim();
    }
}
