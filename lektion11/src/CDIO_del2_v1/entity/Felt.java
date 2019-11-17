package CDIO_del2_v1.entity;

public class Felt {
	private int nr;
	private String navn;
	private int vaerdi;
	private String text;
	
	public Felt(int nr, String navn, int vaerdi, String text) {
		this.nr = nr;
		this.navn = navn;
		this.vaerdi = vaerdi;
		this.text = text;
	}
	
	// tom tekst
	public Felt(int nr, String navn, int vaerdi) {
		this(nr, navn, vaerdi, "");
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getVaerdi() {
		return vaerdi;
	}

	public void setVaerdi(int vaerdi) {
		this.vaerdi = vaerdi;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
