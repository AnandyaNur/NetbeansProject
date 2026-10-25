
package perulangan;
import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int pilih;
        
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Menampilkan angka 1-10");
            System.out.println("2. Menampilkan bilangan genap");
            System.out.println("3. Menghitung jumlah 1-10");
            System.out.println("4. Menggambar segitiga bintang");
            System.out.println("5. Keluar");
            System.out.print("Pilihan anda: ");
            pilih = in.nextInt();
            
            switch (pilih) {
                case 1:
                    for (int i = 1; i <= 10; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                    
                case 2:
                    for (int i = 2; i <= 20; i += 2) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                    
                case 3:
                    int total = 0;
                    for (int i = 1; i <= 10; i++) {
                        total = total + i;
                    }
                    System.out.println("Jumlah total 1-10 = " + total);
                    break;
                    
                case 4:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                    
                case 5:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                    
                default:
                    System.out.println("Pilihan salah!");
            }
            
        } while (pilih != 5);
    }
}
