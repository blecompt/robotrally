package main;


public class Plateau {

	public int longeur = 0;
	public int largeur = 0;
	public static Case plateau [][] = null;
	public static Robot player[] = null;
	
	

	public Plateau(int longeur, int largeur, int nbrplayer){
		this.longeur = longeur;
		this.largeur = largeur;
		plateau = new Case[longeur][largeur];
		player = new Robot[nbrplayer];
		populatePlateau();

	}
	public void populatePlateau(){
		int x=0;
		for(int i=0; i<plateau.length;i++){
			for (int j=0; j<plateau[i].length; j++){
				plateau[i][j] = new Case(i, j, x);
				x=(int) (Math.random()*10);
			}
		}
		for(int i=0; i<player.length;i++){
			player[i] = new Robot(i+1);
		}
		if(player.length>0){
			plateau[0][0].setPlayer(true);
		}
	}
	
	
	public void afficherPlateau(){
		for(int i=0; i<plateau.length;i++){
			for (int j=0; j<plateau[i].length; j++){
				//System.out.print("[X"+plateau[i][j].getX()+",Y"+plateau[i][j].getY()+"]");
				if(plateau[i][j].isPlayer()){
					System.out.print("[P]");
				}/*else {
					System.out.print("[ ]");*/
				if(plateau[i][j].getAction()<4){
					System.out.print("[ ]");
				}
				if(plateau[i][j].getAction()<6 && plateau[i][j].getAction()>4){
					System.out.print("[X]");
			}
			System.out.println();
		}
			}
		}}
	