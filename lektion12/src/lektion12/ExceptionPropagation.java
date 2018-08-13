package lektion12;

public class ExceptionPropagation {

	public static void main(String args[]) {
		method1();
		System.out.println("Fortsæt med normalt Flow...");
	}


	static void method1() {
		try{
			method2();
		} catch(Exception e){
			e.printStackTrace();
		}
	}


	static void method2() throws ArithmeticException {
		method3();
	}


	static void method3() throws ArithmeticException {
		int result = 100 / 0;  // AritmeticException !
	}


}
