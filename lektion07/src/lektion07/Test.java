package lektion07;

public class Test {
    public static void main(String[] args) {
        int i1 = 5, i2 = 10;

        Integer iObj1 = new Integer(5);
        Integer iObj2 = new Integer(10);


        // overførsel af simple typer
        params(i1, i2);

        System.out.println("i1 = " + i1 + " i2 = " + i2);

        // Overførsel af objektreferencer
        params(iObj1, iObj2);

        System.out.println("iObj1 = " + iObj1 + " iObj2 = " + iObj2);


    }

    // overførsel af simple datatyper
    private static void params(int v1, int v2) {
        // v1 = i1
        // v2 = i2

        v2 = v1;

        System.out.println("v1 = " + v1 + " v2 = " + v2);
    }

    // overførsel af objektreferencer
    private static void params(Integer v1, Integer v2) {
        // v1 = iObj1
        // v2 = iObj2


        // v2 = v1
        v2.setVal(v1.getVal());  // iObj2.setVal(iObj1.getVal())

        System.out.println("v1 = " + v1 + " v2 = " + v2);
    }
}


