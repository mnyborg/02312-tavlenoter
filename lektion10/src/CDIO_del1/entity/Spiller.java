package CDIO_del1.entity;
/** Implementerer en Spiller<br>
 * Indeholder foruden sopillers nav, farve og saldo ogs� flg. boolske variable: <br>
 * -isDeath: angiver om spilleren er d�d<br>
 * -isVinder: angiver om spiller er vinder<br>
 * -isVinderPending: angiver om spilleren opfylder vinderkriterium<br>
 * -slaaIgen: angiver om spilleren har f�et en ekstra tur<br>
 * 
 * og flg. int<br>
 * -antal6ere: angiver hvor mange antal ens 6-ere spilleren har sl�et i tr�k
 * 
 * @author manyb
 * @version 1.0
 *
 */
public class Spiller {
	private String navn;
	private int color;
	private int saldo;
	private boolean isDeath; // spiller er d�d
	private boolean isVinder; // spiller er vinder
	private boolean isVinderPending; // venter p� to ens
	private boolean slaaIgen; // spiller f�r et ekstra slag
	private int antal6ere; // antal 2 ens seksere
	
	public Spiller() {
		saldo=0;
		isDeath = false;
		isVinder = false;
		isVinderPending = false;
		slaaIgen=false;
		antal6ere=0;
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

	public int getAntal6ere() {
		return antal6ere;
	}

	public void setAntal6ere(int antal6ere) {
		this.antal6ere = antal6ere;
	}
}
