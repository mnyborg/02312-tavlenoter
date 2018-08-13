package lektion06;

public class Test {

	public static void main(String[] args) {

		int[] intArr = {0, 1, 2, 3, 4, 5};

		intArr[0] = 10;

		//		for (int i = 0; i < intArr.length; i++)
		//			System.out.println(intArr[i]);

		//		for (int val : intArr)
		//			System.out.println(val);

		udskriv(intArr);
		

	}

	public static void udskriv(int[] arr) {

		arr[2] = 100;
		
		for (int val : arr)
			System.out.println(val);
		
		
	}
	
	


}
