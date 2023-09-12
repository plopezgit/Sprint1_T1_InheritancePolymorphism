package N3Exe1;

public class News_Football extends News {
	
	private String newsFootballRefCompetition;
	private String newsFootballRefClub;
	private String newsFootbalRefPlayer;
	
	public News_Football () {
	
	}

	public News_Football (int newsID, String newsTitle, String newsFootballRefCompetition, String newsFootballRefClub, String newsFootbalRefPlayer) {
		super(newsID, newsTitle, "", 5, 300);
		this.newsFootballRefCompetition = newsFootballRefCompetition;
		this.newsFootballRefClub = newsFootballRefClub;
		this.newsFootbalRefPlayer = newsFootbalRefPlayer;
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
		return newsFootbalRefPlayer;
	}

	public void setNewsFootbalRefPlayer(String newsFootbalRefPlayer) {
		this.newsFootbalRefPlayer = newsFootbalRefPlayer;
	}

	@Override
	public String toString() {
		return "News_Football [newsFootballRefCompetition=" + newsFootballRefCompetition + ", newsFootballRefClub="
				+ newsFootballRefClub + ", newsFootbalRefPlayer=" + newsFootbalRefPlayer + ", newsID=" + newsID
				+ ", getNewsTitle()=" + getNewsTitle() + ", getNewsBody()=" + getNewsBody() + ", getNewsPoints()="
				+ getNewsPoints() + ", getNewsPrice()=" + getNewsPrice() + "]";
	}
	
}
