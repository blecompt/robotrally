package main;


public class Robot {
	/* Un robot :
	 * Numero
	 * Coordonne
	 * Nbr de vie
	 * Nbr de pts de vie
	 * Direction
	 * Fonction :
	 * Déplacement
	 * Rotation
	 * 
	 */
	
	public static int nbrVie = 3;
	public static int ptsVie = 9;
	public int x = 0;
	public int y = 0;
	public int numero = 0;
	public int direction = 180;
	
	public Robot(int numero){
		this.numero = numero;
		
	}
	
	
	public static void deplacementPlayer(int numPlayer, int nbrCase){
		int coordActuelX = Plateau.player[numPlayer-1].getX();
		int coordActuelY = Plateau.player[numPlayer-1].getY();
		int coordFuturX = coordActuelX; 
		int coordFuturY = coordActuelY;
		Plateau.plateau[coordActuelX][coordActuelY].setPlayer(false);
		int dirPlayer = Plateau.player[numPlayer-1].getDirection();
		switch(dirPlayer){
		case 0 : coordFuturX = coordActuelX - nbrCase;break; 
		case 90 : coordFuturY = coordActuelY + nbrCase;break; 
		case 180 : coordFuturX = coordActuelX + nbrCase;break; 
		case 270 : coordFuturY = coordActuelY - nbrCase;break; 
		}
		Plateau.player[numPlayer-1].setX(coordFuturX);
		Plateau.player[numPlayer-1].setY(coordFuturY);
		System.out.println();
		Plateau.plateau[coordFuturX][coordFuturY].setPlayer(true);
		
	}
	
	
	
	
	
	// On définit le sens de rotation, le sens des aiguilles d'une montre
	public void rotation(int angle){
		direction = (direction + angle)%360;
	}

	public static int getNbrVie() {
		return nbrVie;
	}

	public void setNbrVie(int nbrVie) {
		this.nbrVie = nbrVie;
	}

	public static int getPtsVie() {
		return ptsVie;
	}

	public void setPtsVie(int ptsVie) {
		this.ptsVie = ptsVie;
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	
	

	
	
	

}
