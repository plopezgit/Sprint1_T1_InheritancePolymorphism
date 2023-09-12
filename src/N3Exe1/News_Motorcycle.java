package N3Exe1;

public class News_Motorcycle extends News {
	
	private String newsMotorCycleRefTeam;

	public News_Motorcycle () {

	}

	public News_Motorcycle (int newsID, String newsTitle, String newsMotorCycleRefTeam) {
		super(newsID, newsTitle, "", 3, 100);
		this.newsMotorCycleRefTeam = newsMotorCycleRefTeam;
	}

	public String getNewsMotorCycleRefTeam() {
		return newsMotorCycleRefTeam;
	}

	public void setNewsMotorCycleRefTeam(String newsMotorCycleRefTeam) {
		this.newsMotorCycleRefTeam = newsMotorCycleRefTeam;
	}
	
	//Class methods
	
	public int newsPriceCalculation () {
		if (newsMotorCycleRefTeam.equals("Ferrari") || newsMotorCycleRefTeam.equals("Mercedes")) {
			super.setNewsInitialPrice(super.getNewsInitialPrice() + 50);
		}
		
		return super.getNewsInitialPrice();
	}
	
	public int newsPointCalculation () {
		if (newsMotorCycleRefTeam.equals("Ferrari") || newsMotorCycleRefTeam.equals("Mercedes")) {
			super.setNewsInitialPoints(super.getNewsInitialPoints() + 2);
		}
		
		return super.getNewsInitialPoints();
	}

	@Override
	public String toString() {
		return "Motorcycle news [" + super.toString() + ", Team=" + newsMotorCycleRefTeam + "]";
	}

}
