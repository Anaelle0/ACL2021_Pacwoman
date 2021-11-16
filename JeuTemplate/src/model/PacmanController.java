package model;

import java.awt.event.KeyEvent;

import engine.Cmd;
import engine.GameController;

//controleur de type KeyListener

public class PacmanController implements GameController {
	//commande en cours

	private Cmd commandeEnCours;
	
	//construction du controleur par defaut le controleur n'a pas de commande

	public PacmanController() {
		this.commandeEnCours = Cmd.IDLE;
	}

	/**
	 * quand on demande les commandes, le controleur retourne la commande en
	 * cours
	 * 
	 * @return commande faite par le joueur
	 */
	public Cmd getCommand() {
		return this.commandeEnCours;
	}

	@Override
	/**
	 * met a jour les commandes en fonctions des touches appuyees
	 */
	public void keyPressed(KeyEvent e) {
		//System.out.println("The key Released was: " + e.getKeyCode());  // sert à connaitre le code d'une touche
		switch (e.getKeyCode()) {
		// si on appuie sur la flèche gauche,commande joueur est gauche
		case 37:
			this.commandeEnCours = Cmd.LEFT;
			//System.out.println(this.commandeEnCours);
			break;
		case 38:
			this.commandeEnCours = Cmd.UP;
			//System.out.println(this.commandeEnCours);
		    break;
		case 39:
			this.commandeEnCours = Cmd.RIGHT;
			//System.out.println(this.commandeEnCours);
		    break;
		case 40:
			this.commandeEnCours = Cmd.DOWN;
			//System.out.println(this.commandeEnCours);
		    break;
		}

	}

	@Override
	//met a jour les commandes quand le joueur relache une touche

	public void keyReleased(KeyEvent e) {
		this.commandeEnCours = Cmd.IDLE;
	}

	//ne fait rien

	public void keyTyped(KeyEvent e) {

	}

}
