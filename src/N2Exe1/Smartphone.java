package N2Exe1;

public class Smartphone extends Telephone implements Camara, Clock {
	
	public Smartphone () {
		
	}
	
	public Smartphone (String teleponeBrand, String telephoneModel) {
		super(teleponeBrand, telephoneModel);
	}

	@Override
	public String alarm() {
		return "An alamr is ringing";
	}

	@Override
	public String takeAPhoto() {
		return "A photo is being taking";
	}

}
