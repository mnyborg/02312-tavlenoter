package CDIO_del2_v1.entity;

public class FeltList {
	private Felt[] felter = new Felt[12];	

	public FeltList() {
		felter[0] = new  Felt(1, "Start", 0, "");
		felter[1] = new  Felt(2, "Tower", 250, "");
		felter[2] = new  Felt(3, "Crater", -100, "");
		felter[3] = new  Felt(4, "Palace gates", 100, "");
		felter[4] = new  Felt(5, "Cold Desert", -20, "");
		felter[5] = new  Felt(6, "Walled city", 180, "");
		felter[6] = new  Felt(7, "Monastery", 0, "");
		felter[7] = new  Felt(8, "Black cave", -70, "");
		felter[8] = new  Felt(9, "Huts in the mountain", 60, "");
		felter[9] = new  Felt(10, "The Werewall (werewolf-wall)", -80, "Du får en ekstra tur");
		felter[10] = new  Felt(11, "The pit", -50, "");
		felter[11] = new  Felt(12, "Goldmine", 650, "Du har fundet guld i bjergene og sælger det for 650, du er rig!");
	}
	
	public int getSize() {
		return felter.length;
	}
	
	public Felt getFelt(int nr) {
		return felter[nr];
	}
	
	public String[][] getFeltTexter() {
		String[][] feltTexter = new String[getSize()][2];
		
		for (int i=0; i<felter.length; i++) {
			feltTexter[i][0] = felter[i].getNavn();
			feltTexter[i][1] = "" + felter[i].getVaerdi();
			
		}	
		return feltTexter;
	}
	
	
}
