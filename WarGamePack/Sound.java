package WarGamePack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

@SuppressWarnings("unused")
public class Sound {
	
	URL winGame;
	URL winHand;
	URL shuffle;
	URL drawCard;
	URL loseHand;
	Clip clip;
	
	public Sound() {
		
		winHand = getClass().getResource("/Sound_Effects/winHand.wav");
		winGame = getClass().getResource("/Sound_Effects/GameWon.wav");
		shuffle = getClass().getResource("/Sound_Effects/shuffle.wav");
		drawCard = getClass().getResource("/Sound_Effects/card.wav");
		loseHand = getClass().getResource("/Sound_Effects/loseHand.wav");
	}
	

	public void setFile(URL s) {
			
			try {
				AudioInputStream sound = AudioSystem.getAudioInputStream(s);
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
		
		public void shuffle(){
			setFile(shuffle);
			play();
		}
		public void draw() {
			setFile(drawCard);
			play();
		}
		
		public void winHand() {
			setFile(winHand);
			play();
		}
		public void loseHand() {
			setFile(loseHand);
			play();
		}

}
	
