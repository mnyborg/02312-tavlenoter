package lektion08;

public class Test2 {
    public static void main(String[] args) {
        // 2. dim array
        int[][] matrix = new int[5][8];

        // tildeling af værdi
        matrix[1][2] = 10;

        // udskriv værdier
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }

        // udskriv værdier - foreach
        int rno = 0;
        for (int[] row : matrix) {
            System.out.println("Række: " + rno++);
            for (int val : row) {
                System.out.println(val);
            }
        }

        // alternativ måde at definere et flerdim array
        int[][] matrix1 = new int[5][];

        matrix1[0] = new int[8];
        matrix1[1] = new int[3];
        matrix1[2] = new int[4];
        matrix1[3] = new int[2];
        matrix1[4] = new int[6];

        // udskriv værdier - generisk
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.println(matrix1[i][j]);
            }
        }

        // brug af initialiseringsliste i flerdim arrrays
        int[][] matrix2 = {{1,2,3,4,5}, {6,7,8}, {9,10}};

        // udskriv værdier - generisk
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.println(matrix2[i][j]);
            }
        }

    }
}
