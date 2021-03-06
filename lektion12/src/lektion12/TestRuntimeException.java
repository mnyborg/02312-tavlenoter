package lektion12;

public class TestRuntimeException {

	public static void main(String[] args) {
		int i, j;
		i = 5;
		j = 0;
			try {
			System.out.println(i/j);
		} catch (Exception e) {
			System.out.println("FEJL: Man må ikke dividere med 0");
			e.printStackTrace();
		}

		// Ulovlig division med 0
		try {
			div(0,0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		int[] iArr = {1, 2, 3, 4, 5};
		try {
			// Ulovlig indexering
			System.out.println("iArr[5]: " + iArr[5]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public static int div(int v1, int v2) throws ArithmeticException {
		if (v2 == 0)
			throw new ArithmeticException("Division med 0");
		else
			return v1 / v2;
	}

}

