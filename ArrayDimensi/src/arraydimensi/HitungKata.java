
package arraydimensi;

import java.util.Scanner;

public class HitungKata {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("      Hitung Jumlah Kata       ");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();
        
        if (!kalimat.trim().isEmpty()) {
            // Memecah kata berdasarkan spasi berlebih
            String[] kumpulanKata = kalimat.trim().split("\\s+");
            System.out.println("Jumlah Kata: " + kumpulanKata.length + " kata");
        } else {
            System.out.println("Data kosong. Tidak ada kalimat yang dimasukkan.");
        }
        
        input.close();
    }
}