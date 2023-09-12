package N3Exe1;

public class News_F1 extends News {

	private String newsF1RefTeam;
	
	public News_F1 () {
		
	}

	public News_F1 (int newsID, String newsTitle, String newsF1RefTeam) {
		super(newsID, newsTitle, "", 4, 100);
		this.newsF1RefTeam = newsF1RefTeam;
	}

	public String getNewsF1RefTeam() {
		return newsF1RefTeam;
	}

	public void setNewsF1RefTeam(String newsF1RefTeam) {
		this.newsF1RefTeam = newsF1RefTeam;
	}
	
	@Override
	public String toString() {
		return "News_F1 [newsF1RefTeam=" + newsF1RefTeam + ", newsID=" + newsID + ", getNewsTitle()=" + getNewsTitle()
				+ ", getNewsBody()=" + getNewsBody() + ", getNewsPoints()=" + getNewsPoints() + ", getNewsPrice()="
				+ getNewsPrice() + "]";
	}


}
