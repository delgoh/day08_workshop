package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {

    List<Card> deck = new ArrayList<>();
    
    public DeckOfCards() {
        for (int i = 1; i < 14; i++) {
            deck.add(new Card(i, "Spade"));
            deck.add(new Card(i, "Heart"));
            deck.add(new Card(i, "Club"));
            deck.add(new Card(i, "Diamond"));
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public Card dealCard() {
        if (!deck.isEmpty())
            return deck.remove(0);
        else {
            System.out.println("No more cards left");
            return null;
        }
    }

    public String toString() {
        String str = "";
        for (Card card : deck)
            str += card.toString() + "\n";
        return str;
    }
}
