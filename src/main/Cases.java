package main;



public class Cases {
	
	
	
	int x ;
	int y ;
	String capacite_case ;
	
	Cases(int x, int y, String capacite_case){
		
		this.x=x ;
		this.y=y ;
		this.capacite_case=capacite_case ;
		
	}
	
	public String getcapacite (){
		return this.capacite_case;
	}

}

