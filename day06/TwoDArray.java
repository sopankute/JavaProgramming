public class TwoDArray {
    public static void main(String[] args) {
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] matrix3 = new int[3][3];

        //reading values to matrix1 using Math.random()
        for(int i = 0; i < 3; i++) { // i < row
            for(int j = 0; j < 3; j++) { // j < column
                // 1 to 9 range of random()
                matrix1[i][j] = 1 + (int)(Math.random() * 9);
            }
        }

        //reading values to matrix2 using Math.random()
        for(int i = 0; i < 3; i++) { // i < row
            for(int j = 0; j < 3; j++) { // j < column
                // 1 to 9 range of random()
                matrix2[i][j] = 1 + (int)(Math.random() * 9);
            }
        }

        //matrix addition
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j]; 
            }
        }

        //printing matrix1
        System.out.println("Matrix 1");
        for(int i = 0; i < 3; i++) { // i < row
            for(int j = 0; j < 3; j++) { // j < column
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        //printing matrix2
        System.out.println("Matrix 2");
        for(int i = 0; i < 3; i++) { // i < row
            for(int j = 0; j < 3; j++) { // j < column
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        //printing matrix3-> addition of matrix1 & matrix2
        System.out.println("Matrix 3");
        for(int i = 0; i < 3; i++) { // i < row
            for(int j = 0; j < 3; j++) { // j < column
                System.out.print(matrix3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
