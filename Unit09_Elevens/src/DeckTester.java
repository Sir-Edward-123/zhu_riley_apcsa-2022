/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Deck testDeck1 = new Deck(new String[]{"City Gov't", "State Gov't", "Federal Gov't"}, new String[]{"USA", "Canada"}, new int[]{1, 2, 3});
		Deck testDeck2 = new Deck(new String[]{"Hamburger", "Cheeseburger"}, new String[]{"McDonalds", "In N' Out"}, new int[]{2, 4});
		Deck testDeck3 = new Deck(new String[]{"Ten", "Jack", "Queen", "King"}, new String[]{"Hearts", "Spades", "Clubs"}, new int[]{10, 11, 12, 13});
		
		System.out.println("testDeck1 size: " + testDeck1.size() + ", is empty:" + testDeck1.isEmpty());
		System.out.println("testDeck1 size: " + testDeck2.size() + ", is empty:" + testDeck2.isEmpty());
		System.out.println("testDeck1 size: " + testDeck3.size() + ", is empty:" + testDeck3.isEmpty());
		System.out.println();
		
		System.out.println("testDeck1 dealt card: " + testDeck1.deal());
		System.out.println("testDeck2 dealt card: " + testDeck2.deal());
		System.out.println("testDeck3 dealt card: " + testDeck3.deal());
		System.out.println();
		
		System.out.println(testDeck1);
		System.out.println(testDeck2);
		System.out.println(testDeck3);
		System.out.println();
		
		System.out.println("----- Shuffle Tests -----");
		System.out.println();
		
		Deck testStandardDeck = new Deck(new String[]{"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"}, 
				new String[]{"Hearts", "Clubs", "Diamonds", "Spades"}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13});
		System.out.println(testStandardDeck);
		testStandardDeck.shuffle();
		System.out.println(testStandardDeck);
		testStandardDeck.shuffle();
		System.out.println(testStandardDeck);
		testStandardDeck.shuffle();
		System.out.println(testStandardDeck);
		testStandardDeck.shuffle();
		System.out.println(testStandardDeck);
		testStandardDeck.shuffle();
		System.out.println(testStandardDeck);
		testStandardDeck.shuffle();
		System.out.println(testStandardDeck);
		testStandardDeck.shuffle();
		System.out.println(testStandardDeck);
		testStandardDeck.shuffle();
		System.out.println(testStandardDeck);
	}
}
