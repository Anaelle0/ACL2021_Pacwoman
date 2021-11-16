package engine;

public class Hero {
	private static int position_x=0;
	private static int position_y=0;

	/**public static void main(String[] args) {

	}**/
	
	public void move(Cmd userCmd) {
		switch (userCmd) {
		case LEFT:
			computePos(position_x-1,position_y);
			break;
		case UP:
			computePos(position_x,position_y+1);
			break;
		case RIGHT:
			computePos(position_x+1,position_y);
			break;
		case DOWN:
			computePos(position_x,position_y-1);
			break;
		case IDLE:
			break;
		}
		// j'ai modifié
	}
	
	public int[] computePos(int abscisse, int ordonnee) {
		int [] positionCalculee=new int[] {abscisse,ordonnee};
		return positionCalculee;
	}
	
	public void changePos(int abscisse, int ordonnee) {
	}
}
