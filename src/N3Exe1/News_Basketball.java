package N3Exe1;

public class News_Basketball extends News {
	
	private String newsBasketballRefCompetition;
	private String newsBasketballRefClub;

	public News_Basketball () {

	}

	public News_Basketball (int newsID, String newsTitle, String newsBasketballRefCompetition, String newsBasketballRefClub) {
		super(newsID, newsTitle, "", 4, 250);
		this.newsBasketballRefCompetition = newsBasketballRefCompetition;
		this.newsBasketballRefClub = newsBasketballRefClub;
	}

	public String getNewsBasketballRefCompetition() {
		return newsBasketballRefCompetition;
	}

	public void setNewsBasketballRefCompetition(String newsBasketballRefCompetition) {
		this.newsBasketballRefCompetition = newsBasketballRefCompetition;
	}

	public String getNewsBasketballRefClub() {
		return newsBasketballRefClub;
	}

	public void setNewsBasketballRefClub(String newsBasketballRefClub) {
		this.newsBasketballRefClub = newsBasketballRefClub;
	}
	
	//Class methods
	
	public int newsPriceCalculation () {
		if (newsBasketballRefCompetition.equals("Euroliga")) {
			super.setNewsInitialPrice(super.getNewsInitialPrice() + 250);
		}
		if (newsBasketballRefClub.equals("Barca") || newsBasketballRefClub.equals("Madrid")) {
			super.setNewsInitialPrice(super.getNewsInitialPrice() + 75);
		} 
		
		return super.getNewsInitialPrice();
	}
	
	public int newsPointCalculation () {
		if (newsBasketballRefCompetition.equals("Euroliga")) {
			super.setNewsInitialPoints(super.getNewsInitialPoints() + 3);
		}
		if (newsBasketballRefCompetition.equals("ABC")) { 
			super.setNewsInitialPoints(super.getNewsInitialPoints() + 2);
		}
		if (newsBasketballRefClub.equals("Barca") || newsBasketballRefClub.equals("Madrid")) {
			super.setNewsInitialPoints(super.getNewsInitialPoints() + 1);
		} 
		
		return super.getNewsInitialPoints();
	}
	
	//Override methods
	
	@Override
	public String toString() {
		return "Basketball news [" + super.toString() + ", Competition=" + newsBasketballRefCompetition
				+ ", Club=" + newsBasketballRefClub + "]";
	}
	
}
