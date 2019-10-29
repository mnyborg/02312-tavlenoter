package lektion08;

import lektion08.dice.Dice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dice[] diceArr = new Dice[3];
		
		diceArr[0] = new Dice(1);
		diceArr[1] = new Dice(5);
		diceArr[2] = new Dice(6);
		
		for(int i = 0; i < diceArr.length; i++)
			System.out.println(diceArr[i]);
		
		System.out.println("med for-each");
		
		for(Dice d : diceArr)
			System.out.println(d);

	}

}
