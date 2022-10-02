package WarGamePack;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Object.*;



public class gui {
	
	public gui() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton firstButton = new JButton("1P");
		JButton secondButton = new JButton("2P");
		JButton resetBut = new JButton("Reset");
		JButton draw = new JButton("Draw");
		draw.setVisible(false);
		JLabel title = new JLabel();
		
		//Title of game
		title.setText("Card Game of War!");
		title.setFont(new Font("Arial", Font.BOLD, 50));


		//adds background image -Ryan M.
		JLabel bg = new JLabel();
		ImageIcon img = new ImageIcon("bg.png");
		bg = new JLabel(" ",img,JLabel.CENTER);
		
		
		
	
		//adds Title,buttons, etc
		panel.add(title);
		panel.add(firstButton);
		panel.add(secondButton);
		panel.add(draw);
		panel.add(resetBut);

		
		
		
		//moves right, moves down, increases width, increases height for setting bounds
//		firstButton.setBounds(160,150,150,50);
//		secondButton.setBounds(240, 250, 200, 50); 
//		draw.setBounds(170, 170, 170, 50);
//		resetBut.setBounds(200,200,200,50); 
		
		frame.add(bg);
		frame.pack();
		frame.setTitle("Card Game of War");
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1280,720); //currently set to 720p windowed as to still allow room on screen - Ryan M.
		frame.setVisible(true);
		
		//if 1p or 2p is clicked, hide buttons and create second layout with decks, draw buttons, win counter, music toggle, and speed toggle
		firstButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstButton.setVisible(false);
				secondButton.setVisible(false);
				title.setVisible(false);
				draw.setVisible(true);
			}
		});
		
		//2 player button
		secondButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstButton.setVisible(false);
				secondButton.setVisible(false);
				title.setVisible(false);
				draw.setVisible(true);
			}
		});
		
		//Resets all buttons and title 
		resetBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstButton.setVisible(true);
				secondButton.setVisible(true);
				title.setVisible(true);
				draw.setVisible(false);
			}
		});
	
	}

}
