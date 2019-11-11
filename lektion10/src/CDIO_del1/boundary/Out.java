package CDIO_del1.boundary;

import CDIO_del1.entity.MatadorRafleBaeger;
import CDIO_del1.entity.Spiller;

/**
 * Implementerer et teksorienterert brugerinterface (TUI)
 * 
 * @author manyb
 * @version 1.1
 */

public class Out {
	private Screen s;
	public Out() {
		s = new Screen();
	}
	/** 
	 * Udskriver et linieskift
	 */
	public void linieSkift(){
		s.println(" ");
	}

	/** 
	 * Udskriver info om spil start
	 */
	public void spilstarter(){
		s.println("Spillet starter ");
		linieSkift();
		
	}
	
	/**
	 * Udskriver info om spilleres navne og saldi
	 * @param p array med spillere
	 */
    public void startInfo(Spiller[] p){
		for (int i=0; i<p.length;i++){	
			s.println("Spiller nr:"+ (i+1) + " Navn: " +p[i].getNavn()+" Saldo: " + p[i].getSaldo()+ " ");
		}
        linieSkift();
	}
    
    /**
     * Udskriver venter på slag tekst
     * @param navn spiller vi venter på
     */
    public void venterPaaSlag(String navn){
		s.println("***");
		s.println("Venter på spiller " + navn + ". Tast ENTER for at fortsætte");
	}
    
    /**
     * Udskriver raflebægers indhold
     * @param rafle raflebæger
     */
    public void visSlag(MatadorRafleBaeger rafle){
		s.println(rafle.toString());
	}

    
    /**
     * Udskriver spillers pointstatus
     * @param p array med spillere
     */
    public void visSpilStatus (Spiller[] p){
    	s.print("Status: ");
    	for(int j = 0; j < p.length; j++){		
			s.print("Spiller " + p[j].getNavn() + ": " + p[j].getSaldo() + " *** "); 
		}
        linieSkift();
	}
	
    /**
     * Udskriver slå igen tekst
     * @param navn spillernummer
     */
    public void visSlaaIgen(String navn){
		s.println("Spiller " + navn + ": Slog to ens tillykke. Du må slå igen");
	}
	
	
    /**
     * Udskriver vinder tekst
     * @param pNr spiller der vandt
     * @param p array med spillere
     */
	public void visSlutInfo(int pNr,Spiller[] p){
        linieSkift();
		s.println("Spillet er slut. " + p[pNr].getNavn() + " vandt");
	}	
}
