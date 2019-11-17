package CDIO_del2_v1.entity;


public class MatadorRafleBaegerAutoTest extends MatadorRafleBaeger{
	int index;
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
