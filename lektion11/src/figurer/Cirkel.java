package figurer;

public class Cirkel extends Figur {
    protected double r;

    public Cirkel(String farve, double r) {
        super(farve);
        this.r = r;
    }

    @Override
    public double areal() {
        return Math.PI * Math.pow(r,2);
    }

//    @Override
//    public double rumfang() {
//        return 0;
//    }

    @Override
    public String toString() {
        return super.toString() + " " + "Cirkel{" +
                "r=" + r +
                '}';
    }


}
