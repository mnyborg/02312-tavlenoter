package lektion09.figurer;

public class Cylinder extends Cirkel {
    private double h;

    public Cylinder(double r, double h) {
        super(r);
        this.h = h;
    }

    @Override
    public double areal() {
        return 2*Math.PI*r*h + 2*super.areal();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "h=" + h +
                ", " + super.toString() +
                '}';
    }
}
