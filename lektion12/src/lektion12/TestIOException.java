package lektion12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestIOException {

	public static void main(String[] args) {
		File file = new File("src/test.dat");
		try {
			Scanner scanner = new Scanner(file);


			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
