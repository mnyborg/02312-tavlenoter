package CDIO_del1.entity;
/** implementerer en liste med spillere
 * 
 * @author manyb
 * @version 1.0
 *
 */

public class Spillist {
	private Spiller[] spillere;
	
	public Spillist(int antal ) {
		spillere= new Spiller[antal];
		for (int i = 0;i < antal;i++)
			spillere[i]=new Spiller();
	} 
	
	/**
	 * tilf�jer harcoded spilere til spillerlisten
	 * @param antal antal spillere der skal tilf�jes
	 */
	public void addspiller(int antal){
		String[] navne = {"Peter ","Lene  ","Jan   ","Tobias","Jytte ","Lone  "};
		for (int i=0; i<antal;i++){
			spillere[i].setNavn(navne[i]);
			spillere[i].setColor(i);
		}	
	}	

	public Spiller[] getSpillere(){
		return spillere;
	}

	public Spiller getSpiller(int index){
		return spillere[index];
	}
	
	/**
	 * @return index p� den spiller der vandt
	 */
	public boolean isVinder(){
		for (int i=0;i<spillere.length;i++){
			if (spillere[i].isVinder())
				return true;
		}		
		return false;
	}

	/**
	 * Finder n�ste spiller i spillerlisten, blandt spillere der ikke er d�de
	 * @param index nuv�rende spiller
	 * @return index p� n�ste spiller
	 */
	public int naesteSpiller(int index){
		do { 
		index = ++index % spillere.length;
		} while (spillere[index].isDeath());
		return index;
	}
}
