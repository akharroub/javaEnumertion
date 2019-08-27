package couleurrr;

public class Main {

	public static void main(String[] args) {

		Couleur c1 = Couleur.BLEU;
		Couleur c2 = Couleur.JAUN;
		System.out.println("**********************************");
		System.out.println(c1.getNom());
		System.out.println(c2.getNom());
		System.out.println(c1.equals(c2));
		if(c1 != c2) {
			Couleur c3 ;
			c3 = c1;
			c1 =c2;
			c2 =c3;
		}
		System.out.println("**********************************");
		System.out.println(c1.getNom());
		System.out.println(c2.getNom());
	}

}
