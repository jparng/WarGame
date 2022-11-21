package WarGamePack;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;



public class gui {
	
	public gui() {
		
		Sound sound = new Sound();
		
		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(0, 0, 1280, 720);
		
		
		//Initialize panel and panel layout
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1280, 720);
		JButton resetBut = new JButton("Reset");
		resetBut.setVisible(false);
		resetBut.setBounds(1151, 11, 91, 35);
		panel.setLayout(null);
		
		JLabel youWin = new JLabel("Player 1 Wins! Game Over!");
		youWin.setForeground(new Color(255, 255, 255));
		youWin.setFont(new Font("Arial", Font.BOLD, 48));
		youWin.setBounds(314, 276, 735, 173);
		panel.add(youWin);
		youWin.setVisible(false);
		
		JLabel youLose = new JLabel("CPU Wins! Game Over!");
		youLose.setForeground(new Color(255, 255, 255));
		youLose.setFont(new Font("Arial", Font.BOLD, 48));
		youLose.setBounds(370, 276, 636, 173);
		panel.add(youLose);
		youLose.setVisible(false);
		
		JLabel gameOver = new JLabel("");
		gameOver.setIcon(new ImageIcon(gui.class.getResource("/Backgrounds/bg.png")));
		gameOver.setBounds(0, 1, 1270, 690);
		panel.add(gameOver);
		gameOver.setVisible(false);
		
		JLabel tiePool = new JLabel("Tie Pool: ");
		tiePool.setForeground(new Color(255, 255, 255));
		tiePool.setFont(new Font("Arial", Font.BOLD, 20));
		tiePool.setBounds(524, 617, 123, 59);
		panel.add(tiePool);
		tiePool.setVisible(false);
		
		JLabel resultsText = new JLabel("Tie has occurred. Tied cards and 1 more card are placed in the tie pool. Draw again!");
		resultsText.setForeground(new Color(255, 255, 255));
		resultsText.setBackground(new Color(240, 240, 240));
		resultsText.setFont(new Font("Arial", Font.BOLD, 25));
		resultsText.setBounds(90, 23, 1031, 135);
		panel.add(resultsText);
		resultsText.setVisible(false);
		
		JLabel spoilsDeck2 = new JLabel("");
		spoilsDeck2.setIcon(new ImageIcon(gui.class.getResource("/Cards/Card-Back-Spoils.jpg")));
		spoilsDeck2.setBounds(1121, 242, 121, 189);
		panel.add(spoilsDeck2);
		spoilsDeck2.setVisible(false);
		
		JLabel spoilsDeck1 = new JLabel("");
		spoilsDeck1.setIcon(new ImageIcon(gui.class.getResource("/Cards/Card-Back-Spoils.jpg")));
		spoilsDeck1.setBounds(42, 242, 123, 189);
		panel.add(spoilsDeck1);
		spoilsDeck1.setVisible(false);
		
		JLabel mainDeck2 = new JLabel("");
		mainDeck2.setIcon(new ImageIcon(gui.class.getResource("/Cards/Card-Back-Resized.jpg")));
		mainDeck2.setBounds(958, 219, 165, 239);
		panel.add(mainDeck2);
		mainDeck2.setVisible(false);
		
		JLabel mainDeck1 = new JLabel("");
		mainDeck1.setIcon(new ImageIcon(gui.class.getResource("/Cards/Card-Back-Resized.jpg")));
		mainDeck1.setBounds(175, 219, 156, 230);
		panel.add(mainDeck1);
		mainDeck1.setVisible(false);
		
		JLabel title = new JLabel("Game of War!");
		title.setForeground(new Color(255, 255, 255));
		title.setBackground(new Color(255, 255, 255));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Arial", Font.BOLD, 50));
		title.setBounds(419, 79, 422, 59);
		panel.add(title);
		panel.add(resetBut);

		
		
		
		
		
		frame.setTitle("Card Game of War");
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(panel);
		
		JButton draw = new JButton("Draw");
		draw.setBounds(533, 524, 177, 82);
		draw.setVisible(false);
		
		

		
		
		JButton firstButton = new JButton("Start Game");
		firstButton.setFont(new Font("Arial", Font.PLAIN, 14));
		firstButton.setBounds(545, 324, 165, 76);
		panel.add(firstButton);
		
		
		

		
		
		//adds background image - Ryan M.

		

		panel.add(draw);
		
		JLabel activeCard1 = new JLabel("");
		activeCard1.setIcon(new ImageIcon(gui.class.getResource("/Cards/Card-Back-Active.jpg")));
		activeCard1.setBounds(370, 169, 231, 329);
		panel.add(activeCard1);
		activeCard1.setVisible(false);
		
		JLabel activeCard2 = new JLabel("");
		activeCard2.setIcon(new ImageIcon(gui.class.getResource("/Cards/Card-Back-Active.jpg")));
		activeCard2.setBounds(680, 169, 231, 329);
		panel.add(activeCard2);
		activeCard2.setVisible(false);
		
		JLabel deckCount1 = new JLabel("");
		deckCount1.setForeground(new Color(255, 255, 255));
		deckCount1.setFont(new Font("Tahoma", Font.BOLD, 24));
		deckCount1.setBounds(175, 472, 156, 47);
		panel.add(deckCount1);
		deckCount1.setVisible(false);
		
		JLabel deckCount2 = new JLabel("");
		deckCount2.setForeground(new Color(255, 255, 255));
		deckCount2.setFont(new Font("Tahoma", Font.BOLD, 24));
		deckCount2.setBounds(945, 469, 160, 52);
		panel.add(deckCount2);
		deckCount2.setVisible(false);
		
		JLabel spoilsCount1 = new JLabel("Spoils: " + index.spoils1.size());
		spoilsCount1.setForeground(new Color(255, 255, 255));
		spoilsCount1.setFont(new Font("Tahoma", Font.BOLD, 20));
		spoilsCount1.setBounds(21, 437, 138, 61);
		panel.add(spoilsCount1);
		spoilsCount1.setVisible(false);
		
		JLabel spoilsCount2 = new JLabel("Spoils: " + index.spoils2.size());
		spoilsCount2.setForeground(new Color(255, 255, 255));
		spoilsCount2.setFont(new Font("Tahoma", Font.BOLD, 20));
		spoilsCount2.setBounds(1115, 442, 138, 51);
		panel.add(spoilsCount2);
		spoilsCount2.setVisible(false);
		
		JLabel backGround2 = new JLabel("");
		backGround2.setIcon(new ImageIcon(gui.class.getResource("/Backgrounds/bg_1play.jpg")));
		backGround2.setBounds(0, 0, 1270, 691);
		panel.add(backGround2);
		
		JLabel backGround1 = new JLabel("");
		backGround1.setIcon(new ImageIcon(gui.class.getResource("/Backgrounds/bg.png")));
		backGround1.setBounds(0, 1, 1270, 690);
		panel.add(backGround1);
	
		backGround2.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		frame.setVisible(true);
		
		
		//if 1p or 2p is clicked, hide buttons and create second layout with decks, draw buttons, win counter, music toggle, and speed toggle
		firstButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index.startGame();
				
				firstButton.setVisible(false);
				title.setVisible(false);
				draw.setVisible(true);
				resetBut.setVisible(true);
				backGround1.setVisible(false);
				backGround2.setVisible(true);
				mainDeck1.setVisible(true);
				mainDeck2.setVisible(true);
				deckCount1.setVisible(true);
				deckCount2.setVisible(true);
				spoilsCount1.setVisible(true);
				spoilsCount2.setVisible(true);
				tiePool.setVisible(true);
				youLose.setVisible(false);
				youWin.setVisible(false);
				gameOver.setVisible(false);
				deckCount1.setText("Deck: " + index.deck1.size());
				deckCount2.setText("Deck: " + index.deck2.size());
				spoilsCount1.setText("Spoils: " + index.spoils1.size());
				spoilsCount2.setText("Spoils: " + index.spoils2.size());
				tiePool.setText("Tie Pool: " + index.tie.size());
				
				sound.shuffle();
				
			}
		});
		
		
		
		
		
		
		//Resets all buttons and title 
		resetBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index.reset();
				
				firstButton.setVisible(true);
				title.setVisible(true);
				draw.setVisible(false);
				resetBut.setVisible(false);
				backGround1.setVisible(true);
				backGround2.setVisible(false);
				mainDeck1.setVisible(false);
				mainDeck2.setVisible(false);
				spoilsDeck1.setVisible(false);
				spoilsDeck2.setVisible(false);
				activeCard1.setVisible(false);
				activeCard2.setVisible(false);
				deckCount1.setVisible(false);
				deckCount2.setVisible(false);
				spoilsCount1.setVisible(false);
				spoilsCount2.setVisible(false);
				tiePool.setVisible(false);
				youLose.setVisible(false);
				youWin.setVisible(false);
				gameOver.setVisible(false);
				draw.setEnabled(true);
				resultsText.setVisible(false);


				
				
			}
		});
		
		draw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//draws the cards
				if(index.checkGame() == 0) {
					try {
						index.drawCard();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else if(index.checkGame() == 1){
					
					gameOver.setVisible(true);
					youLose.setVisible(true);
					draw.setVisible(false);
					backGround1.setVisible(false);
					backGround2.setVisible(false);
					mainDeck1.setVisible(false);
					mainDeck2.setVisible(false);
					spoilsDeck1.setVisible(false);
					spoilsDeck2.setVisible(false);
					activeCard1.setVisible(false);
					activeCard2.setVisible(false);
					deckCount1.setVisible(false);
					deckCount2.setVisible(false);
					spoilsCount1.setVisible(false);
					spoilsCount2.setVisible(false);
					tiePool.setVisible(false);
					resultsText.setVisible(false);
					
				}else if(index.checkGame() == 2) {
					
					gameOver.setVisible(true);
					youWin.setVisible(true);
					draw.setVisible(false);
					backGround1.setVisible(false);
					backGround2.setVisible(false);
					mainDeck1.setVisible(false);
					mainDeck2.setVisible(false);
					spoilsDeck1.setVisible(false);
					spoilsDeck2.setVisible(false);
					activeCard1.setVisible(false);
					activeCard2.setVisible(false);
					deckCount1.setVisible(false);
					deckCount2.setVisible(false);
					spoilsCount1.setVisible(false);
					spoilsCount2.setVisible(false);
					tiePool.setVisible(false);
					resultsText.setVisible(false);
				}
				
				if(index.card1.compareRank(index.card2) == 0) {
					resultsText.setText("Tie has occurred. Tied card + 1 more card placed into the tie pool. Draw again!");
					resultsText.setVisible(true);
				}else if(index.card1.compareRank(index.card2) > 0) {
					resultsText.setText("Player 1 wins! " + "Card total increased to " + index.spoils1.size());
					resultsText.setVisible(true);
				}else if(index.card1.compareRank(index.card2) < 0 ) {
					resultsText.setText("Player 2 wins! " + "Card total increased to " + index.spoils2.size());
					resultsText.setVisible(true);
				}
				else {
					resultsText.setVisible(false);
				}
				
				

				
				sound.draw();
				
				if(index.deck1.size() == 0) {
					mainDeck1.setVisible(false);
				}else {
					mainDeck1.setVisible(true);
				}
				if(index.deck2.size() == 0) {
					mainDeck2.setVisible(false);
				} else {
					mainDeck2.setVisible(true);
				}
				
				
				if(index.spoils1.size() > 0 ) {
					spoilsDeck1.setVisible(true);
				}else if(index.spoils1.size() == 0) {
					spoilsDeck1.setVisible(false);
				}
				if (index.spoils2.size() > 0) {
					spoilsDeck2.setVisible(true);
				}else if(index.spoils2.size() == 0) {
					spoilsDeck2.setVisible(false);
				}
				
				
				try {
					activeCard1.setIcon(new ImageIcon(gui.class.getResource(index.card1.getImage().toString())));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					activeCard2.setIcon(new ImageIcon(gui.class.getResource(index.card2.getImage().toString())));
				} catch (IOException e2) {
					e2.printStackTrace();
				}
				
				deckCount1.setText("Deck: " + index.deck1.size());
				deckCount2.setText("Deck: " + index.deck2.size());
				spoilsCount1.setText("Spoils: " + index.spoils1.size());
				spoilsCount2.setText("Spoils: " + index.spoils2.size());
				tiePool.setText("Tie Pool: " + index.tie.size());
				
				activeCard1.setVisible(true);
				activeCard2.setVisible(true);
			}
		});
		

			
	}
	
}


