package Inheritance.PlayersAndMonsters.hero;

public class Knight extends Hero {
    public Knight(String username, int level) {
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
