package WarGamePack;


public class index extends javax.swing.JFrame {
	
	static LinkedList<Card> deck1 = new LinkedList<Card>();
	
	cardNode head = null;
	cardNode tail = null;
	
	class cardNode {
		cardNode prev;
		cardNode next;
		int number; //must be 1-13
		int suit; //must be 0-3
		//possible image to link nodes to the assets?

		public cardNode(int number, int suit) {
			this.number = number;
			this.suit = suit;
		}
	}
	
	public void addNode(int number, int suit) {
		cardNode newCard = new cardNode(number, suit);

		if(head==null) {
			head = newCard;
			tail = newCard;
			head.prev = null;
			tail.next = null;
		}
		else {
			tail.next = newCard;
			newCard.prev = tail;
			tail = newCard;
			tail.next = null;
		}
	}
	
	
	//The next six classes need to be linked together to use the same DLL
	public class CardCreator { //Creates the 52 cards
		LinkedList<Card> initialDeck = new LinkedList<Card>();

		for (i = 1; i < 14; i++) { //Accounts for all the numbers in the card, then gives each number the four suits
			for (j = 0; j < 4; j++) {
				initialDeck.addNode(i, j);
			}
		}
	}

	static double randomGenerator() { //Used for Sorter to develop random numbers
        return generator.nextInt()*0.5;
    }

	public class Sorter { //Puts 26 cards in player 1 and 26 in player 2
		LinkedList<Card> RandomDeck = new LinkedList<Card>(); //Creates a new 52-card deck to swap around the previous deck's positioning.
		
		Node currentCard = cardNode;
		int numVal;
		int suitVal;

		for (i=0; i<52; i++) { //Runs 52 times
        	for (n = 2; currentCard != null; n++) {

            	if (Math.random() % n == 0) {
                	numVal = currentCard.number;
					suitVal = currentCard.suit; //Sets the random node's number and suit to the num and suit variables
					RandomDeck.addNode(numVal, suitVal); //The randomly selected combination will be inserted as a new node.
            	}

            	currentCard  = currentCard.next; //Moves to the next node.
        	}
		}

		LinkedList<Card> SplitDeck1 = new LinkedList<Card>();
		LinkedList<Card> SplitDeck2 = new LinkedList<Card>();
		//for (i=0;i<26;i++), add each node to SplitDeck1, which goes to Player 1
		//for (i=0;i<26;i++), add each node to SplitDeck2, which goes to Player 2
	}

	public class Player1{
		
	}
	
	public class Player2{
		
	}
	
	public class WinnersPile{
		
	}
	
	public class Draw{
		
	}
	
	public class Reset{
		
	}
	
	
	
	
	gui gui;
	
	public index() {
		gui = new gui();
	}
	public static void drawCard() {
		//draws cards from the deck
		
		try {
			deck1.add(new Card(Card.ACE, Card.SPADES));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(deck1);
	}
	
	public static void Reset() {
		//Clears the cards from the deck
		deck1.clear();
		
		System.out.println(deck1);
	}
	
	public static void main(String args[]) {
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new index().setVisible(true);
			}
		});
		
	}
}
