package WarGamePack;


public class index extends javax.swing.JFrame {
	
	public static LinkedList<Card> deck1 = new LinkedList<Card>();
	public static LinkedList<Card> deck2 = new LinkedList<Card>();
	public static LinkedList<Card> deck = new LinkedList<Card>();
	
	
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
	
	public void addAtEnd(int number, int suit) {
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
	
	
	

	public class Player1{
		
	}
	
	public class Player2{
		
	}
	
	public class WinnersPile{
		
	}
	
	
	
	

	
	public index() {
		gui = new gui();
	}
	
	
	//Splits deck into 26 cards for Player 1
	public static LinkedList<Card> firstDeck(LinkedList<Card> deck1, LinkedList<Card> fullDeck){
		//takes 1st half of deck and adds to the Player 1's deck
		for(int i = 0; i < fullDeck.size() / 2; i++) {
			deck1.add(fullDeck.get(i));
		}
		return deck1;
	}
	//Splits deck into 26 cards for Player 2
	public static LinkedList<Card> secondDeck(LinkedList<Card> deck2, LinkedList<Card> fullDeck) {
		//takes  2nd half of deck and adds to Player 2's deck
		for(int i = fullDeck.size() - 1; i >= fullDeck.size() / 2; --i) {
			deck2.add(fullDeck.get(i));
		}
		return deck2;
	}
	
	//Initializes the full deck
    	public static LinkedList<Card> newDeck(LinkedList<Card> deck) throws IOException {
        // 4 suits
        for(int i = 0; i < 4; i++) {
        	//13 ranks
        	for(int j = 2; j <= 14; j++) {
        		deck.add(new Card(j, i));
        	}
        }
        
        Collections.shuffle(deck);
		return deck;
    }
	
	
	
	
	
	
	
	public static void startGame() {
		
	try {
		newDeck(deck);
		firstDeck(deck1, deck);
		secondDeck(deck2, deck);
	    } catch (IOException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
	    	}
	System.out.println("Deck: " + deck);
		
	System.out.println("deck1: " + deck1);
	System.out.println("deck1 count: " + deck1.size());
		
	System.out.println("deck2: " + deck2);
	System.out.println("deck2 count: " + deck2.size());
		
	}
	
	
	public static void drawCard() {
		//draws cards from the deck
		
	}
	
	public static void Reset() {
		//Clears the cards from the deck
		deck.clear();
		deck1.clear();
		deck2.clear();
		
		
		System.out.println("deck1: " + deck1);
		System.out.println("deck2: " + deck2);
		System.out.println("full deck: " + deck);

	}
	
	
	public static void main(String args[]) {
		
		new gui();
		
	}
}
