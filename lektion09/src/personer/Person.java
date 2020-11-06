package personer;

public class Person {
    // private String navn;
    protected String navn;
    private String adresse;

    public Person(String navn, String adresse) {
        this.navn = navn;
        this.adresse = adresse;
    }

    public String getNavn() {
        return navn;
    }

    public Person(String navn) {
        this.navn = navn;
        this.adresse = "Virtual reality";
    }

    @Override
    public String toString() {
        return "{" +
                "navn='" + navn + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';

    }

    public void Hello() {
        System.out.println("Person Hello" + "\n");

    }
}

