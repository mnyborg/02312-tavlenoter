package lektion06;

public class Test {

	public static void main(String[] args) {

		int[] a = {1, 2, 3, 4, 5};

		System.out.println(avg(2.0,3.0));
		System.out.println(avg(2.0,3.0,4.0));
		System.out.println(avg(2.0,3.0,4.0,5.0));




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
