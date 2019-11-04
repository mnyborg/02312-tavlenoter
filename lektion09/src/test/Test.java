package test;

import lektion09.figurer.Cylinder;
import lektion09.personer.Student;

public class Test {

	public static void main(String[] args) {
		Student s = new Student("Pia Jensen", "Poppelvej 2", "s123456");
		System.out.println(s);

		Cylinder cy = new Cylinder(3.0, 4.0);
		System.out.println(cy);

	}

}
