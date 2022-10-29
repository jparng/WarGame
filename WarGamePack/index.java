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
