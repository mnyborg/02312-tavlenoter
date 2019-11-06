package CDIO_del1.entity;
import java.util.Random;

/**
 * Implementerer et raflebæger med to terninger
 * @author manyb
 * @version 1.0
 */

public class MatadorRafleBaeger {
	protected int terning1, terning2;
	Random rand;


	public MatadorRafleBaeger()	{
		rand = new Random();
	}

	/**
	 * rollDice metoden kaster med begge terninger og opdaterer objektets instansvariablene
	 */
	public void rollDice()	{

		terning1 = rand.nextInt(6) + 1;
		terning2 = rand.nextInt(6) + 1;
	}

	
	/**
	 * Returnerer terningers værdi i et array
	 * @return terningers værdi
	 */
	public int[] getTerninger()	{
		int[] result = {terning1, terning2};
		return result;
	}

	
	/** 
	 * @return sum af terningers øjne
	 */
	public int getSum()	{
		int sum = terning1 + terning2;
		return sum;
	}

	
	/**
	 * @return hvis terningerns øjne er ens returneres true ellers returneres false
	 */
	//
	public boolean getEns()	{
		return (terning1 == terning2);	
	}

	
	/**
	 * @return terning 1
	 */
	public int terning1() {
		return terning1;
	}

	
	/**
	 * @return terning 2
	 */
	public int terning2() {
		return terning2;
	}

	public String toString() {
		return "Terning 1: " + terning1 + ", Terning 2: " + terning2;

	}
}
