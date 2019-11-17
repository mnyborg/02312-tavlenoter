package CDIO_del2_v1.logik;

import CDIO_del2_v1.entity.FeltList;
import CDIO_del2_v1.entity.Spiller;

/**
 * Implementerer spillogikken
 *
 * Spillerne slår på skift med 2 terninger og lander på et felt med numrene fra 2 - 12. At lande på hvert af disse felter har en positiv eller negativ effekt på spillernes pengebeholdning. (Se den følgende feltoversigt), derudover udskrives en tekst omhandlende det aktuelle felt. Når en spiller lander på Goldmine kan der f.eks. udskrives: ?Du har fundet guld i bjergene og sælger det for 650, du er rig!?.
 * Spillerne starter med en pengebeholdning på 1000. Spillet er slut når en spiller når 3000. Spillet skal let kunne oversættes til andre sprog. Det skal være let at skifte til andre terninger.
 *
 * </p>
 * Feltliste
 * Tower 		+250
 * Crater 		-100
 * Palace gates		+100
 * Cold Desert	 	-20
 * Walled city 		+180
 * Monastery 		0
 * Black cave 		-70
 * Huts in the mountain 		+60
 * The Werewall (werewolf-wall)		-80,	men spilleren får en ekstra tur.
 * The pit 		-50
 * Goldmine 		+650
 *
 *
 * @author manyb
 * @version 1.1
 *
 */

public class Spil {

	final static int WINNER_SALDO = 3000;
	

	/**
	 * Implementerer spillogik. 
	 * @param terninger værdi af terninger som nuværende spiller har slået
	 * @param p nuværende spiller
	 * @param f spilleplade
	 */
	public static void spilLogik(int[] terninger, Spiller p, FeltList f) {
		// opdater spillers position på spilleplade
		p.setFeltIndex((p.getFeltIndex()+(terninger[0]+terninger[1]))%f.getSize());
		
		// opdater spillers saldo
		p.setSaldo(p.getSaldo() + (f.getFelt(p.getFeltIndex()).getVaerdi()));
		
		// opdater spillers status
		if (p.getSaldo() < 0)
			// går falit 
			p.setDeath(true);
		else if (p.getSaldo() > WINNER_SALDO)
			p.setVinder(true);

		// ekstra tur
		if (f.getFelt(p.getFeltIndex()).getNr() == 10)
			p.setSlaaIgen(true);
		else
			p.setSlaaIgen(false);
			
	}
}




