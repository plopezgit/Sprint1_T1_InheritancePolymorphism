package N1Exe1;

public class String_Instrument extends Instrument {
	
	public String_Instrument (String intrumentName, int instrumentPrice) {
		super(intrumentName, instrumentPrice);
	}

	@Override
	public String play() {
		return "It is playing a percussion instrument";
	}

}
