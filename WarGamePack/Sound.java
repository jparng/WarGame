package WarGamePack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
	
	String winHand, winGame, shuffle, drawCard;
	SoundEffect se = new SoundEffect();
	
	public Sound() {
		
		winHand = ".//Sound_Effects/winHand.wav";
		winGame = ".//Sound_Effects/GameWon.wav";
		shuffle = ".//Sound_Effects/shuffle.wav";
		drawCard = ".//Sound_Effects/card.wav";
	}
	
public class SoundEffect {
		
		Clip clip;
		
		
		public void setFile(String soundFileName) {
			
			try {
				File file = new File(soundFileName);
				AudioInputStream sound = AudioSystem.getAudioInputStream(file);
				clip = AudioSystem.getClip();
				clip.open(sound);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public void play() {
			
			clip.setFramePosition(0);
			clip.start();
		}
	}
	
	//public class ButtonHandler implements ActionListener {
	//	public void actionPerformed(ActionEvent event) {
	//		se.setFile(shuffle);
	//		se.play();
	//	}
	//}
	

}
	
	
