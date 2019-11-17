package CDIO_del2_v1;


import CDIO_del2_v1.controller.Controller;

public class Main {
	public static void main(String[] args) {
		// antal spillere = 2
		new Controller(2).gamecontrol();
	}
}
