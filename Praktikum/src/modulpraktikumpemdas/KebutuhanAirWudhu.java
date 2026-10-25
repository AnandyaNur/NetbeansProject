/* Identitas Diri
 * NIM : 09020626099
 * NAMA: Anandya Nur Zahidah
 * MOdul Praktikum Bab 1
 */
package modulpraktikumpemdas;

import java.util.Scanner; 

public class KebutuhanAirWudhu {

    public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in); 
    System.out.print("Jumlah mahasiswa : "); 
    int jumlahMahasiswa = input.nextInt(); 
    
    System.out.print("Frekuensi wudhu : "); 
    int frekuensiWudhu = input.nextInt(); 
    
    System.out.print("Air per wudhu (liter) : "); 
    double airPerWudhu = input.nextDouble(); 
    
    double totalAir = 
    jumlahMahasiswa * frekuensiWudhu * airPerWudhu;
    
    System.out.println("\n=== HASIL ===");
                                  
    System.out.println("Total kebutuhan air = "+ totalAir + " liter"); 
    input.close();  
    }
    
}
