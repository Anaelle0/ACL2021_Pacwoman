public class Game {

	private int NombreCleNiveau=1;
	private int NombreCle=0;
	
	public boolean finJeu() {
		// v�rifie si le joueur a bien r�cup�r� toutes les cl�s du niveau et qu'il est sur la case arriv�e
		if (NombreCle==NombreCleNiveau & Case.VerifArrivee(0, 0)==true) {
			return true;
		}
		else {
			return false;
		}
	}
}
