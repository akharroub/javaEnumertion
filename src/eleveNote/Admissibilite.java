package eleveNote;

public enum Admissibilite {

	N ("non admis"), 
	P ("passable"), 
	AB ( "Assez bien"), 
	B ("Bien"), 
	TB ("Tr�s bien");
	
	private String nom;
	

	private Admissibilite(String a) {
		this.nom= a;
		
	}


}
