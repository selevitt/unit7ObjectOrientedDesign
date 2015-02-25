/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Jack", "Hearts", 11);
		Card card2 = new Card("Jack", "Hearts", 11);
		Card card3 = new Card("Ten", "Spades", 10);
		Card card4 = new Card("Two", "Clubs", 2);
		
		int points1 = card1.pointValue();
		int points2 = card2.pointValue();
		int points3 = card3.pointValue();
		int points4 = card4.pointValue();
		
		System.out.println(points1 + " " + points2 + " " + points3 + " " + points4);
		
		String rank1 = card1.rank();
		String rank2 = card2.rank();
		String rank3 = card3.rank();
		String rank4 = card4.rank();
		
		System.out.println(rank1 + " " + rank2 + " " + rank3 + " " + rank4);
		
		String suit1 = card1.suit();
		String suit2 = card2.suit();
		String suit3 = card3.suit();
		String suit4 = card4.suit();
		
		System.out.println(suit1 + " " + suit2 + " " + suit3 + " " + suit4);
		
		boolean compare1 = card1.matches(card2);
		boolean compare2 = card2.matches(card3);
		
		String cardS1 = card1.toString();
		String cardS2 = card2.toString();
		String cardS3 = card3.toString();
		String cardS4 = card4.toString();
		
		System.out.println(cardS1 + " " + cardS2 + " " + cardS3 + " " + cardS4);
	}
}
