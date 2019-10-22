package lektion07.frikadeller;

public class Frikadelle {
    private int koed; // 125 gram   Svinekød, hakket ca. 10 % fedt
    private float egg; // 0.25 æg
    private float hvedemel; // 0.5 spsk. Hvedemel
    private float loeg; // 0.38    Løg
    private float maelk; // 0.13 dl.   Mælk
    private float salt;  // 0.25 tsk.  Salt
    private float peber;  // 0.25 tsk. Peber

    private int portioner;

    public Frikadelle(int portioner) {
        this.portioner = portioner;
        this.koed = 125*portioner;
        this.egg = 0.25F*portioner;
        this.hvedemel = 0.5F*portioner;
        this.loeg = 0.38F*portioner;
        this.maelk = 0.13F*portioner;
        this.salt = 0.25F*portioner;
        this.peber = 0.25F*portioner;
    }

    @Override
    public String toString() {
        return "Frikadelle{" +
                "koed=" + koed +
                ", egg=" + egg +
                ", hvedemel=" + hvedemel +
                ", loeg=" + loeg +
                ", maelk=" + maelk +
                ", salt=" + salt +
                ", peber=" + peber +
                ", portioner=" + portioner +
                '}';
    }

    public void tilbered() {
        roerFars();
        steg();
    }

    private void roerFars() {
        System.out.println("Rør farsen først med salt og mel sejt. der efter1 æg, og det røres godt igennem, " +
                "tilsæt de finthakkede løg og rør sej igen. tilsæt mælk, så farsen bliver formfast.");
    }

    private void steg() {
        System.out.println("Dyp en spiskeske i vamt vand, og form frikallerne inden de kommes på panden med let brunet smør. " +
                "steges ca. 4 min. på hver side, så de har fået en sprød skorpe.");

    }
}
