package eleveNote;

public enum Admissibilite {

	N ("non admis"), 
	P ("passable"), 
	AB ( "Assez bien"), 
	B ("Bien"), 
	TB ("Très bien");
	
	private String nom;
	

	private Admissibilite(String a) {
		this.nom= a;
		
	}


}
