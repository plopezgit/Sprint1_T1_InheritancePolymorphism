package N3Exe1;

import java.util.ArrayList;

public class Redactor {
	
	private String redactorName;
	protected final String redactorDNI;
	private int redactorSalary;
	protected ArrayList<News> redactorNewsListAssigned;
	
	public Redactor(String redactorName, String redactorDNI) {

		this.redactorName = redactorName;
		this.redactorDNI = redactorDNI;
		redactorSalary = 1500;
		redactorNewsListAssigned = new ArrayList<News>();
	}

	public String getRedactorName() {
		return redactorName;
	}

	public void setRedactorName(String redactorName) {
		this.redactorName = redactorName;
	}

	public int getRedactorSalary() {
		return redactorSalary;
	}

	public void setRedactorSalary(int redactorSalary) {
		this.redactorSalary = redactorSalary;
	}

	public String getRedactorDNI() {
		return redactorDNI;
	}
	
	public ArrayList<News> getRedactorNewsListAssigned() {
		return redactorNewsListAssigned;
	}

	public void setRedactorNewsListAssigned(ArrayList<News> redactorNewsListAssigned) {
		this.redactorNewsListAssigned = redactorNewsListAssigned;
	}
	
	// Class methods
	
	public ArrayList<News> assignNewsToRedactor (SportRedaction redaction, int newsIndex) {
		redactorNewsListAssigned.add(redaction.newsList.get(newsIndex));
	return redactorNewsListAssigned;
	
	}
	
	public ArrayList<News> unassignNewsToRedactor (SportRedaction redaction, int newsIndex) {
		redactorNewsListAssigned.remove(redaction.newsList.get(newsIndex));
	return redactorNewsListAssigned;
	
	}
	
	public String parseRedactorNewsListAssigned () {		
		String redactorNewsListAssigned = "";
		for (int i=0; i< this.redactorNewsListAssigned.size(); i++) {
			redactorNewsListAssigned += this.redactorNewsListAssigned.get(i) + " \n";
		}
		return redactorNewsListAssigned;
	}
	

	@Override
	public String toString() {
		return "Redactor [redactorName=" + redactorName + ", redactorDNI=" + redactorDNI + ", redactorSalary="
				+ redactorSalary + "]";
	}
}
