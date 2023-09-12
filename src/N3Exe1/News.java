package N3Exe1;

public class News {
	
	protected int newsID;
	private String newsTitle;
	private String newsBody;
	private int newsPoints;
	private int newsPrice;
	
	
	public News () {
	
	}

	public News (int newsID, String newsTitle, String newsBody, int newsPoints, int newsPrice) {
		this.newsID = newsID;
		this.newsTitle = newsTitle;
		newsBody = "";
		this.newsPoints = newsPoints;
		this.newsPrice = newsPrice;
	}

	public int getNewsID() {
		return newsID;
	}

	public void setNewsID(int newsID) {
		this.newsID = newsID;
	}

	public String getNewsTitle() {
		return newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public String getNewsBody() {
		return newsBody;
	}

	public void setNewsBody(String newsBody) {
		this.newsBody = newsBody;
	}

	public int getNewsPoints() {
		return newsPoints;
	}

	public void setNewsPoints(int newsPoints) {
		this.newsPoints = newsPoints;
	}

	public int getNewsPrice() {
		return newsPrice;
	}

	public void setNewsPrice(int newsPrice) {
		this.newsPrice = newsPrice;
	}

	@Override
	public String toString() {
		return "News [newsID=" + newsID + ", newsTitle=" + newsTitle + ", newsBody=" + newsBody + ", newsPoints="
				+ newsPoints + ", newsPrice=" + newsPrice + "]";
	}
	

	
}
