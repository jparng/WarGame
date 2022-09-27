package WarGamePack;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
public class gui {
	
	public gui() {
		JFrame frame = new JFrame();
		
		JPanel panel = new JPanel();
		
		JButton firstButton = new JButton("1P");
		JButton secondButton = new JButton("2P");
		JLabel label = new JLabel();
		
		label.setText("Card Game of War!");
		label.setFont(new Font("Arial", Font.PLAIN, 50));
		
		
		panel.setBorder(BorderFactory.createEmptyBorder(300,300,150,300));		//Creates border for interface Top, left, bottom, right
		
		panel.add(label);
		panel.add(firstButton);
		panel.add(secondButton);
		panel.setLayout(new GridLayout(10, 5));
		

		frame.setTitle("Card Game of War");
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.pack();

		frame.setVisible(true);
		
		
		//if 1p or 2p is clicked, hide buttons and create second layout with decks, draw buttons, win counter, music toggle, and speed toggle
		
	}
	
}
