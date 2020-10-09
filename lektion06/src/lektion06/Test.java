package lektion06;

import dice.Dice;

public class Test {

	public static void main(String[] args) {


		int jan = 31;
		int feb = 28;
		int marts = 31;
		int april = 30;
		int maj = 31;
		int juni = 30;


		int[] dage_i_maaned = {31, 28, 31, 30, 31, 30};

//		dage_i_maaned = new int[6];
//
//		dage_i_maaned[0] = 31;
//		dage_i_maaned[1] = 28;
//		dage_i_maaned[2] = 31;
//		dage_i_maaned[3] = 30;
//		dage_i_maaned[4] = 31;
//		dage_i_maaned[5] = 30;

		String[] maaned_navne = {"Januar", "Februar", "Marts", "April", "Maj", "Juni"};

		Dice dice1, dice2;

		dice1 = new Dice(5);
		dice2 = new Dice(6);

		Dice[] dices = new Dice[2];

		dices[0] = dice1;
		dices[1] = dice2;

		// alternativt

		dices[0] = new Dice(5);
		dices[1] = new Dice(6);

		// initialiseringsste

		// Dice[] dices = {new Dice(5), new Dice(6)};

		System.out.println(dices[0]); // -> dice1 udskrives vha toString()

//		System.out.println("Dage i Januar: " + jan);
//		System.out.println("Dage i Januar: " + dage_i_maaned[0]);
//
//		System.out.println("Dage i Juni: " + dage_i_maaned[5]);

		for (int i = 0; i < dage_i_maaned.length ; i++) {
			System.out.println(dage_i_maaned[i]);
		}
		System.out.println("for each:");
		for (int val : dage_i_maaned)
			System.out.println(val);


		//		int[] a = {1, 2, 3, 4, 5};
//
//		System.out.println(avg(2.0,3.0));
//		System.out.println(avg(2.0,3.0,4.0));
//		System.out.println(avg(2.0,3.0,4.0,5.0));
//



//		a = 5;
//
//		int jan = 31;
//		int feb = 28;
//		int mar = 31;
//
//		int[] monthLen = {31,28,31,30,31,30,31,31,30,31,30,31};
//
//		int[] intArr = new int[10];
//
//		for (int i = 0; i < intArr.length; i++) {
//			intArr[i] = i*10;
//
//		}
//
//		for (int i = 0; i < intArr.length; i++) {
//			System.out.println(intArr[i]);
//			intArr[i] = intArr[i]-10;
//
//		}
//
//		System.out.println("for-each");
//		for (int val : intArr) {
//			System.out.println(val);
//		}
//		System.out.println();
//		System.out.println();
//
//		String[] monthNames= {"jan","feb","mar", "apr", "maj"};
//
//
////		intArr = new int[5];
////
////		intArr[0] = 5;
////		intArr[1] = 6;
////		intArr[2] = 7;
////		intArr[3] = 8;
////		intArr[4] = 9;
////
//
//		for (int i = 0; i < monthLen.length; i++) {
//			System.out.println(monthLen[i]);
//		}
//
//		for (int i = 0; i < monthNames.length; i++) {
//			System.out.println(monthNames[i]);
//		}

	}



	public static double avg(double ... numbers) {
		double total = 0.0; // initialiser total

		// beregn sum af argumenter
		for ( int i = 0; i < numbers.length; i++ )
			total += numbers[i];

		// returner gennemsnit
		return total / numbers.length;




	}


	public static void udskriv(int[] arr) {

		// arr = a
		for (int val : arr)
			System.out.println(val);
	}
	
	


}
