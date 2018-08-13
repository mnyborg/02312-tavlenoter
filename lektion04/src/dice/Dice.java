package dice;

public class Dice {
	private final int MAX = 6;  // maximum �jne v�rdi

	private int faceValue;  // nuv�rende �jne v�rdi

	// konstrukt�r
	public Dice()
	{
		faceValue = 1;
	}


	// konstrukt�r
	public Dice(int value)
	{
		faceValue = value;
	}

	public Dice(Dice t) {
		faceValue = t.faceValue;
	}



	// kast terning og returner �jne v�rdi
	public int roll()
	{
		faceValue = (int)(Math.random() * MAX) + 1;
		return faceValue;
	}

	// s�t �jne v�rdi
	public void setFaceValue (int value)
	{
		if (value >= 1 && value <= MAX) 
			faceValue = value;
		else
			faceValue = 1;
	}

	// hent �jne v�rdi
	public int getFaceValue()
	{
		return faceValue;
	}

	// returnerer en streng repr�sentation af objektets data
	public String toString()
	{


		String result = "�jne: " + faceValue;
		return result;
	}
}
