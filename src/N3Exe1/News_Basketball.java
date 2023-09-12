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
	
	//Override methods
	
	@Override
	public String toString() {
		return "News_Basketball [newsBasketballRefCompetition=" + newsBasketballRefCompetition
				+ ", newsBasketballRefClub=" + newsBasketballRefClub + "]";
	}
	
}
