package personer;

public class Ansat extends Person{
    private int loen;

    public Ansat(String navn, String adresse, int loen) {
        super(navn, adresse);
        this.loen = loen;
    }
}
