package test;

import circle.Circle;
import dice.Dice;

import java.text.Format;
import java.text.NumberFormat;


public class Test {

	public static void main(String[] args){
		// TODO Auto-generated method stub
//		int newVal;
//
//		Dice d1 = new Dice(3); // kald af klassens Konstruktør
//		Dice d2 = new Dice(6); // kald af klassens Konstruktør
//		Dice d3 = new Dice();
//
//		System.out.println(d1);
//
//		d1.setFaceValue(6);
//
//		System.out.println(d1);
//		System.out.println(d1.getFaceValue());
//
//		newVal = d1.roll();
//
//		System.out.println(newVal);
//
//		System.out.println(d3);
//
		NumberFormat f = NumberFormat.getNumberInstance();

		Circle c1 = new Circle();
		c1.setRadius(3);

		System.out.println(c1);

		System.out.println("Cirklens areal: " + f.format(c1.area()));


		
		
		
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
//		// ny øjenværdi gemmes i objekt
//		d1.roll();
//
//		// udskriv en streng repræsentation af d1
//		System.out.println(d1);
//		System.out.println(d2);
//
//		// definer en int til at modtage 
//		// ny værdi når terning kastes
//		int newVal;
//		newVal = d2.roll();
//		// udskriv øjneværdi
//		System.out.println(newVal);
	}

}
