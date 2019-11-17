package CDIO_del2_v1.boundary;

import java.util.Scanner;


public class Keyboard extends AbstractKeyboard {
	private Scanner in;
	public Keyboard() {
		in = new Scanner(System.in);
	}

	@Override
	public void waitForInt(int ind){
		int temp;
			do {
			temp = in.nextInt();
			}while (!(ind==temp)); 
	}
	
	@Override
	public void waitForEnter(){
		in.nextLine();
	}
}
