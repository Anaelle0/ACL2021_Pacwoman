package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import engine.GamePainter;

//afficheur graphique pour le game

public class PacmanPainter implements GamePainter {

	//taille du plateau
	 
	protected static final int WIDTH = 500;
	protected static final int HEIGHT = 500;

	/**
	 * appelle constructeur parent
	 * 
	 * @param game
	 *            le jeutest a afficher
	 */
	public PacmanPainter() {
	}

	//methode  redefinie de Afficheur retourne une image du jeu

	public void draw(BufferedImage im) {
		Graphics2D crayon = (Graphics2D) im.getGraphics();
		crayon.setColor(Color.pink);
		crayon.fillOval(0,0,10,10);
	}

	public int getWidth() {
		return WIDTH;
	}

	public int getHeight() {
		return HEIGHT;
	}

}
