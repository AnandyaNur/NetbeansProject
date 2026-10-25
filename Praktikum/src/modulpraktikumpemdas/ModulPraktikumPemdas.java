/* Identitas Diri
 * NIM : 09020626099
 * NAMA: Anandya Nur Zahidah
 * MOdul Praktikum Bab 3
 */
package modulpraktikumpemdas;

import java.util.Scanner;

public class ModulPraktikumPemdas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Total beras (kg): ");
        int totalBeras = input.nextInt();
        
        System.out.print("Beras per keluarga (kg): ");
        int berasPerKeluarga = input.nextInt();
        
        int jumlahKeluarga =
        totalBeras / berasPerKeluarga;
        
        int sisaBeras =
        totalBeras % berasPerKeluarga;
        
        System.out.println("\n=== HASIL DISTRIBUSI ===");
        System.out.println("Jumlah keluarga = " + jumlahKeluarga);
        System.out.println("Sisa beras = " + sisaBeras + " kg");
        
        input.close();
    }
}