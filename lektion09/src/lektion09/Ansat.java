package lektion09;

public class Ansat extends Person {
	private int loen;

	public Ansat(String navn, String adresse, int loen) {
		super(navn, adresse);
		this.loen = loen;
	}

	public int getLoen() {
		return loen;
	}

	public void setLoen(int loen) {
		this.loen = loen;
	}

	@Override
	public String toString() {
		return "Ansat{" +
				"loen=" + loen +
				'}';
	}
}
