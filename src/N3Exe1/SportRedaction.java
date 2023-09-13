package N3Exe1;

import java.util.ArrayList;

public class SportRedaction {
	/*
	 * Feedback.2. Protected?
	 */
	protected ArrayList<News> newsList;
	/*
	 * Feedback.3. Al tener una lista de redacciones en la clase Redactor 
	 * y una lista de redactores en la clase Redacciones 
	 * esto podría ocasionar redundancia de datos.
	 */
	protected ArrayList<Redactor> redactorList;
	
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
	
	/*
	 * Feedback.1. Using Java API to get the index of an object in a list.
	 * Ref: https://refactorizando.com/encontrar-elemento-lista-java/
	 */
	
	public int existNews (int newsID) {
		int newsIndex = -1;
		int i = 0;

		while (newsIndex==-1 && newsList.size() != i) {
			if (newsList.get(i).newsID == (newsID)) {
				newsIndex = i;
			}else {
				newsIndex = -1;
				i++;		
			}
		}
		return newsIndex;
	}
	
	public int existRedactor (String redactorDNI) {
		int redactorIndex = -1;
		int i = 0;

		while (redactorIndex==-1 && redactorList.size() != i) {
			if (redactorList.get(i).redactorDNI.equals(redactorDNI)) {
				redactorIndex = i;
			}else {
				redactorIndex = -1;
				i++;		
			}
		}
		return redactorIndex;
	}
	
	//Override methods
	
	@Override
	public String toString() {
		return "SportRedaction [News=" + newsList + ", Redactors=" + redactorList + "]";
	}
	
}
