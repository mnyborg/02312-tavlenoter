package CDIO_del1.entity;
/**
 * Implementerer et specialiseret raflebæger, som er nedavet fra Raflebaeger
 * rolldice() metoden er overskrevet, sådan at den genererer ikke tilfældige terningeslag 
 * der defineres i et array
 * @author manyb
 * @version 1.0
 *
 */

public class MatadorRafleBaegerAutoTest extends MatadorRafleBaeger{
	private int index;
	public MatadorRafleBaegerAutoTest(int index) {
		super();
		this.index = index;
	}
	public void rollDice()	{
		
		
		int[][] data = {{5,5},{5,6},{6,6},{1,2},{3,1},{1,2},{1,2},{2,1},{3,3}};
		terning1= data[index][0];
		terning2= data[index][1];
		index=++index % data.length;

//		int[] data = {5,5,
//					  6,6,
//					  6,6,
//					  1,2,
//					  3,1,
//					  1,2,
//					  1,2,
//					  2,1,
//					  3,3};
//		terning1 = data[index++ % data.length];
//		terning2 = data[index++ % data.length];
	}
}
