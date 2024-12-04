package cardgame;

import java.util.Random;

public class CardManager {
    private Card[] deck;  // One-dimensional array of cards
    private int currentCardIndex;  // Tracks the current card to deal

    public CardManager() {
        deck = new Card[52];
        int index = 0;
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                deck[index++] = new Card(suit, rank);  // Fills the deck array with cards
            }
        }
        currentCardIndex = 0;
    }

    // Shuffle the deck using the Fisher-Yates shuffle algorithm
    public void shuffle() {
        Random random = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        currentCardIndex = 0;  // Resets the card index after shuffle
    }

    // Deals a card from the deck
    public Card dealCard() throws Exception {
        if (currentCardIndex >= deck.length) {
            throw new Exception("No more cards in the deck!");
        }
        return deck[currentCardIndex++];
    }

    // Gets the number of cards left in the deck
    public int cardsLeft() {
        return deck.length - currentCardIndex;
    }

    // Method to print the deck for debugging
    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }
}
