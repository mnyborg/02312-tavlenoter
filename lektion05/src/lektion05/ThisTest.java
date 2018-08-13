package lektion05;

public class ThisTest {

	// instans variabel
	private int a;

	// default konstruktør
	public ThisTest() {
		// this kalder konstruktøren der tager en int
		this(42); 
	}

	

	public ThisTest(int a) {
		this.a = a;
	}



	public void print() {

		// lokal variabel i metode
		int a = 1;

		// refererer til den lokale variabel a
		System.out.println(a); 
		// refererer til instans variablen a   
		System.out.println(this.a); 
		// refererer til objektet der har kaldt metoden
		// toString bliver kaldt
		System.out.println(this); 
	}



	@Override
	public String toString() {
		return "ThisTest [a=" + a + "]";
	}

	

}
