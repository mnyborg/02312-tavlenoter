package figurer;

public class Cirkel extends Figur {
    protected double r;

    public Cirkel(double r) {
        this.r = r;
    }

    public double areal() {
        return Math.PI * Math.pow(r,2);
    }

    @Override
    public String toString() {
        return "Cirkel{" +
                "r=" + r +
                '}';
    }


}
