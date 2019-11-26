package lektion12;

import java.io.*;
import java.util.Random;

public class WriteFileTest {
	public static void main(String[] args){
		final int MAX = 10;


		int value;
		String file = "lektion12/src/test.dat";
		Random rand = new Random();

		PrintWriter outFile = null;
		try {
			FileWriter fw = new FileWriter (file);
			BufferedWriter bw = new BufferedWriter (fw);
			outFile = new PrintWriter(bw);


			for (int line=1; line <= MAX; line++)
            {
                for (int num=1; num <= MAX; num++)
                {
                    value = rand.nextInt (90) + 10;
                    bw.write (value + "   ");
                }
                bw.write ("\n");
            }
		} catch (IOException e) {
		//	e.printStackTrace();
			System.out.println("Fejl i kommunikation med fil - kontakt administrator");
		}


		if (outFile != null) {
			System.out.println ("Output file has been created: " + file);
			outFile.close();
		}

	}

}
