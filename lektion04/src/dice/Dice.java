package dice;

public class Dice {
	private final int MAX = 6;  // maximum øjne værdi

	private int faceValue;  // nuværende øjne værdi

	// konstruktør
	public Dice()
	{
		faceValue = 1;
	}


	// konstruktør
	public Dice(int value)
	{
		faceValue = value;
	}

	public Dice(Dice t) {
		faceValue = t.faceValue;
	}



	// kast terning og returner øjne værdi
	public int roll()
	{
		faceValue = (int)(Math.random() * MAX) + 1;
		return faceValue;
	}

	// sæt øjne værdi
	public void setFaceValue (int value)
	{
		if (value >= 1 && value <= MAX) 
			faceValue = value;
		else
			faceValue = 1;
	}

	// hent øjne værdi
	public int getFaceValue()
	{
		return faceValue;
	}

	// returnerer en streng repræsentation af objektets data
	public String toString()
	{


		String result = "Øjne: " + faceValue;
		return result;
	}
}
