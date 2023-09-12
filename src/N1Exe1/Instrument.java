package N1Exe1;

public abstract class Instrument {
	
	private String intrumentName;
	private int instrumentPrice;
	static String instrumentLuthier;
	
	
	public Instrument() {
	}
	
	public Instrument(String intrumentName, int instrumentPrice) {
		this.intrumentName = intrumentName;
		this.instrumentPrice = instrumentPrice;
	}
	
	{
		System.out.println("Initialized Instrument");
	}
	
	static {
		System.out.println("Loaded Instrument");
	}
	
	public String getIntrumentName() {
		return intrumentName;
	}

	public void setIntrumentName(String intrumentName) {
		this.intrumentName = intrumentName;
	}

	public int getInstrumentPrice() {
		return instrumentPrice;
	}

	public void setInstrumentPrice(int instrumentPrice) {
		this.instrumentPrice = instrumentPrice;
	}
	
	//Abstract methods
	
	public abstract String play();

}

