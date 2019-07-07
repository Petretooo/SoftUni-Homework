package Inheritance.PlayersAndMonsters.hero;

public final class BladeKnight extends DarkWizard {
    public BladeKnight(String username, int level) {
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
