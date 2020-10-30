package lektion08;

public class Opgave {
    public static void main(String[] args) {
        String[][] kurser = {
                {"01904", "02312", "02315"},
                {"02324", "02326", "02327", "62577"},
                {"02369", "62550"},
                {"01920", "02346", "62410"}
        };
        int snr = 1;
        for (String[] kurserStud : kurser) {
            System.out.println(snr++ + ". semester");
            for ( String kursus : kurserStud)
                System.out.println(kursus);
        }
    }
}