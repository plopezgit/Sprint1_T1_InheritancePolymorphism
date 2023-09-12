package N3Exe1;

public class News_Motorcycle extends News {
	
	private String newsMotorCycleRefTeam;

	public News_Motorcycle () {

	}

	public News_Motorcycle (int newsID, String newsTitle, String newsMotorCycleRefTeam) {
		super(newsID, newsTitle, "", 3, 100);
		this.newsMotorCycleRefTeam = newsMotorCycleRefTeam;
	}

	public String getNewsMotorCycleRefTeam() {
		return newsMotorCycleRefTeam;
	}

	public void setNewsMotorCycleRefTeam(String newsMotorCycleRefTeam) {
		this.newsMotorCycleRefTeam = newsMotorCycleRefTeam;
	}
	
	//Override methods
	
	@Override
	public String toString() {
		return "News_Motorcycle [newsMotorCycleRefTeam=" + newsMotorCycleRefTeam + "]";
	}
	
	

}
