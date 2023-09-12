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

	@Override
	public String toString() {
		return "News_Tennis [newsTennisRefCompetition=" + newsTennisRefCompetition + ", newsTennisRefPlayer="
				+ newsTennisRefPlayer + ", newsID=" + newsID + ", getNewsTitle()=" + getNewsTitle() + ", getNewsBody()="
				+ getNewsBody() + ", getNewsPoints()=" + getNewsPoints() + ", getNewsPrice()=" + getNewsPrice() + "]";
	}
	

}
