package N1Exe1;

public class Wind_Instrument extends Instrument {
	
	public Wind_Instrument (String intrumentName, int instrumentPrice) {
		super(intrumentName, instrumentPrice);
	}

	@Override
	public String play() {
		return "It is playing a wind instrument";
	}

}
