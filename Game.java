public class Game {

	private int NombreCleNiveau=1;
	private int NombreCle=0;
	
	public boolean finJeu() {
		// vérifie si le joueur a bien récupéré toutes les clés du niveau et qu'il est sur la case arrivée
		if (NombreCle==NombreCleNiveau & Case.VerifArrivee(0, 0)==true) {
			return true;
		}
		else {
			return false;
		}
	}
}
