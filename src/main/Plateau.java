package main;

import com.sun.org.apache.bcel.internal.generic.CPInstruction;




public class Plateau {

	public int longeur = 0;
	public int largeur = 0;
	public Case plateau [][] = null;
	public Robot player[] = null;

	public Plateau(int longeur, int largeur, int nbrplayer){
		this.longeur = longeur;
		this.largeur = largeur;
		plateau = new Case[longeur][largeur];
		player = new Robot[nbrplayer];
		populatePlateau();

	}
	public void populatePlateau(){
		for(int i=0; i<plateau.length;i++){
			for (int j=0; j<plateau[i].length; j++){
				plateau[i][j] = new Case(i, j, 0);
			}
		}
		for(int i=0; i<player.length;i++){
			player[i] = new Robot(i+1);
		}
		if(player.length>0){
			plateau[0][0].setPlayer(true);
		}
	}
	public void deplacementPlayer(int numPlayer, int nbrCase){
		int coordActuelX = player[numPlayer-1].getX();
		int coordActuelY = player[numPlayer-1].getY();
		int coordFuturX = coordActuelX; 
		int coordFuturY = coordActuelY;
		plateau[coordActuelX][coordActuelY].setPlayer(false);
		int dirPlayer = player[numPlayer-1].getDirection();
		switch(dirPlayer){
		case 0 : coordFuturX = coordActuelX - nbrCase;break; 
		case 90 : coordFuturY = coordActuelY + nbrCase;break; 
		case 180 : coordFuturX = coordActuelX + nbrCase;break; 
		case 270 : coordFuturY = coordActuelY - nbrCase;break; 
		}
		player[numPlayer-1].setX(coordFuturX);
		player[numPlayer-1].setY(coordFuturY);
		System.out.println();
		plateau[coordFuturX][coordFuturY].setPlayer(true);
		
	}
	
	public void afficherPlateau(){
		for(int i=0; i<plateau.length;i++){
			for (int j=0; j<plateau[i].length; j++){
				//System.out.print("[X"+plateau[i][j].getX()+",Y"+plateau[i][j].getY()+"]");
				if(plateau[i][j].isPlayer()){
					System.out.print("[P]");
				}else {
					System.out.print("[ ]");
				}
			}
			System.out.println();
		}
	}
	




}
