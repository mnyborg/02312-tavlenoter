package lektion09.personer;

public class Student extends Person {
	private String studieNummer;

	public Student(String navn, String adresse, String studieNummer) {
		super(navn, adresse);
		this.studieNummer = studieNummer;
	}
	
	@Override
	public String toString() {
		return "Studienummer: " + studieNummer + " " + "Navn: " + navn + "Adresse: " + adresse;
		// return "Studienummer: " + studieNummer + " " + super.toString();
		
	}
}

