package dice;

public class Dice {
    private int oejne;

    @Override
    public String toString() {
        return "Dice{" +
                "oejne=" + oejne +
                '}';
    }

    public Dice(int oejne) {
        this.oejne = oejne;
    }
}
