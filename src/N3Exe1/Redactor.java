package N3Exe1;

import java.util.ArrayList;

public class Redactor {
	/*
	 * Feedback.2. Protected?
	 */
	protected final String redactorDNI;
	private String redactorName;
	private static int redactorSalary = 1500;
	/*
	 * Feedback.3. Al tener una lista de redacciones en la clase Redactor 
	 * y una lista de redactores en la clase Redacciones 
	 * esto podría ocasionar redundancia de datos.
	 */
	protected ArrayList<News> redactorNewsListAssigned;
	
	public Redactor(String redactorDNI, String redactorName) {
		this.redactorDNI = redactorDNI;
		this.redactorName = redactorName;
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
	
	public static int incrementSalary (int salaryIncrement) {
		int salaryIncremented = redactorSalary + salaryIncrement;
		redactorSalary = salaryIncremented;
		
		return redactorSalary;
	}
	

	@Override
	public String toString() {
		return "Redactor [Name=" + redactorName + ", DNI=" + redactorDNI + ", Salary="
				+ redactorSalary + "]";
	}
}
