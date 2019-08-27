package eleveNote;

import java.util.ArrayList;
import java.util.List;

public class Eleve {
	
	private final String nom;
	private Admissibilite admiss;
	private List<Double> notes;

	public Eleve(String nom) {
		this.nom = nom;
		this.notes = new ArrayList<>();
	}

	public void setAdmiss(double my) {
		Admissibilite adm = null;
		if(my<10) {
			adm = Admissibilite.N;
		}else if(my>= 10 && my<12) {
			adm = Admissibilite.P;
		}else if (my>= 12 && my<14) {
			adm = Admissibilite.AB;
		}else if (my>= 14 && my<16) {
			adm = Admissibilite.B;
		}else {
			adm = Admissibilite.TB;
		}
		this.admiss = adm;
		
	}

	public String getNom() {
		return nom;
	}

	public Admissibilite getAdmiss() {
		return admiss;
	}

	@Override
	public String toString() {
		return "nom Eleve : " + nom + ", admissibilité : " + admiss +" .";
	}

	public void ajouterNote(double n) {
		this.notes.add(n);
	}
	
	public double calculMy() {
		double s = 0;
		for (Double note : notes) {
			s+=note;
		}
		return s/notes.size();
	}
	
}
