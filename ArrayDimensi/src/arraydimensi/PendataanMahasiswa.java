
package arraydimensi;

import java.util.Scanner;


public class PendataanMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("----------------------------------------------");
        System.out.println("    PROGRAM PENDATAAN MAHASISWA (3D ARRAY)    ");
        System.out.println("----------------------------------------------");

        // REVISI: Ukuran array langsung ditetapkan sesuai materi [3 prodi][3 kelas][5 mhs]
        String[][][] data = new String[3][3][5]; 

        System.out.println("\n===================================");
        System.out.println("    Proses Input Nama Mahasiswa    ");
        System.out.println("===================================");
        
        for (int i = 0; i < data.length; i++) {
            System.out.println("Prodi " + (i + 1));
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("  Kelas " + (j + 1));
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.print("    Nama Mahasiswa ke-" + (k + 1) + ": ");
                    data[i][j][k] = input.nextLine();
                }
            }
        }

        System.out.println("\n######################################");
        System.out.println("        Hasil Output Pendataan        ");
        System.out.println("######################################");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Prodi " + (i + 1));
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("  Kelas " + (j + 1) + ": ");
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.print(data[i][j][k]);
                    if (k < data[i][j].length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }
        
        input.close();
    }
}