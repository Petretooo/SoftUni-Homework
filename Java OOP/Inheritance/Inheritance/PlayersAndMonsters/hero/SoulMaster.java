package Inheritance.PlayersAndMonsters.hero;

public final class SoulMaster extends DarkWizard {
    public SoulMaster(String username, int level) {
        super(username, level);
    }

    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level: %d",
                this.getClass().getName(),
                this.getUsername(),
                this.getLevel());
    }
}
