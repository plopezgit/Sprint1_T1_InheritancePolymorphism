package n3Exe1;

public class News {
	
	private int newsID;
	private String newsTitle;
	private String newsBody;
	private int newsInitialPoints;
	private int newsInitialPrice;
	
	
	public News () {
	
	}
	
	public News (int newsID) {
		this.newsID = newsID;
	}

	public News (int newsID, String newsTitle, String newsBody, int newsInitialPoints, int newsInitialPrice) {
		this.newsID = newsID;
		this.newsTitle = newsTitle;
		newsBody = "";
		this.newsInitialPoints = newsInitialPoints;
		this.newsInitialPrice = newsInitialPrice;
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

	public int getNewsInitialPoints() {
		return newsInitialPoints;
	}

	public void setNewsInitialPoints(int newsInitialPoints) {
		this.newsInitialPoints = newsInitialPoints;
	}

	public int getNewsInitialPrice() {
		return newsInitialPrice;
	}

	public void setNewsInitialPrice(int newsInitialPrice) {
		this.newsInitialPrice = newsInitialPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + newsID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof News))
			return false;
		News other = (News) obj;
		if (newsID != other.newsID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "News [ID=" + newsID + ", Title=" + newsTitle + ", Body=" + newsBody + "]";
	}
	
}
