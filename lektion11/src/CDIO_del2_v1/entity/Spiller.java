package CDIO_del2_v1.entity;
public class Spiller {
	private String navn;
	private int color;
	private int feltIndex;
	private int saldo;
	private boolean isDeath; // spiller er død
	private boolean isVinder; // spiller er vinder
	private boolean isVinderPending; // venter på to ens
	private boolean slaaIgen; // spiller får et ekstra slag

	
	public Spiller() {
		saldo=0;
		isDeath = false;
		isVinder = false;
		isVinderPending = false;
		slaaIgen=false;
		feltIndex = 0;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public boolean isDeath() {
		return isDeath;
	}

	public void setDeath(boolean isDeath) {
		this.isDeath = isDeath;
	}

	public boolean isVinder() {
		return isVinder;
	}

	public void setVinder(boolean vinder) {
		this.isVinder = vinder;
	}

	public boolean isVinderPending() {
		return isVinderPending;
	}

	public void setVinderPending(boolean isVinderPending) {
		this.isVinderPending = isVinderPending;
	}
	
	
	public boolean isSlaaIgen() {
		return slaaIgen;
	}

	public void setSlaaIgen(boolean slaaIgen) {
		this.slaaIgen = slaaIgen;
	}

	public int getFeltIndex() {
		return feltIndex;
	}

	public void setFeltIndex(int feltIndex) {
		this.feltIndex = feltIndex;
	}
}
