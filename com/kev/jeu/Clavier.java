package com.kev.jeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_SPACE && Main.scene.finDuJeu == false) {
			Main.scene.flappyBird.monte();
			Audio.playSound("/audio/battementAile.wav");
			
		}
		
	}

	
	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}
	
	

}
