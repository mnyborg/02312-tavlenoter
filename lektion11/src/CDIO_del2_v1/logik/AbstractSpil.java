package CDIO_del2_v1.logik;


import CDIO_del2_v1.entity.Spiller;

public abstract class AbstractSpil {
	final static int MAX_POINTS = 40; 
	
	public abstract void spilLogik(int[] terninger, Spiller p);

}
