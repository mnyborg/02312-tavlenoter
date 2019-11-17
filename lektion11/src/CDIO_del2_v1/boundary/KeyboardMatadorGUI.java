package CDIO_del2_v1.boundary;

import gui_main.GUI;

public class KeyboardMatadorGUI extends AbstractKeyboard {
	private GUI gui;

	public KeyboardMatadorGUI(GUI gui) {
	    this.gui = gui;
    }

	@Override
	public void waitForInt(int ind){
		int temp;
		do {
			temp = gui.getUserInteger("");
		}while (!(ind==temp)); 	
	}
	@Override
	public void waitForEnter(){
		gui.getUserButtonPressed("", "ENTER");
	}
}
