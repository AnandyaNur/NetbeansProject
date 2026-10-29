
package arraydimensi;

    public class TransposeMatriks {
    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] transpose = new int[3][3];

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                transpose[j][i] = matriks[i][j];
            }
        }

        // Cetak hasil transpose
        System.out.println("Hasil Transpose:");
        for (int[] baris : transpose) {
            for (int nilai : baris) {
                System.out.print(nilai + " ");
            }
            System.out.println();
        }
    }
}
