
package arraydimensi;

    public class DiagonalUtama {
    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int jumlahDiagonal = 0;
        for (int i = 0; i < matriks.length; i++) {
            jumlahDiagonal += matriks[i][i];
        }
        
        System.out.println("Jumlah diagonal utama: " + jumlahDiagonal);
    }
}
