package cartee;

public final class Carte {
	
	private final Suit suit;
	private final Rank rank;
	
	public Carte(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Carte [suit=" + suit + ", rank=" + rank + "]";
	}
	
	
	

}
