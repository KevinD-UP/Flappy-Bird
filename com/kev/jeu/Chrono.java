package com.kev.jeu;

public class Chrono implements Runnable {
	
	private final int PAUSE = 5;
	
	public void run() {
		while(Main.scene.finDuJeu == false)  {
			Main.scene.xFond--;
			Main.scene.repaint();
			try {
			Thread.sleep(this.PAUSE);
			} catch (InterruptedException e ) {} 
			
		}		

	}
	
}