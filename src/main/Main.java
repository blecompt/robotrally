package main;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Plateau jeu = new Plateau(5,6,1);
		jeu.afficherPlateau();
		jeu.deplacementPlayer(1, 1);
		jeu.afficherPlateau();
		jeu.player[0].rotation(270);
		jeu.deplacementPlayer(1, 3);
		jeu.afficherPlateau();
		jeu.player[0].rotation(90);
		jeu.deplacementPlayer(1, 2);
		jeu.afficherPlateau();
		

	}

}
