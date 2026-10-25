
package Bab_4;

public class NewClass {
 
    public static void main(String[] args) {
        
        // --- 1. Contoh FOR ---
        // Digunakan karena kita tahu pasti ingin mengulang sebanyak 3 kali
        System.out.println("--- Perulangan FOR ---");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Perulangan ke-" + i);
        }

        // --- 2. Contoh WHILE ---
        // Kondisi dicek di awal. Jika salah dari awal, kode di dalam tidak jalan.
        System.out.println("\n--- Perulangan WHILE ---");
        int counterWhile = 1;
        while (counterWhile <= 3) {
            System.out.println("While ke-" + counterWhile);
            counterWhile++; // Jangan lupa increment agar tidak loop selamanya
        }

        // --- 3. Contoh DO-WHILE ---
        // Kode dijalankan dulu MINIMAL 1 KALI, baru kondisi dicek di akhir.
        System.out.println("\n--- Perulangan DO-WHILE ---");
        int counterDo = 5; // Nilai sudah lebih besar dari syarat ( < 3)
        do {
            System.out.println("Do-While ini tetap muncul 1 kali meskipun kondisi salah.");
            counterDo++;
        } while (counterDo < 3);
    }
}

