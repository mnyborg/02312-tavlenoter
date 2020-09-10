package lektion05;

public class Student {

	private String sNr;
	private String navn;

	// klasse variabel
	private static String universitet = "DTU";	

	public Student(String sNr, String navn) {
		this.sNr = sNr;
		this.navn = navn;
	}

	
	public static String getUniversitet() {
		return universitet;
	}

	public static void setUniversitet(String universitet) {
		Student.universitet = universitet;
	}


	public String getSnr() {
		return this.sNr;
	}
	
	public String toString() {
		return "Student [sNr=" + sNr + ", navn=" + navn + ", universitet=" + universitet + "]";
	}


}
