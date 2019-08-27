package eleveNote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner cn = new Scanner(System.in);
		
		List<Eleve> listEleve = new ArrayList<>();
		
		
		
		for(int i = 0; i<3; i++) {
			System.out.println("ajouter un Eleve : ");
			String nomEleve = cn.nextLine();
			Eleve n = new Eleve(nomEleve);
			listEleve.add(n);
			
			for(int j = 0; j<3; j++) {
				System.out.print("    ajouter une note : ");
				double note = cn.nextDouble();
				cn.nextLine();
				
				n.ajouterNote(note);
			}
			System.out.println("***************************************************");
		}
		System.out.println("***************************************************");
		System.out.println("***************************************************");
		System.out.println("***************************************************");
		
		for (Eleve eleve : listEleve) {
			double my = eleve.calculMy();
			eleve.setAdmiss(my);
			System.out.println(eleve);
		}
		
	}

}
