
package arraydimensi;

import java.util.Scanner;

public class TugasModifikasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== PROGRAM PENDATAAN MAHASISWA ===");
        
        String[][][] data = inputData(input);
        
        tampilkanDanOperasiString(data);
        
        input.close();
    }

    // METHOD 1: INPUT (UKURAN & NAMA)
    public static String[][][] inputData(Scanner input) {
        System.out.print("Masukkan jumlah Prodi: ");
        int p = input.nextInt();
        System.out.print("Masukkan jumlah Kelas per Prodi: ");
        int k = input.nextInt();
        System.out.print("Masukkan jumlah Mahasiswa per Kelas: ");
        int m = input.nextInt();
        
        // kotak array
        String[][][] dataBaru = new String[p][k][m];
        
        System.out.println("\n--- Silahkan Input Nama Mahasiswa ---");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < k; j++) {
                for (int x = 0; x < m; x++) {
                    System.out.print("Prodi " + (i + 1) + ", Kelas " + (j + 1) + ", Mhs ke-" + (x + 1) + ": ");
                    dataBaru[i][j][x] = input.nextLine();
                }
            }
        }  
        return dataBaru;
    }

    // METHOD 2: TAMPIL DATA & OPERASI STRING
    public static void tampilkanDanOperasiString(String[][][] dataMahasiswa) {
        System.out.println("\n--- DAFTAR DATA MAHASISWA & OPERASI STRING ---");
        
        for (int i = 0; i < dataMahasiswa.length; i++) {       
            System.out.println("Prodi " + (i + 1));
            for (int j = 0; j < dataMahasiswa[i].length; j++) {
                System.out.print("  Kelas " + (j + 1) + " : ");
                
                for (int k = 0; k < dataMahasiswa[i][j].length; k++) {
                    String namaAsli = dataMahasiswa[i][j][k];
                    
                    String cetakFormat = namaAsli.toUpperCase() + "(" + namaAsli.length() + " huruf)";
                    
                    System.out.print(cetakFormat + "  ");
                }
                System.out.println(); 
            }
        }
    }
}
