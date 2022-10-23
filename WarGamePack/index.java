package WarGamePack;


public class index extends javax.swing.JFrame {
	
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
	
		public static class Card {
	    private int rank;
	    private int suit;
	    final BufferedImage image;
	    
	    private static String[] suits = {"clubs", "diamonds", "hearts", "spades"};
	    public static final int CLUBS    = 0;
	    public static final int DIAMONDS = 1;
	    public static final int HEARTS   = 2;
	    public static final int SPADES   = 3;
	    
	    private static String[] ranks = {null, null, "2", "3", "4", "5", "6", "7", "8", 
	                                     "9", "10", "jack", "queen", "king", "ace"};
	    public static final int JACK  = 11;
	    public static final int QUEEN = 12;
	    public static final int KING  = 13;
	    public static final int ACE   = 14;
	    
	    /** Constructor
	      * rank can be 2, 3, ..., 10, JACK, QUEEN, KING, ACE
	      * suit can be CLUBS, DIAMONDS, HEARTS, SPADES
	     * @throws IOException 
	      */
	    public Card (int rank, int suit) throws IOException {
	        if (rank < 2 || rank > ACE)
	            throw new IllegalArgumentException("invalid rank: " + rank);
	        if (suit < 0 || suit > 3)
	            throw new IllegalArgumentException("invalid suit: " + suit);
	        this.rank = rank;
	        this.suit = suit;
	        File imageFile = new File("Cards", this.rank + "_of_" + this.suit + ".png");
	        this.image = ImageIO.read(imageFile);
	    }
	    
	    /** Returns the suit of the card:
	      *  CLUBS, DIAMONDS, HEARTS, SPADES
	      */
	    public int getSuit() {
	        return this.suit;
	    }
	    
	    /** Returns the rank of the card:
	     *   2, 3, ..., 10, JACK, QUEEN, KING, ACE
	     */
	    public int getRank() {
	        return this.rank;
	    }
	    
	    /** Returns a string representation of the card
	      */
	    public String toString() {
	        return ranks[rank] + " of " + suits[suit];
	    }
	        
	    /** Returns a negative number if this object is lower in rank than c,
	     *   0 if the cards are equal rank, and a positive number if this object
	     *   is higher in rank than c. Aces are considered 'high'.
	     */
	    public int compareRank(Card c) {
	        return rank - c.rank;
	    }
	    
	    /** Returns true if the objects are equals, false otherwise
	      */
	    public boolean equals(Card c) {
	        return rank == c.rank && suit == c.suit;
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
		
	}
	
	public static void main(String args[]) {
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new index().setVisible(true);
			}
		});
		
	}
}
