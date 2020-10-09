package lektion02;

//import java.lang.String;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);  // System.in = Tastatur
//		System.out.print("Indtast en streng: ");
//		String input = sc.nextLine();
//		System.out.println("Du indtastede: " + input);
//
//		sc.close();
//
//		int x = 9;

// x^2
	//	System.out.println("x^2 = " + Math.pow(x,2));

// kvadratrod x
//		System.out.println("Kvadratrod x = " + Math.sqrt(x));
		//  String title = new String("Java");
//       String title = "Java";
//
//        int l = title.length();
//
//        System.out.println("L = " + l);
//
//       String s;
//
//		s = title.concat(" programmering");
//
//
//      System.out.println(s);
//		System.out.println(title);
//
//		System.out.println(s.toUpperCase());
//
//
//
//		String s2 = s;

		Scanner keyb = new Scanner(System.in);

		System.out.println("indtast alder: ");

		int alder = keyb.nextInt();

		if (alder < 14) {
			System.out.println("Du er ikke konfirmeret endnu");
			System.out.println("--men glæd dog til gode gaver");
		}
		else
			System.out.println("Du er konfirmeret eller skal konfirmeres i år");

		// luk scanner
		keyb.close();


    }

}
