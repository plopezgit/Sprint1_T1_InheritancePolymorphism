package N3Exe1;

import java.util.ArrayList;

public class Redactor {
	
	private final String redactorDNI;
	private String redactorName;
	private static int redactorSalary = 1500;
	private ArrayList<News> newsAssignedList;
	
	public Redactor(String redactorDNI, String redactorName) {
		this.redactorDNI = redactorDNI;
		this.redactorName = redactorName;
		newsAssignedList = new ArrayList<News>();
	}

	public Redactor(String redactorDNI) {
		this.redactorDNI = redactorDNI;
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

	public String getRedactorDNI() {
		return redactorDNI;
	}
	
	public ArrayList<News> getRedactorNewsListAssigned() {
		return newsAssignedList;
	}

	public void setRedactorNewsListAssigned(ArrayList<News> redactorNewsListAssigned) {
		this.newsAssignedList = redactorNewsListAssigned;
	}
	
	// Class methods
	
	public ArrayList<News> assignNewsToRedactor (SportRedaction redaction, int newsIndex) {
		newsAssignedList.add(redaction.getNewsList().get(newsIndex));
	return newsAssignedList;
	
	}
	
	public ArrayList<News> unassignNewsToRedactor (SportRedaction redaction, int newsIndex) {
		newsAssignedList.remove(redaction.getNewsList().get(newsIndex));
	return newsAssignedList;
	
	}
	
	public String parseRedactorNewsListAssigned () {		
		String redactorNewsListAssigned = "";
		for (int i=0; i< this.newsAssignedList.size(); i++) {
			redactorNewsListAssigned += this.newsAssignedList.get(i) + " \n";
		}
		return redactorNewsListAssigned;
	}
	
	public static int incrementSalary (int salaryIncrement) {
		int salaryIncremented = redactorSalary + salaryIncrement;
		redactorSalary = salaryIncremented;
		
		return redactorSalary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Redactor other = (Redactor) obj;
		if (redactorDNI == null) {
			if (other.redactorDNI != null)
				return false;
		} else if (!redactorDNI.equals(other.redactorDNI))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Redactor [Name=" + redactorName + ", DNI=" + redactorDNI + ", Salary="
				+ redactorSalary + "]";
	}
}
