package engine;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;


import model.PacmanGame;
import model.PacmanPainter;

public class Hero {
	private static int abscisse=1;
	private static int ordonnee=1;
	// private static int[] position = new int[] {abscisse,ordonnee}; // inutile pour l'instant

	public static void move(Cmd commande) {
		switch (commande) {
			case LEFT:
				computePos(getAbscisse()-1,ordonnee);
				break;
			case UP:
				computePos(getAbscisse(),ordonnee-1); // -1 car on veut labyrinthe[indice-1]
				break;
			case RIGHT:
				computePos(getAbscisse()+1,ordonnee);
				break;
			case DOWN:
				computePos(getAbscisse(),ordonnee+1);	// +1 car on veut labyrinthe[indice+1]
				break;
			}
	}

	
	public static void computePos(int x,int y) {
		if(PacmanGame.check(x,y)) {
			changePos(x,y);
		}
	}
	
	public static void changePos(int x,int y) {
		abscisse=x;
		ordonnee=y;
		//PacmanPainter.drawPacman(x,y); // les coordonnées changent maintenant il faut faire bouger le point sur le graphique
	}

	public static int getAbscisse() {
		return abscisse;
	}
	public static int getOrdonnee() {
		return ordonnee;
	}
}
