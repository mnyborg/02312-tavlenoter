package CDIO_del2_v1.boundary;

import CDIO_del2_v1.entity.Spiller;

public class TUI extends AbstractUI {
	@Override
	public void spilstarter(){
		System.out.printf(Tekster.TEKSTER[0]);
	}
	@Override
	public void startInfo(Spiller[] p){
		for (int i=0; i<p.length;i++){	
			System.out.printf(Tekster.TEKSTER[1],i+1, p[i].getNavn(), p[i].getSaldo());
		}
		System.out.println("");
	}
	@Override
	public void venterPaaSlag(String navn){
		System.out.printf(Tekster.TEKSTER[2], navn);
	}
	@Override
	public void visSlag(int[] terninger){
		System.out.printf(Tekster.TEKSTER[3], terninger[0], terninger[1]);
	}
	@Override
	public void visSpilStatus (Spiller[] p){
		System.out.printf(Tekster.TEKSTER[4]);
		for(int j = 0; j < p.length; j++){		
			System.out.printf(Tekster.TEKSTER[5],j+1, p[j].getSaldo()); 
		}
		System.out.println("");
	}
	@Override
	public void visSlaaIgen(String navn){
		System.out.printf(Tekster.TEKSTER[6],navn);
	}
	@Override
	public void visSlutInfo(int pNr,Spiller[] p){
		System.out.printf(Tekster.TEKSTER[5],pNr+1, p[pNr].getSaldo()); 
		System.out.println("");
		System.out.printf(Tekster.TEKSTER[7],p[pNr].getNavn());
	}	
}
