package engine;

//un jeu qui peut evoluer (avant de se terminer) sur un plateau width x height

public interface Game {

	/**
	 * methode qui contient l'evolution du jeu en fonction de la commande
	 * 
	 * @param userCmd
	 *            commande utilisateur
	 */
	public void evolve(Cmd userCmd);
	
	public void check(int abscisse, int ordonnee);
	
	public void possedeCle();
	
	public void ajoutCle();
	
	// @return true si et seulement si le jeu est fini
	public boolean isFinished();

}
