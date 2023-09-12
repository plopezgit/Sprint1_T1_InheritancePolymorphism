package N1Exe1;

public class Percussion_Instrument extends Instrument {
	
	public Percussion_Instrument (String intrumentName, int instrumentPrice) {
		super(intrumentName, instrumentPrice);
	}

	@Override
	public String play() {
		return "It is playing an strings instrument";
	}

}
