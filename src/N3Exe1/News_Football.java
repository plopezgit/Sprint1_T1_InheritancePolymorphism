package N3Exe1;

public class News_Football extends News {
	
	private String newsFootballRefCompetition;
	private String newsFootballRefClub;
	private String newsFootballRefPlayer;
	
	public News_Football () {
	
	}

	public News_Football (int newsID, String newsTitle, String newsFootballRefCompetition, String newsFootballRefClub, String newsFootbalRefPlayer) {
		super(newsID, newsTitle, "", 5, 300);
		this.newsFootballRefCompetition = newsFootballRefCompetition;
		this.newsFootballRefClub = newsFootballRefClub;
		this.newsFootballRefPlayer = newsFootbalRefPlayer;
	}

	public String getNewsFootballRefCompetition() {
		return newsFootballRefCompetition;
	}

	public void setNewsFootballRefCompetition(String newsFootballRefCompetition) {
		this.newsFootballRefCompetition = newsFootballRefCompetition;
	}

	public String getNewsFooballRefClub() {
		return newsFootballRefClub;
	}

	public void setNewsFooballRefClub(String newsFootballRefClub) {
		this.newsFootballRefClub = newsFootballRefClub;
	}

	public String getNewsFootbalRefPlayer() {
		return newsFootballRefPlayer;
	}

	public void setNewsFootbalRefPlayer(String newsFootballRefPlayer) {
		this.newsFootballRefPlayer = newsFootballRefPlayer;
	}
	
	//Class methods
	
	public int newsPriceCalculation () {
		if (newsFootballRefCompetition.equals("Liga de Campeones")) {
			super.setNewsInitialPrice(super.getNewsInitialPrice() + 100);
		}
		if (newsFootballRefClub.equals("Barca") || newsFootballRefClub.equals("Madrid")) {
			super.setNewsInitialPrice(super.getNewsInitialPrice() + 100);
		}
		if (newsFootballRefPlayer.equals("Ferran Torres") || newsFootballRefPlayer.equals("Benzema")) {
			super.setNewsInitialPrice(super.getNewsInitialPrice() + 50);
		}
		
		return super.getNewsInitialPrice();
	}
	
	public int newsPointCalculation () {
		if (newsFootballRefCompetition.equals("Liga de Campeones")) {
			super.setNewsInitialPoints(super.getNewsInitialPoints() + 3);
		}
		if (newsFootballRefCompetition.equals("La Liga")) { 
			super.setNewsInitialPoints(super.getNewsInitialPoints() + 2);
		}
		if (newsFootballRefClub.equals("Barca") || newsFootballRefClub.equals("Madrid")) {
			super.setNewsInitialPoints(super.getNewsInitialPoints() + 1);
		}
		if (newsFootballRefPlayer.equals("Ferran Torres") || newsFootballRefPlayer.equals("Benzema")) {
			super.setNewsInitialPoints(super.getNewsInitialPoints() + 1);
		}
		
		return super.getNewsInitialPoints();
	}

	@Override
	public String toString() {
		return "Football news [" + super.toString() + ", Competition=" + newsFootballRefCompetition + ", Club="
				+ newsFootballRefClub + ", Player=" + newsFootballRefPlayer + "]";
	}
	
}
