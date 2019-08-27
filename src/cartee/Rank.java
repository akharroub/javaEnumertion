package cartee;

public final class Rank {
	
	public final static Rank UN = new Rank("1"); 
	public final static Rank DUEX= new Rank("2"); 
	public final static Rank TROIS = new Rank("3"); 
	public final static Rank QUATRE = new Rank("4"); 
	public final static Rank CANQ = new Rank("5"); 
	public final static Rank SIX = new Rank("6"); 
	public final static Rank SEPT = new Rank("7"); 
	public final static Rank HUIT = new Rank("8"); 
	public final static Rank NEUF = new Rank("9"); 
	public final static Rank DIX = new Rank("10"); 
	public final static Rank VALE = new Rank("11"); 
	public final static Rank DAME = new Rank("12"); 
	public final static Rank ROI = new Rank("13"); 
	
	private final String num;

	private Rank(String num) {
		
		this.num = num;
	}

	public String getNum() {
		return num;
	}

	
	
	

}
