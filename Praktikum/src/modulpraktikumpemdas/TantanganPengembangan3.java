/* Identitas Diri
 * NIM : 09020626099
 * NAMA: Anandya Nur Zahidah
 * MOdul Praktikum Bab 3
 */
package modulpraktikumpemdas;

import java.util.Scanner;

public class TantanganPengembangan3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Total beras (kg): ");
        int totalBeras = input.nextInt();
        System.out.print("Jumlah keluarga penerima: ");
        int jumlahKeluarga = input.nextInt();
        int berasPerKeluarga = totalBeras / jumlahKeluarga;
        int sisaBeras = totalBeras % jumlahKeluarga;

        System.out.println("\n=== HASIL PEMBAGIAN BERAS ===");
        System.out.println("Beras per keluarga = "
                + berasPerKeluarga + " kg");
        System.out.println("Sisa beras = "
                + sisaBeras + " kg");

        double sisaDalamGram = sisaBeras * 1000.0;
        double tambahanGram = sisaDalamGram / jumlahKeluarga;
        System.out.println("Tambahan per keluarga = "
                + tambahanGram + " gram");

        input.close();
    }
}
