package engine;

public class Hero {
	private static int abscisse;
	private static int ordonnee;
	// private static int[] position = new int[] {abscisse,ordonnee}; // inutile pour l'instant

	public static void main(String[] args) {

	}

	public static void move(Cmd commande) {
		switch (commande) {
		case LEFT:
			computePos(abscisse-1,ordonnee);
			break;
		case UP:
			computePos(abscisse,ordonnee+1);
			break;
		case RIGHT:
			computePos(abscisse+1,ordonnee);
			break;
		case DOWN:
			computePos(abscisse,ordonnee-1);
			break;
		}
	}
	
	public static Object computePos(int x,int y) {
		return new int[] {x,y};
	}
	
	public static void changePos(int[] position) {
		
	}
}
