package CDIO_del1.controller;

import CDIO_del1.boundary.Keyboard;
import CDIO_del1.boundary.Out;
import CDIO_del1.entity.MatadorRafleBaegerAutoTest;
import CDIO_del1.entity.Spil;
import CDIO_del1.entity.Spiller;
import CDIO_del1.entity.Spillist;

/**
 * Styrer afviklen af spillet<br>
 * Kommunikerer med flg. objekter:
 * <p>
 * Raflebaeger<br>
 * Keyboard<br>
 * Out<br>
 * Spillist<br>
 * </p>
 * 
 * @author manyb
 * @version 1.1
 */
public class Controller {
	private int antalSpillere; 
	private MatadorRafleBaegerAutoTest rafle;
	private Keyboard keyb;
	private Out out;
	private Spillist spillist;

	
	/**
	 * Konstruktør
	 * @param antal antal spillere
	 */
	public Controller(int antal) {
		antalSpillere = antal;
		rafle = new MatadorRafleBaegerAutoTest(0);
		spillist=new Spillist(antal);
		keyb = new Keyboard();
		out = new Out();
	}

	/**
	 * Gennemløber Spillisten i en uendelig løkke og giver hver spiller tur.
	 * Kommunikere med SpilLogik for at opdateree spillers pointstatus.<br> 
	 * Returnerer når der findes en vinder
	 */
	public void gamecontrol(){
		// her kunne man lave en dialog, der beder brugeren om at indtaste oplysninger på spillere
		spillist.addspiller(antalSpillere);
		out.startInfo(spillist.getSpillere());
		out.visSpilStatus(spillist.getSpillere());
		out.linieSkift();
		out.spilstarter();
		int pNr=0; 
		// nuværende spiller
		Spiller s;
		
		while(true) {
		
			s = spillist.getSpiller(pNr);
			String navn = s.getNavn(); 
			
			out.venterPaaSlag(navn);
			keyb.waitForEnter();
			rafle.rollDice();
			out.visSlag(rafle);
		
			
			// spil logik
			
			// simpelt spil
			// Spil.CDIO1_simpel(rafle.getTerninger(),s);			
			
			// udvidet spil
			Spil.CDIO1_udvidet(rafle.getTerninger(),s);
						
			// er der en vinder?
			if (spillist.isVinder()) { 
				break;
			}
		
			// ekstra slag?
			if (s.isSlaaIgen())  
				out.visSlaaIgen(navn);
			else {
				pNr=spillist.naesteSpiller(pNr);
				
			}
			out.visSpilStatus(spillist.getSpillere());
		
		out.linieSkift();	
		}	
		out.visSlutInfo(pNr,spillist.getSpillere());
	}
}