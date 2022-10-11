package WarGamePack;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Object.*;



public class gui {
	
	public gui() {
		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(0, 0, 1280, 720);
		
		//Initialize panel and panel layout
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1280, 720);
		
		
		//adds background image - Ryan M.

		JButton secondButton = new JButton("2P");
		secondButton.setFont(new Font("Arial", Font.PLAIN, 14));
		secondButton.setBounds(641, 322, 165, 76);
		JButton resetBut = new JButton("Reset");
		resetBut.setVisible(false);
		resetBut.setBounds(1151, 11, 91, 35);
		panel.setLayout(null);
		
		

		

		
		
		JButton firstButton = new JButton("1P");
		firstButton.setFont(new Font("Arial", Font.PLAIN, 14));
		firstButton.setBounds(408, 322, 165, 76);
		panel.add(firstButton);
		
		

		

		panel.add(secondButton);
		panel.add(resetBut);

		
		
		
		
		
		frame.setTitle("Card Game of War");
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(panel);
		JButton draw = new JButton("Draw");
		draw.setBounds(533, 524, 177, 82);
		draw.setVisible(false);
		panel.add(draw);
		
		JLabel title = new JLabel("Game of War!");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Arial", Font.PLAIN, 50));
		title.setBounds(472, 81, 316, 59);
		panel.add(title);
		
		JLabel backGround1 = new JLabel("");
		backGround1.setIcon(new ImageIcon("C:\\Users\\Jerry Parng\\eclipse-workspace\\WarGame\\bin\\resources\\bg.png"));
		backGround1.setBounds(0, 1, 1270, 690);
		panel.add(backGround1);
		
		JLabel backGround2 = new JLabel("");
		backGround2.setIcon(new ImageIcon("C:\\Users\\Jerry Parng\\eclipse-workspace\\WarGame\\bin\\resources\\bg_1play.jpg"));
		backGround2.setBounds(0, 0, 1270, 691);
		panel.add(backGround2);
		
		JLabel backGround3 = new JLabel("");
		backGround3.setIcon(new ImageIcon("C:\\Users\\Jerry Parng\\eclipse-workspace\\WarGame\\bin\\resources\\bg_2play.jpg"));
		backGround3.setBounds(0, 1, 1270, 690);
		panel.add(backGround3);
	
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
			}
		});
	
	}

}


