package sg.edu.nus.iss;

import java.util.Objects;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DeckOfCards deck = new DeckOfCards();
        System.out.println("New deck of cards:");
        System.out.println(deck.toString());
        
        deck.shuffleDeck();
        System.out.println("After shuffling deck:");
        System.out.println(deck.toString());

        for (int i = 0; i < 30; i++) {
            Card dealtCard = deck.dealCard();
            if (!Objects.isNull(dealtCard))
                System.out.println("Dealt a card: " + dealtCard.toString());
        }

        System.out.println("Remaining cards in deck: " + deck.noOfCards());
        System.out.println(deck.toString());

        for (int i = 0; i < 25; i++) {
            Card dealtCard = deck.dealCard();
            if (!Objects.isNull(dealtCard))
                System.out.println("Dealt a card: " + dealtCard.toString());
        }
    }
}
