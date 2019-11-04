package lektion08;

import lektion08.dice.Dice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dice[] a = {new Dice(1),new Dice(3),new Dice(5),
            new Dice(2),new Dice(6)};

        // udskriv alle dices
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
        System.out.println("med for-each");
        for ( Dice d : a ) {
            System.out.println(d);
        }

        // kast alle ternionger
        for ( Dice d : a ) {
            d.roll();
        }
        System.out.println("værdier efter terninger er kastet");

        for ( Dice d : a ) {
            System.out.println(d);
        }


	}

}
