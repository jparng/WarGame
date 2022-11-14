package WarGamePack;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedList;

import javax.sound.sampled.*;




public class index extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static LinkedList<Card> deck1 = new LinkedList<Card>();
	public static LinkedList<Card> deck2 = new LinkedList<Card>();
	public static LinkedList<Card> deck = new LinkedList<Card>();
	public static LinkedList<Card> spoils1 = new LinkedList<Card>();
	public static LinkedList<Card> spoils2 = new LinkedList<Card>();
	public static LinkedList<Card> tie1 = new LinkedList<Card>();
	public static LinkedList<Card> tie2 = new LinkedList<Card>();
	public static Card card1;
	public static Card card2;
	public static int result;
	

	

	
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
	

	
	
	public static void startGame() {
		
		try {
			//initializes 52 card deck and the splits into two separate decks
			newDeck(deck);
			firstDeck(deck1, deck);
			secondDeck(deck2, deck);
			
//			deck1.add(new Card(Card.ACE, Card.SPADES));
//			deck1.add(new Card(Card.KING, Card.DIAMONDS));
//			deck1.add(new Card(Card.JACK, Card.HEARTS));
//			deck2.add(new Card(Card.ACE, Card.CLUBS));
//			deck2.add(new Card(Card.QUEEN, Card.SPADES));
//			deck2.add(new Card(Card.QUEEN, Card.DIAMONDS));
			
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
	
	public static void refreshCards(LinkedList<Card> deck1, LinkedList<Card> deck2) {
		if(deck1.size() == 0) {
			for(int i = 0; i < spoils1.size(); i++) {
				deck1.add(spoils1.get(i));
			}
			spoils1.clear();
			Collections.shuffle(deck1);
		}
		
		if(deck2.size() == 0) {
			for(int i = 0; i < spoils2.size(); i++) {
				deck2.add(spoils2.get(i));
			}
			spoils2.clear();
			Collections.shuffle(deck2);
		}
	}
	
	
	
	public static void drawCard() throws IOException {
		refreshCards(deck1, deck2);
		card1 = deck1.pop();
		card2 = deck2.pop();

		
		System.out.println("card1: " + card1);
		System.out.println("card1 image: " + card1.getImage());
		System.out.println("card2: " + card2 );
		System.out.println("card2 image: " + card2.getImage());
		

		checkCard(card1, card2, deck1, deck2, spoils1, spoils2, tie1, tie2, result);
		System.out.println("Outcome = " + result);
		System.out.println("Spoils1 count: " + spoils1.size());
		System.out.println("Spoils1 deck: " + spoils1);
		System.out.println("Spoils2 count: " + spoils2.size());
		System.out.println("Spoils2 deck: " + spoils2);
		System.out.println("deck1: " + deck1);
		System.out.println("deck1 count: " + deck1.size());
		
		System.out.println("deck2: " + deck2);
		System.out.println("deck2 count: " + deck2.size());
		
		
		
		
		
	}
	
	public static void tie( LinkedList<Card> deck1, LinkedList<Card>deck2, LinkedList<Card> spoils1, LinkedList<Card> spoils2, LinkedList<Card> tie1, LinkedList<Card> tie2, Card c1, Card c2) {
		//in the event of a tie, have draw one card and place it into the tie pool, then draw again and compare the ranks to see which card is higher, then move those cards to winner's deck
		
		refreshCards(deck1, deck2);
		Card temp = deck1.pop();
		Card temp2 = deck2.pop();
		System.out.println("deck1 size: " + deck1.size());
		System.out.println("deck2 size: " + deck2.size());
		tie1.add(c1);
		tie2.add(c2);
		tie1.add(temp);
		tie2.add(temp2);
		
		System.out.println("Tie pool1: " + tie1.size());
		System.out.println("Tie pool2: " + tie2.size());
		System.out.println("Tie deck1: " + tie1);
		System.out.println("Tie deck2: " + tie2);
		
	}
	
	
	public static void checkCard(Card card1, Card card2,LinkedList<Card> deck1, LinkedList<Card> deck2, LinkedList<Card> spoils1, LinkedList<Card> spoils2, LinkedList<Card> tie1, LinkedList<Card> tie2, int outcome) {
		//d1 = popped card from Deck1, d2 = popped card from Deck2
		
		outcome = card1.compareRank(card2);
		
		if (outcome > 0) {
			System.out.println("Player 1 wins!");
			spoils1.add(card1);
			spoils1.add(card2);
			if(tie1.size() > 0) {
				for(int i = 0; i <= tie1.size() - 1; i++) {
					spoils1.add(tie1.get(i));
					}
				for(int i = 0; i <= tie2.size() - 1; i++) {
					spoils1.add(tie2.get(i));
				}
			tie1.clear();
			tie2.clear();
			}
		} else if (outcome < 0) {
			System.out.println("Player 2 wins!");
			spoils2.add(card1);
			spoils2.add(card2);
			if(tie2.size() > 0) {
				for(int i = 0; i <= tie1.size() - 1; i++) {
					spoils2.add(tie1.get(i));
					}
				for(int i = 0; i <= tie2.size() - 1; i++) {
					spoils2.add(tie2.get(i));
				}
			tie1.clear();
			tie2.clear();
			}
				
		}else {
			System.out.println("Tie has occurred, one extra card has been added to spoils. draw again");
			tie(deck1, deck2, spoils1, spoils2,tie1, tie2, card1, card2);
		}
	}


	
	
	public static void reset() {
		//Clears the cards from the deck
		deck.clear();
		deck1.clear();
		deck2.clear();
		spoils1.clear();
		spoils2.clear();
		
		
		System.out.println("deck1: " + deck1);
		System.out.println("deck2: " + deck2);
		System.out.println("full deck: " + deck.size());
		
	}
	
	
	
	public static void main(String args[]) {
		new gui();
		
	}
}
