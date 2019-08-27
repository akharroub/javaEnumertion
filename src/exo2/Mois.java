package exo2;

public enum Mois {
	janvier("jan","january",31),
	fevrier("fev","february",28), 
	mars("mar"," march",31),
	avril("avr","april",30),
	mai("mai","may",31),
	juin("jui","june",30),
	juillet("jui","july",31),
	aout("aou","august",30),
	septembre("sep","september",31),
	octobre("oct","october",31),
	novembre("nov","november",30),
	decembre("dec","december",31);
	
	private final String abrv;
	private final String anglais;
	private final int jours;
	
	private Mois(String abrv, String anglais,int j) {
		this.abrv = abrv;
		this.anglais = anglais;
		this.jours=j;
	}
	
	@Override
	public String toString() {
		return this.abrv+" = "+this.name()+" = "+this.anglais+" - "+this.jours;
	}

	public static void main(String[] args) {
		for (Mois s : Mois.values()) {
			System.out.println(s);
		}
		
	}	
	
}
