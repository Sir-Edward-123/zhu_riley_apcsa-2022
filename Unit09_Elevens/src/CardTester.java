/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card testCard1 = new Card("Nine", "Hearts", 9);
		Card testCard2 = new Card("King", "Spades", 13);
		Card testCard3 = new Card("King", "Spades", 13);
		
		System.out.println(testCard1.rank() + ", " + testCard1.suit() + ", " + testCard1.pointValue() + ", " + testCard1);
		System.out.println(testCard2.rank() + ", " + testCard2.suit() + ", " + testCard2.pointValue() + ", " + testCard2);
		System.out.println(testCard3.rank() + ", " + testCard3.suit() + ", " + testCard3.pointValue() + ", " + testCard3);
		System.out.println("testCard1 matches testCard2: " + testCard1.matches(testCard2));
		System.out.println("testCard3 matches testCard1: " + testCard3.matches(testCard1));
		System.out.println("testCard2 matches testCard3: " + testCard2.matches(testCard3));
	}
}
