package test;

import circle.Circle;
import dice.Dice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1 = new Circle(2);
		c1.setRadius(3);
		
		System.out.println(c1);
		
		System.out.println("Cirklens areal: " + c1.area());
		
		
		
		
		
		// opret et terning objekt og lad 3 
		// vende opad
//		Dice d1 = new Dice(3);
//		Dice d2;
//	
//		//d2 = d1;
//		
//		d2 = new Dice(d1);
//		
//		d1.setFaceValue(6);
//		
//		System.out.println(d1);
//		System.out.println(d2);
//		
//		d2.setFaceValue(6);
//
//		// kast terning
//		// ny �jenv�rdi gemmes i objekt
//		d1.roll();
//
//		// udskriv en streng repr�sentation af d1
//		System.out.println(d1);
//		System.out.println(d2);
//
//		// definer en int til at modtage 
//		// ny v�rdi n�r terning kastes
//		int newVal;
//		newVal = d2.roll();
//		// udskriv �jnev�rdi
//		System.out.println(newVal);
	}

}
