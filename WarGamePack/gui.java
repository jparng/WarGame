package WarGamePack;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Object.*;
import javax.sound.sampled.*;


public class gui {
	
	
	public gui() {
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
		
		JLabel mainDeck2 = new JLabel("");
		mainDeck2.setIcon(new ImageIcon(gui.class.getResource("/resources/Cards/Card-Back-Resized.jpg")));
		mainDeck2.setBounds(958, 219, 165, 239);
		panel.add(mainDeck2);
		mainDeck2.setVisible(false);
		
		JLabel mainDeck1 = new JLabel("");
		mainDeck1.setIcon(new ImageIcon(gui.class.getResource("/resources/Cards/Card-Back-Resized.jpg")));
		mainDeck1.setBounds(175, 219, 156, 230);
		panel.add(mainDeck1);
		mainDeck1.setVisible(false);
		
		JLabel title = new JLabel("Game of War!");
		title.setForeground(new Color(0, 0, 0));
		title.setBackground(new Color(255, 255, 255));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Arial", Font.PLAIN, 50));
		title.setBounds(472, 81, 316, 59);
		panel.add(title);
		panel.add(resetBut);

		
		
		
		
		
		frame.setTitle("Card Game of War");
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(panel);
		JButton draw = new JButton("Draw");
		draw.setBounds(533, 524, 177, 82);
		draw.setVisible(false);
		
		

		
		
		JButton firstButton = new JButton("1P");
		firstButton.setFont(new Font("Arial", Font.PLAIN, 14));
		firstButton.setBounds(408, 322, 165, 76);
		panel.add(firstButton);
		
		
		

		
		
		//adds background image - Ryan M.

		JButton secondButton = new JButton("2P");
		secondButton.setFont(new Font("Arial", Font.PLAIN, 14));
		secondButton.setBounds(641, 322, 165, 76);
		
		

		

		panel.add(secondButton);
		

		panel.add(draw);
		
		JLabel backGround2 = new JLabel("");
		backGround2.setIcon(new ImageIcon(gui.class.getResource("/resources/bg_1play.jpg")));
		backGround2.setBounds(0, 0, 1270, 691);
		panel.add(backGround2);
		
		JLabel backGround1 = new JLabel("");
		backGround1.setIcon(new ImageIcon(gui.class.getResource("/resources/bg.png")));
		backGround1.setBounds(0, 1, 1270, 690);
		panel.add(backGround1);
		
		JLabel backGround3 = new JLabel("");
		backGround3.setIcon(new ImageIcon(gui.class.getResource("/resources/bg_2play.jpg")));
		backGround3.setBounds(0, 1, 1270, 690);
		panel.add(backGround3);
		
		JLabel activeCard1 = new JLabel("");
		activeCard1.setBounds(377, 183, 212, 307);
		panel.add(activeCard1);
		
		JLabel activeCard2 = new JLabel("");
		activeCard2.setBounds(693, 183, 212, 307);
		panel.add(activeCard2);
		
		JLabel spoilsDeck1 = new JLabel("");
		spoilsDeck1.setBounds(50, 265, 103, 154);
		panel.add(spoilsDeck1);
		
		JLabel spoilsDeck2 = new JLabel("");
		spoilsDeck2.setBounds(1126, 265, 103, 154);
		panel.add(spoilsDeck2);
	
		backGround2.setVisible(false);
		backGround3.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
		
		
		//if 1p or 2p is clicked, hide buttons and create second layout with decks, draw buttons, win counter, music toggle, and speed toggle
		firstButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstButton.setVisible(false);
				secondButton.setVisible(false);
				title.setVisible(false);
				draw.setVisible(true);
				resetBut.setVisible(true);
				backGround1.setVisible(false);
				backGround2.setVisible(true);
				mainDeck1.setVisible(true);
				mainDeck2.setVisible(true);
				
			}
		});
		
		
		//2 player button
		secondButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstButton.setVisible(false);
				secondButton.setVisible(false);
				title.setVisible(false);
				draw.setVisible(true);
				resetBut.setVisible(true);
				backGround1.setVisible(false);
				backGround2.setVisible(false);
				backGround3.setVisible(true);
				mainDeck1.setVisible(true);
				mainDeck2.setVisible(true);
			}
		});
		
		
		
		
		//Resets all buttons and title 
		resetBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstButton.setVisible(true);
				secondButton.setVisible(true);
				title.setVisible(true);
				draw.setVisible(false);
				resetBut.setVisible(false);
				backGround1.setVisible(true);
				backGround2.setVisible(false);
				backGround3.setVisible(false);
				mainDeck1.setVisible(false);
				mainDeck2.setVisible(false);
			}
		});
		
		draw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//draws the cards
				index.drawCard();

			}
		});
	

		
		
	}
}
