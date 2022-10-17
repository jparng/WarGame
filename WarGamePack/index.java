package WarGamePack;


public class index extends javax.swing.JFrame {

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
