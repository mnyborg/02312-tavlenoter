package minpakke;

import java.util.Random;
import java.util.Scanner;

public class Eksempel {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);

        System.out.println("indtast alder: ");

        int alder = keyb.nextInt();

        if (alder < 12)
            System.out.println("Du er barn");
        else if (alder < 19)
            System.out.println("Du er teeanager");
        else
            System.out.println("Du er voksen");

        // luk scanner
        keyb.close();



    }
}
