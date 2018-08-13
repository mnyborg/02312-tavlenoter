package lektion12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class WriteFileTest {
	public static void main(String[] args) throws IOException{
		final int MAX = 10;


		int value;
		String file = "src/test.dat";


		Random rand = new Random();


		FileWriter fw = new FileWriter (file);
		BufferedWriter bw = new BufferedWriter (fw);
		PrintWriter outFile = new PrintWriter (bw);


		for (int line=1; line <= MAX; line++)
		{
			for (int num=1; num <= MAX; num++)
			{	
				value = rand.nextInt (90) + 10;
				outFile.print (value + "   ");
			}
			outFile.println ();
		}


		outFile.close();
		System.out.println ("Output file has been created: " + file);
	}

}
