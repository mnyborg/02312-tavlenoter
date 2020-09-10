package lektion09.figurer;

/**
 * Denne klasse implementerer en cirkel
 */
public class Cirkel {
    protected double r;

    /**
     * @param r cirklens radius
     */
    public Cirkel(double r) {
        this.r = r;
    }

    /**
     * @return cirklens areal
     */
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
