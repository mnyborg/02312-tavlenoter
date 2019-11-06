package test;

import figurer.Cirkel;
import figurer.Cylinder;


public class Test {

	public static void main(String[] args) {
		Cylinder c = new Cylinder(3.0, 4.0);

		System.out.println(c);
		System.out.println("Cylinder areal: " + c.areal());

	}

}
