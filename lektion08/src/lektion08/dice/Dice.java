package lektion08.dice;

public class Dice {
    private final int MAX = 6;  // maximum øjne værdi
    private int faceValue;

	public Dice(int faceValue) {
		this.faceValue = faceValue;
	}

	public int roll()
	{
		faceValue = (int)(Math.random() * MAX) + 1;
		return faceValue;
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
