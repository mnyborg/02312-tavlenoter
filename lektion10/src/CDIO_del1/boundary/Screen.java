package CDIO_del1.boundary;
/**
 * Implementerer en tekstsk�rm
 *
 */
public class Screen {
	/**
	 * Udskriver tekst uden linieskift
	 * @param p tekst der skal udskrives
	 */
	protected void print(String p){
		System.out.print(p);
	}
	
	/**
	 * Udskriver tekst med linieskift
	 * @param p tekst der skal udskrives
	 */
	void println(String p){
		System.out.println(p);
	}
}
