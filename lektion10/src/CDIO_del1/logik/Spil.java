package CDIO_del1.logik;

import CDIO_del1.entity.Spiller;

/**
 * Implementerer spillogikken
 * Summen af terningernes værdier lægges til spillerens point i hver runde<br>
 * 
 * <p>
 * Simpel logik:<br>
 * Vinderen er den, der opnår 40 point.<br>
 * </p>
 * 
 * Udvidet logik:<br>
 * Vinderkandidat er den, der opnår 40 point. Herudover er der følgende regler:<br>
 * <p>
 * 1. Mister alle sine point hvis man slår to 1'ere.<br>
 * 2. Får en ekstra tur hvis man slår to ens.<br>
 * 3. Vinder spillet ved at slå to 6'ere, hvis man også i forrige kast slog to 6'ere uanset om det er på ekstrakast eller i forrige tur.<br>
 * 4. Skal slå to ens for at vinde spillet, efter at man har opnået 40 point.<br>
 * </p>
 * 
 * 
 * @author manyb
 * @version 1.1
 *
 */

public class Spil {

	final static int MAX_POINTS = 40; 

	/**
	 * Implementere simpel spillogik. 
	 * @param terninger værdi af terninger som nuværende spiller har slået
	 * @param p nuværende spiller
	 */
	public static void CDIO1_simpel(int[] terninger, Spiller p){
		// summen af terningernes værdier lægges til ens point. Vinderen er den der opnår 40 point
		p.setSaldo(p.getSaldo() + terninger[0] + terninger[1]);
		if (p.getSaldo() > MAX_POINTS)
			p.setVinder(true);
	}

	/**
	 * Implementere udvidet spillogik
	 * @param terninger værdi af terninger som nuværende spiller har slået
	 * @param p nuværende spiller	 */
	public static void CDIO1_udvidet(int[] terninger, Spiller p){
		if (p.getSaldo() > MAX_POINTS)
			p.setVinderPending(true);
		else 
			p.setSaldo(p.getSaldo() + terninger[0] + terninger[1]);

		if ((terninger[0] == terninger[1]))
		{

			// 1. Mister alle sine point hvis man slår to 1'ere.
			if ((terninger[0] == 1 && terninger[1] == 1)) {
				p.setSaldo(0);
				p.setVinderPending(false);
			}
			
			// 2. Får en ekstra tur hvis man slår to ens.
			p.setSlaaIgen(true);
			
			// 3. Vinder spillet ved at slå to 6'ere, hvis man også i forrige kast slog to 6'ere 
			// uanset om det er på ekstrakast eller i forrige tur.
			if ((terninger[0] == 6 && terninger[1] == 6))
				if (p.getAntal6ere()==1)
					p.setVinder(true);
				else
					p.setAntal6ere(p.getAntal6ere()+1);

			// 4. Skal slå to ens for at vinde spillet, efter at man har opnået 40 point.
			if (p.isVinderPending())
				p.setVinder(true);
		}
		else {
			p.setSlaaIgen(false);
			p.setAntal6ere(0);
		}
	}	
}




