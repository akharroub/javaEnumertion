package couleurrr;

public enum Couleur {

	ROUGE("rouje"),BLEU("bleu"),VERT("vert"),JAUN("jaun");

	private final String nom;
	
	private Couleur(String nom) {
		this.nom=nom;
		
	}

	public String getNom() {
		return nom;
	}
	
	
}
