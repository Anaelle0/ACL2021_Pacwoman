
public class Case {
	
	public boolean VerifCle(int x, int y) {
		// verifie si le personnage est bien sur une case comportant une clé
		if (x==2 & y==2) {
			return true;	
		}
		else {
			return false;
		}
	}
	
	public static boolean VerifArrivee(int x, int y) {
		// verifie si le personnage est bien sur la case arrivée
		if (x==3 & y==3) {
			return true;
		}
		else {
			return false;
		}
	}
}
