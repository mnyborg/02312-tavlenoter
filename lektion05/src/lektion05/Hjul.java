package lektion05;

public class Hjul {

	private int diameter;   // tommer 
	private float daektryk; // bar

	public Hjul(int diameter, float daektryk) {
		this.diameter = diameter;
		this.daektryk = daektryk;
	}

	public int getDiameter() {
		return diameter;
	}

	public float getDaektryk() {
		return daektryk;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public void setDaektryk(float daektryk) {
		this.daektryk = daektryk;
	}

	@Override
	public String toString() {
		return "Hjul{" +
				"diameter=" + diameter +
				", daektryk=" + daektryk +
				'}';
	}
}
