package CDIO_del1;


import CDIO_del1.controller.Controller;

/**
 * CDIO 1<br>
 * Implementerer et spil med et raflebæger med to terninger. 
 * 
 * @author Mads Nyborg
 * @version 1.0
 */



public class Main {
	public static void main(String[] args) {
		// antal spillere = 2
		new Controller(2).gamecontrol();
	}
}
