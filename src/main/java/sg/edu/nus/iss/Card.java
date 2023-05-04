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
        String returnValue = "";
        switch (this.value) {
            case 1:
                returnValue = "A";
                break;
            case 11:
                returnValue = "J";
                break;
            case 12:
                returnValue = "Q";
                break;
            case 13:
                returnValue = "K";
                break;
            default:
                returnValue = String.valueOf(this.value);
        }
        return "" + returnValue + "-" + this.suit;
    }
}
