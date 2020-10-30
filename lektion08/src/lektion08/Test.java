package lektion08;

import lektion08.dice.Dice;

public class Test {

	public static void main(String[] args) {
	    // iArr[0] ... iArr[4]
	    int[] iArr = new int[5];
	    int[] iArr2 = {1,2,3,4,5};
	    iArr[0] = 10;

	    // hvert element indeholder null
	    Dice[] dice = new Dice[5];

	    // sæt referencer ind i arrayet
        dice[0] = new Dice(5);
        dice[1] = new Dice(2);

        // initialiseringsliste
        Dice d1 = new Dice(1);
        Dice d2 = new Dice(6);
        Dice[] dice2 = {d1, d2};

        // initialiseringsliste med anonyme objekter
        Dice[] dice3 = {new Dice(1), new Dice(6)};

        // udskriv objekt værdier (toString)
        for (int i = 0; i < dice3.length; i++) {
            System.out.println(dice3[i]);

        }

        // kald roll på alle elementer
        // alm. for løkke
        for (int i = 0; i < dice3.length ; i++) {
            dice3[i].roll();
        }

        // udskriv objekt værdier (toString)
        for (int i = 0; i < dice3.length; i++) {
            System.out.println(dice3[i]);

        }

        // foreach
        for ( Dice d : dice3 ) {
            d.roll();
        }

        // udskriv objekt værdier (toString)
        for (int i = 0; i < dice3.length; i++) {
            System.out.println(dice3[i]);

        }
    }

    // returnere et array fra en metode
    public static Dice[] rollAll(Dice[] t) {

        Dice[] rolledArr = new Dice[t.length];

        // oprindelige værdier for faveValie overskrives
  //     rolledArr[0] = t[0].roll();
  //     rolledArr[1] = t[1].roll();

        rolledArr[0] = t[0];
        rolledArr[0].roll();
        rolledArr[1] = t[1];
        rolledArr[1].roll();

        return rolledArr;
    }

}
