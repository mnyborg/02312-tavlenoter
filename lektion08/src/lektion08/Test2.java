package lektion08;

public class Test2 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};

        // udskriv alle elemente
        for (int i = 0; i < a.length; i++) {
            System.out.println("Række: " + i);
            for (int j = 0; j < a[0].length; j++)
                System.out.println(a[i][j]);

        }

        // for-each
        System.out.println("for-each");
        int i = 0;
        for ( int[] row : a ) {
            System.out.println("Række: " + i++);
            for (int j : row)
                System.out.println(j);

        }

    }
}
