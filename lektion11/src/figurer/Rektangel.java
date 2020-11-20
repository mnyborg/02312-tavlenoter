package figurer;

public class Rektangel extends Figur {
    private double l, b;

    public Rektangel(String farve, double l, double b) {
        super(farve);
        this.l = l;
        this.b = b;
    }

    public double areal() {
        return l*b;
    }
}
