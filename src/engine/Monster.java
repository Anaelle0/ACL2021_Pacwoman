package engine;


import java.io.BufferedReader;
import java.awt.event.KeyEvent;

public class Monster extends Personnage{
	private static int abscisse=1;
	private static int ordonnee=1;

	//public Monster() {
		// TODO Auto-generated constructor stub
	//}
	public static Cmd aleatoire() {
		int[] listeCommande= {1,2,3,4};
		// 1=left, 2=up; 3=right; 4=down
		int nombreAleatoire =(int)(Math.random() * 5);
		//aleat renvoie un nombre aléatoire entre 0 et 3, qui correspondra à la position dans la liste
		int commande=listeCommande[nombreAleatoire];
		if (commande==1) {
			return Cmd.LEFT;
		}
		if (commande==2) {
			return Cmd.UP;
		}
		if (commande==3) {
			return Cmd.RIGHT;
		}
		else {
			return Cmd.DOWN;
		}
	}
	/*
	public static void move(Cmd commande) {
		switch (commande) {
			case LEFT:
				computePos(Personnage.getAbscisse()-1,ordonnee);
				break;
			case UP:
				computePos(Personnage.getAbscisse(),ordonnee-1); // -1 car on veut labyrinthe[indice-1]
				break;
			case RIGHT:
				computePos(Personnage.getAbscisse()+1,ordonnee);
				break;
			case DOWN:
				computePos(Personnage.getAbscisse(),ordonnee+1);	// +1 car on veut labyrinthe[indice+1]
				break;
			}
	}
	*/

		
	}
	


