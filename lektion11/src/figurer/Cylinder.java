package figurer;

public class Cylinder extends Cirkel {
    private double h;

    public Cylinder(double r, double h) {
        super(r);
        this.h = h;
    }

    @Override
    public double areal() {
        return super.areal()*2 + Math.PI*2*r*h;
    }

    public double rumfang() {
        return super.areal() * h;
    }

    @Override
    public String toString() {
        return super.toString()+ " " + "Cylinder{" +
                "h=" + h +
                '}';
    }
}
