package test;

import lektion09.figurer.Cylinder;
import lektion09.personer.Student;

public class Test  {

    public static void main(String[] args) {
        Cylinder c = new Cylinder(3.0,4.0);
        System.out.println(c);
        System.out.println(c.areal());
	}
}
