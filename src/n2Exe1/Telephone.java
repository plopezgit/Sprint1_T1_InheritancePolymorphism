package n2Exe1;

public class Telephone {
	
	public String teleponeBrand;
	public String telephoneModel;
	
	public Telephone() {
		
	}

	public Telephone(String teleponeBrand, String telephoneModel) {
		this.teleponeBrand = teleponeBrand;
		this.telephoneModel = telephoneModel;
	}

	public String getTeleponeBrand() {
		return teleponeBrand;
	}

	public void setTeleponeBrand(String teleponeBrand) {
		this.teleponeBrand = teleponeBrand;
	}

	public String getTelephoneModel() {
		return telephoneModel;
	}

	public void setTelephoneModel(String telephoneModel) {
		this.telephoneModel = telephoneModel;
	}
		
	//Class methods
	
	public String call (String telephoneNumber) {
		return "On going call to " + telephoneNumber;
	}

	@Override
	public String toString() {
		return "Telephone [teleponeBrand=" + teleponeBrand + ", telephoneModel=" + telephoneModel + "]";
	}
}
