package sg.edu.nus.iss;

public class Card {
    private final int value;
    private final String suit;

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return this.value;
    }

    public String getSuit() {
        return this.suit;
    }

    public String toString() {
        return "" + this.value + "-" + this.suit;
    }
}
