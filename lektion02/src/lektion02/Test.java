package lektion02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		//String title = new String("Java");
		//		String title = "Java";
		//		
		//		int l = title.length();
		//		
		//		System.out.println("L = " + l);
		//		
		//		String s;
		//		
		//		
		//		s = title.concat(" programmering");
		//
		//			
		//		System.out.println(s);
		//		
		//		
		//		String s2 = s;
		//		
		//		
		//		// læs et heltal fra tastatur
		//		Scanner sc = new Scanner(System.in);  // System.in = Tastatur
		//		System.out.println("Indtast alder: ");
		//		int i = sc.nextInt();
		//		
		//		System.out.println("Din alder er: " + i);
		//
		//		// luk scanner objekt efter brug
		//		sc.close();
		//		
		//		
		//		boolean b;
		//		
		//		b = 5<10;
		//		
		//
		//		System.out.println("b = " + b);


		Scanner keyb = new Scanner(System.in);

		System.out.println("indtast alder: ");

		int alder = keyb.nextInt();

		if (alder < 14)
		{
			System.out.println("Du er ikke konfirmeret endnu");
			System.out.println("Vi er i if-delen");
		}
		else
		{
			System.out.println("Du er konfirmeret eller skal konfirmeres i år");
			System.out.println("Glæd dig til gaverne hvis du skal konfirmeres i år");
		}


		// luk scanner
		keyb.close();


	}

}
