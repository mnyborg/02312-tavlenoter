package CDIO_del2_v1.boundary;

import CDIO_del2_v1.entity.Spiller;


public abstract class AbstractUI {
	public abstract void spilstarter();
	
	public abstract void startInfo(Spiller[] p);
	
	public abstract void venterPaaSlag(String navn);
	
	public abstract void visSlag(int[] terninger);

	public abstract void visSpilStatus (Spiller[] p);

	public abstract void visSlaaIgen(String navn);

	public abstract void visSlutInfo(int pNr,Spiller[] p);	
}
