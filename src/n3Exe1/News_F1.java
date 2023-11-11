package n3Exe1;

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
	
	//Class methods
	
	public int newsPriceCalculation () {
		if (newsF1RefTeam.equals("Honda") || newsF1RefTeam.equals("Yamaha")) {
			super.setNewsInitialPrice(super.getNewsInitialPrice() + 50);
		}
		
		return super.getNewsInitialPrice();
	}
	
	public int newsPointCalculation () {
		if (newsF1RefTeam.equals("Honda") || newsF1RefTeam.equals("Yamaha")) {
			super.setNewsInitialPoints(super.getNewsInitialPoints() + 3);
		}
		
		return super.getNewsInitialPoints();
	}
	
	@Override
	public String toString() {
		return "F1 news [" + super.toString() + ", Team=" + newsF1RefTeam + "]";
	}


}
