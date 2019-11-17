package CDIO_del2_v1.controller;


import CDIO_del2_v1.boundary.AbstractKeyboard;
import CDIO_del2_v1.boundary.AbstractUI;
import CDIO_del2_v1.boundary.KeyboardMatadorGUI;
import CDIO_del2_v1.boundary.MatadorGUI;
import CDIO_del2_v1.entity.FeltList;
import CDIO_del2_v1.entity.MatadorRafleBaegerAutoTest;
import CDIO_del2_v1.entity.Spiller;
import CDIO_del2_v1.entity.Spillist;
import CDIO_del2_v1.logik.Spil;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_main.GUI;



public class Controller {
	private int SPILLERE; 
	private MatadorRafleBaegerAutoTest rafle;
	
	// Felt liste
	private FeltList feltList;
	
	// keyboard der tilknyttes, kan være Keyboard eller KeyboardMatadorGUI
	private AbstractKeyboard keyb;
	// skærm der tilknyttes, kan være TUI eller MatadorGUI
	private AbstractUI out;
	private Spillist spillist;

	public Controller(int antal) {
		SPILLERE = antal;
		rafle = new MatadorRafleBaegerAutoTest(0);
		spillist=new Spillist(antal);
		
		feltList = new FeltList();
		
//		keyb = new Keyboard();
//		out =  new TUI();

		// instantier GUI der benyttes
		GUI gui = makeGUIBoard();
		out =  new MatadorGUI(gui);
		keyb = new KeyboardMatadorGUI(gui);

	}

	private GUI makeGUIBoard() {
		String[][] feltTexter = feltList.getFeltTexter();
		GUI_Field[] fields = new GUI_Field[feltTexter.length];

		for (int i = 0; i < feltTexter.length; i++) {
			fields[i] = new GUI_Street();
			fields[i].setTitle(feltTexter[i][0]);
			fields[i].setSubText(feltTexter[i][1]);
		}
		return new GUI(fields);
	}

	public void gamecontrol(){
		// her kunne man lave en dialog, der beder brugeren om at indtaste oplysninger på spillere
		spillist.addspiller(SPILLERE);
		// startbehodning, kr 1000
		for (int i = 0; i < spillist.getSpillere().length; i++) {
			spillist.getSpiller(i).setSaldo(1000);
		}
		out.startInfo(spillist.getSpillere());
		out.visSpilStatus(spillist.getSpillere());
		out.spilstarter();
		int pNr=0; 
		Spiller s;
		
		while(true) {
			s = spillist.getSpiller(pNr);
			String navn = s.getNavn(); 
			
			out.venterPaaSlag(navn);
			keyb.waitForEnter();
			rafle.rollDice();
			out.visSlag(rafle.getTerninger());
			s = spillist.getSpiller(pNr);
			
			// spil logik
			
			Spil.spilLogik(rafle.getTerninger(),s, feltList);

			// opdater spilstatus
            out.visSpilStatus(spillist.getSpillere());
						
			// er der en vinder?
			if (spillist.isVinder()) { 
				break;
			}
		
			// ekstra slag?
			if (s.isSlaaIgen())
                out.visSlaaIgen(navn);
			else {
				pNr=spillist.naesteSpiller(pNr);
				
			}
		}	
		out.visSlutInfo(pNr,spillist.getSpillere());
	}
}