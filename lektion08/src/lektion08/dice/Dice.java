package lektion08.dice;

public class Dice {
	private int faceValue;

	public Dice(int faceValue) {
		super();
		this.faceValue = faceValue;
	}

	public int getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}

	@Override
	public String toString() {
		return "Dice [faceValue=" + faceValue + "]";
	}

}
