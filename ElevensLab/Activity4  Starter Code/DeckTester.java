/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"jack", "queen", "king"};
        String[] suits = {"blue", "red"};
        int[] pointValues = {11, 12, 13};
        Deck d = new Deck(ranks, suits, pointValues);

        System.out.println("**** Original Deck Methods ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal a Card ****");
        System.out.println("  deal: " + d.deal());
        System.out.println();
        System.out.println();

        System.out.println("**** Deck Methods After 1 Card Dealt ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal Remaining 5 Cards ****");
        for (int i = 0; i < 5; i++) {
            System.out.println("  deal: " + d.deal());
        }
        System.out.println();
        System.out.println();

        System.out.println("**** Deck Methods After All Cards Dealt ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal a Card From Empty Deck ****");
        System.out.println("  deal: " + d.deal());
        System.out.println();
        System.out.println();

        String[] newRanks = {"Ace", "King", "Queen", "Jack", "Ten", "Nine", "Eight", "Seven", 
                            "Six", "Five", "Four", "Three", "Two", "Ace", "King", "Queen", "Jack", "Ten", "Nine", "Eight", "Seven", 
                            "Six", "Five", "Four", "Three", "Two", "Ace", "King", "Queen", "Jack", "Ten", "Nine", "Eight", "Seven", 
                            "Six", "Five", "Four", "Three", "Two", "Ace", "King", "Queen", "Jack", "Ten", "Nine", "Eight", "Seven", 
                            "Six", "Five", "Four", "Three", "Two"};
        String[] newSuits = {"Diamonds", "Diamonds", "Diamonds", "Diamonds", "Diamonds", "Diamonds",
                            "Diamonds", "Diamonds", "Diamonds", "Diamonds", "Diamonds", "Diamonds",
                            "Diamonds", "Hearts", "Hearts", "Hearts", "Hearts", "Hearts", "Hearts", 
                            "Hearts", "Hearts", "Hearts", "Hearts", "Hearts", "Hearts", "Hearts", 
                            "Clubs", "Clubs", "Clubs", "Clubs", "Clubs", "Clubs", "Clubs", "Clubs", 
                            "Clubs", "Clubs", "Clubs", "Clubs", "Clubs", "Spades", "Spades", "Spades", 
                            "Spades", "Spades", "Spades", "Spades", "Spades", "Spades", "Spades", 
                            "Spades", "Spades", "Spades"};
        int[] newValues = {10, 10, 10, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2, 
                        10, 10, 10, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2, 
                        10, 10, 10, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2, 
                        10, 10, 10, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        Deck fullDeck = new Deck(newRanks, newSuits, newValues);
        for (int i = 0; i < 80; i++) {
            System.out.println();
        }

        System.out.println(fullDeck.deal());
        //fullDeck.shuffle();
        System.out.println(fullDeck.deal());
		    
	}
}
