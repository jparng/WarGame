package WarGamePack;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;
public class gui {
	
	public gui() {
		JFrame frame = new JFrame();
		
		JPanel panel = new JPanel();
		
		JButton firstButton = new JButton("1P");
		JButton secondButton = new JButton("2P");
		JLabel label = new JLabel("Card Game of War!");
		
		
		panel.setBorder(BorderFactory.createEmptyBorder(300,300,100,300));
		
		panel.add(label);
		panel.add(firstButton);
		panel.add(secondButton);
		panel.setLayout(new GridLayout(0, 1));
		

		frame.setTitle("Card Game of War");
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.pack();

		
		frame.setVisible(true);
		
	}
	
}
