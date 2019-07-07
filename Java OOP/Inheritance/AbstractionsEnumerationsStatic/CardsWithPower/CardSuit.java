package AbstractionsEnumerationsStatic.CardsWithPower;
public enum CardSuit {

    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);

    private int suits;

    CardSuit(int suits){
        this.suits = suits;
    }

    public int getSuits() {
        return suits;
    }
}
