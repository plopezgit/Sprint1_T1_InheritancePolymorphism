package n3Exe1;

import java.util.ArrayList;

public class SportRedaction {

	private ArrayList<News> newsList;

	private ArrayList<Redactor> redactorList;
	
	public SportRedaction () {
		newsList = new ArrayList<News>();
		redactorList = new ArrayList<Redactor>();
	}
	
	//Metodos de clase
	
	public ArrayList<News> getNewsList() {
		return newsList;
	}

	public ArrayList<Redactor> getRedactorList() {
		return redactorList;
	}

	public ArrayList<Redactor> createRedactor (String redactorDNI, String redactorName) {
		redactorList.add(new Redactor (redactorDNI, redactorName));	
		return redactorList;
	}
	
	public ArrayList<News> createNewsFootball (int newsID, String newsTitle,  String newsFootballRefCompetition, String newsFooballRefClub, String newsFootbalRefPlayer) {
		newsList.add(new News_Football (newsID, newsTitle, newsFootballRefCompetition, newsFooballRefClub, newsFootbalRefPlayer));	
		return newsList;
	}
	
	public ArrayList<News> createNewsBasketball (int newsID, String newsTitle,  String newsBasketballRefCompetition, String newsBasketballRefClub) {
		newsList.add(new News_Basketball (newsID, newsTitle, newsBasketballRefCompetition, newsBasketballRefClub));	
		return newsList;
	}
	
	public ArrayList<News> createNewsTennis (int newsID, String newsTitle, String newsTennisRefCompetition, String newsTennisRefPlayer) {
		newsList.add(new News_Tennis (newsID, newsTitle, newsTennisRefCompetition, newsTennisRefPlayer));	
		return newsList;
	}
	
	public ArrayList<News> createNewsF1 (int newsID, String newsTitle, String newsF1RefTeam) {
		newsList.add(new News_F1 (newsID, newsTitle, newsF1RefTeam));	
		return newsList;
	}
	
	public ArrayList<News> createNewsMotorcycle (int newsID, String newsTitle, String newsMotorCycleRefTeam) {
		newsList.add(new News_Motorcycle (newsID,newsTitle, newsMotorCycleRefTeam));	
		return newsList;
	}

	public String parseNewsList () {		
		String briefcaseNews = "";
		for (int i=0; i< newsList.size(); i++) {
			briefcaseNews += newsList.get(i) + " \n";
		}
		return briefcaseNews;
	}
	
	public ArrayList<News> deleteNews(int newsIndex) {
		newsList.remove(newsIndex);
		return newsList;
	}
	
	public ArrayList<Redactor> deleteRedactor (int redactorIndex) {
		redactorList.remove(redactorIndex);
		return redactorList;
	}
	
	public int existNews (int newsID) {
		News news = new News(newsID);
		int newsIndex = newsList.indexOf(news);
		
		return newsIndex;
	}
	
	public int existRedactor (String redactorDNI) {
		Redactor redactor = new Redactor(redactorDNI);
		int redactorIndex = redactorList.indexOf(redactor);
		
		return redactorIndex;
	}
	
	//Override methods
	
	@Override
	public String toString() {
		return "SportRedaction [News=" + newsList + ", Redactors=" + redactorList + "]";
	}
	
}
