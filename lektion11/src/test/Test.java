package test;

import figurer.Cirkel;
import figurer.Cylinder;
import figurer.Figur;

public class Test {
    public static void main(String[] args) {
        Figur f;

        Cirkel c = new Cirkel("Rød", 3.0);

        System.out.println(c);

        Cylinder cy = new Cylinder("Blå", 3.0, 4.0);

        System.out.println(cy);

        // polymorfi
        f = c;
        System.out.println(f.areal());

        f = cy;
        System.out.println(f.areal());

        Figur[] fArr = {new Cirkel("Orange", 5.0), new Cylinder("Sort", 2.0, 9.0)};

        for (int i = 0; i < fArr.length ; i++) {
            System.out.println(fArr[i].areal());

        }

        System.out.println("Cylinder volumen: " + cy.rumfang());
        // down casting
        System.out.println("Cylinder volumen via downcasting: " + ((Cylinder) f).rumfang());

        // instanceof operator
        System.out.println("instanceof operator:");
        for (int i = 0; i < fArr.length ; i++) {
            System.out.println("Areal" + i + ": " + fArr[i].areal());
            if (fArr[i] instanceof Cylinder )
                System.out.println("Rumfang" + i + ":" + ((Cylinder) fArr[i]).rumfang());

        }
    }

}

