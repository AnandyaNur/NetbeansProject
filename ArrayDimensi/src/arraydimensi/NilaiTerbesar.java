package arraydimensi;

public class NilaiTerbesar {

    public static void main(String[] args) {
        int[][] matriks = {
            {10, 45, 20}, 
            {90, 15, 60}, 
            {30, 80, 50}
        };
        
        int max = matriks[0][0];
        int posBaris = 0, posKolom = 0;

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                if (matriks[i][j] > max) {
                    max = matriks[i][j];
                    posBaris = i;
                    posKolom = j;
                }
            }
        }
        System.out.println("Nilai terbesar: " + max);
        System.out.println("Berada di baris " + posBaris + ", kolom " + posKolom);
    }
}
