package lektion03;


import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		String out;


		while (true) {

			System.out.println("indtast ugedag eller \"afslut\" : ");

			String ugeDag = keyb.next();

			// konverter til små bogstaver
			ugeDag = ugeDag.toLowerCase();
			
			if (ugeDag.equals("afslut")) {
				System.out.println("Farvel");
				break;
			}

			switch (ugeDag) {
			case "mandag":
			case "tirsdag":
			case "onsdag":
			case "torsdag":
			case "fredag":
				out = "Det er arbejsdadag";
				break;
			case "lørdag":
			case "søndag":
				out = "Det er weekend";
				break;
			default: out = "Kender ikke denne dag";
			}

			// udskriv resultat
			System.out.println(out);

		}

		// luk scanner
		keyb.close();

	}
}


