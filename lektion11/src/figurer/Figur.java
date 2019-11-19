package figurer;

public abstract class Figur {
    private String farve;

    public Figur(String farve) {
        this.farve = farve;
    }

    @Override
    public String toString() {
        return "Figur{" +
                "farve='" + farve + '\'' +
                '}';
    }

    public abstract double areal();
}

