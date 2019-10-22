package lektion07;

import lektion07.frikadeller.Frikadelle;

public class Test {
    public static void main(String[] args) {
        System.out.println("Lektion 7");

        for (String arg : args) {
            System.out.println(arg);
        }

        Frikadelle f4 = new Frikadelle(4);

        System.out.println(f4);

        f4.tilbered();
    }
}
