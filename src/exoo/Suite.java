package exoo;

import cartee.Suit;

public enum Suite {
	ut, re, mi, fa, sol, la, si; 
	
	
	public static void main(String[] args) {
		Suite[] tab = Suite.values();
		System.out.println("Nombre d element "+tab.length);
		for (int i = 0; i < tab.length; i++) {
			if (i%2 !=0) {
				System.out.println("Les element impair "+tab[i]);
			}
		}
		System.out.println("la dernier valeur du type = " +tab[tab.length-1]);
	}
}
