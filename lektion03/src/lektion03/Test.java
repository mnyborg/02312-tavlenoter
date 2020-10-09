package lektion03;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


		for(int num2 = 0; num2 <= 3;  num2++)
			for(int num1 = 2; num1 <= 2; num1++)
				System.out.println(num2 + "   " + num1);






		Scanner keyb = new Scanner(System.in);

        // erklær variable
        String ugeDag;
        String out;

		while (true) {

			System.out.println("indtast ugedag (afslut ved at skrive \"slut\"): ");
			ugeDag = keyb.next();

			// konverter til små bogstaver
			ugeDag = ugeDag.toLowerCase();

			// test om slutbetingelse er opfyldt
			if (ugeDag.equals("slut")) {
				// sig farvel
				System.out.println("Farvel");
				// afbryd løkke
				break;
			}

			switch (ugeDag) {
				case "mandag":
				case "tirsdag":
				case "onsdag":
				case "torsdag":
				case "fredag":
					out = "Det er arbejdsdag";
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


