package lektion01;

public class Test {
    public static void main(String[] args) {
        int a, b, c = 7, d = 2;
        int i = 10;

        i++;



        b = 5;

    //    b = b + 1; // b++ eller ++b

        b++;   // postfix form  b -> 6

        // eller

        ++b;    // prefix form b > 6

     // ========================================
        b = 5;

     // a = b + c++;  // a = 5 + 7 = 12, c = 8

       // System.out.println("a = " + a + " , b = " + b + " , c = " + c);

      // eller

      a = b + ++c + d++;   // a = 5 + 8 = 15, c = 8, d = 3

        System.out.println("a = " + a + " , b = " + b + " , c = " + c + " , d = " + d);

//        a = c/b;
//
//        System.out.println("a = " + a);
//
//        a = c % b;
//
//        System.out.println("a = " + a);
//
//        float f, g, h = 7.0F;
//
//        g = 5.0f;
//
//        f = h/g;
//
//        System.out.println("f = " + f);
//
//

     a = b / c + 7;




    }

}
