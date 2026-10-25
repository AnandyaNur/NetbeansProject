
package perulangan;

import java.util.Scanner;

public class PersegiPanjang2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int i;
        int j;
        int baris;
        int kolom;
        
        System.out.println("Masukkan jumlah baris yang kamu inginkan");
        baris = input.nextInt();
        
        System.out.println("Masukkan jumlah kolom yang kamu inginkan");
        kolom = input.nextInt();
        
        for (i = 1; i <= baris; i++) {
            for (j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}