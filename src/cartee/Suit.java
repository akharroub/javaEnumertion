package cartee;

public final class Suit  {
	
	public final static Suit SPADES =new Suit("SPADES");
	public final static Suit HEARDS =new Suit("HEARDS");
	public final static Suit DIAMONDS =new Suit("DIAMONDS");
	public final static Suit CLUBS =new Suit("CLUBS");
	
	private final String name;

	public Suit(String name) {
		super();
		this.name = name;
	}



	

	public String getName() {
		return name;
	}

	
}
