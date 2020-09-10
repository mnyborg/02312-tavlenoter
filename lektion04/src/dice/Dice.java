package dice;

public class Dice {
    private final int MAX = 6;  // maximum øjne værdi

    // Attributter eller instansvariable
    private int faceValue;


    // Defaullt konstruktør
    public Dice() {
        faceValue = 1;

    }


    // Konstruktør
    public Dice(int val) {

        faceValue = val;

    }

    public void setFaceValue(int val) {

        if (val >= 1 && val <= 6)
            faceValue = val;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public int roll()
    {
        faceValue = (int)(Math.random() * MAX) + 1;
        return faceValue;
    }



    public String toString() {
        return "Øjne: " + faceValue;

    }


}






