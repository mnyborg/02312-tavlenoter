package lektion09;

class Person {
	String navn;
	protected String adresse;

	
	public Person(String navn, String adresse) {
		this.navn = navn;
		this.adresse = adresse;
	}
	
	

	public String getNavn() {
		return navn;
	}



	public void setNavn(String navn) {
		this.navn = navn;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	@Override
	public String toString() {
		return "Person [navn=" + navn + ", adresse=" + adresse + "]";
	}
}
