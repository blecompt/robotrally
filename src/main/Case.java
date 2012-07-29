package main;

public class Case {
	/* Une case : 2 principes
	 * Une Action : mvt, rot, dom, mur, rien , départ, drapeau
	 * Des coordonées : longeur largeur
	 * Autre valeur :
	 * Si joueur ou non 
	 */
	
	private int action = 0;
	private boolean player = false;
	private int x = 0;
	private int y = 0;
	
	 public Case(int x, int y, int action){
		 this.x = x;
		 this.y = y;
		 this.action = action;
	 }

	public int getAction() {
		return action;
	}

	public void setAction(int action) {
		this.action = action;
	}

	public boolean isPlayer() {
		return player;
	}

	public void setPlayer(boolean player) {
		this.player = player;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	 
	
}
