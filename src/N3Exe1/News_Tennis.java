package N3Exe1;

public class News_Tennis extends News {
	
	private String newsTennisRefCompetition;
	private String newsTennisRefPlayer;

	public News_Tennis() {
	}

	public News_Tennis(int newsID, String newsTitle, String newsTennisRefCompetition, String newsTennisRefPlayer) {
		super(newsID, newsTitle, "", 4, 150);
		this.newsTennisRefCompetition = newsTennisRefCompetition;
		this.newsTennisRefPlayer = newsTennisRefPlayer;
	}

	public String getNewsTennisRefCompetition() {
		return newsTennisRefCompetition;
	}

	public void setNewsTennisRefCompetition(String newsTennisRefCompetition) {
		this.newsTennisRefCompetition = newsTennisRefCompetition;
	}

	public String getNewsTennisRefPlayer() {
		return newsTennisRefPlayer;
	}

	public void setNewsTennisRefPlayer(String newsTennisRefPlayer) {
		this.newsTennisRefPlayer = newsTennisRefPlayer;
	}
	
	//Class methods
	
	public int newsPriceCalculation () {
		if (newsTennisRefCompetition.equals("Wimbledon")) {
			super.setNewsInitialPrice(super.getNewsInitialPrice() + 150);
		}
		if (newsTennisRefPlayer.equals("Federer") || newsTennisRefPlayer.equals("Nadal") || newsTennisRefPlayer.equals("Djocovic")) {
			super.setNewsInitialPrice(super.getNewsInitialPrice() + 100);
		}
		
		return super.getNewsInitialPrice();
	}
	
	public int newsPointCalculation () {
		if (newsTennisRefCompetition.equals("Wimbledon")) {
			super.setNewsInitialPrice(super.getNewsInitialPrice() + 3);
		}
		if (newsTennisRefPlayer.equals("Federer") || newsTennisRefPlayer.equals("Nadal") || newsTennisRefPlayer.equals("Djocovic")) {
			super.setNewsInitialPrice(super.getNewsInitialPrice() + 3);
		}
		
		return super.getNewsInitialPoints();
	}

	@Override
	public String toString() {
		return "Tennis news [" + super.toString() + ", Competition=" + newsTennisRefCompetition + ", Player="
				+ newsTennisRefPlayer + "]";
	}
	

}
