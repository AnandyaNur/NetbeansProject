
package arraydimensi;

public class RataRataMahasiswa {
    
    public static void main(String[] args) {
        // Baris = mahasiswa, Kolom = nilai mata kuliah
        int[][] nilai = {
            {80, 85, 90, 75}, // Mahasiswa 1
            {70, 75, 80, 85}, // Mahasiswa 2
            {90, 95, 85, 90}  // Mahasiswa 3
        };

        for (int i = 0; i < nilai.length; i++) {
            double total = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                total += nilai[i][j];
            }
            double rataRata = total / nilai[i].length;
            System.out.println("Rata-rata Mahasiswa " + (i + 1) + ": " + rataRata);
        }
    }
}

