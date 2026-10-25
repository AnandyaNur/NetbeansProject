
package subcpmk12;

import java.util.Scanner;

public class case3PermainanTebakAngka {

    public static void main (String[] args)
    {Scanner input = new Scanner (System.in);
    
    int angkaacak, tebakan, jumlahpercobaan;
    boolean angkabenar;
    
    angkaacak = (int)(Math.random() * 100) + 1;
    jumlahpercobaan = 0;
    angkabenar = false;
    tebakan = 0;
    
    while (angkabenar == false && jumlahpercobaan <7)
    {System.out.println ("Masukkan tebakan Anda (1-100) Sisa Kesempatan: " + (7 - jumlahpercobaan));
    tebakan = input.nextInt();   
    jumlahpercobaan = jumlahpercobaan + 1;
    
    if (tebakan == angkaacak )
    angkabenar = true;
    else 
    {if (tebakan < angkaacak) {
            System.out.println("Terlalu kecil!");
        } else {
            System.out.println("Terlalu besar!");
        }
    }
    }
    if (tebakan == angkaacak){
        System.out.println ("Selamat, anda berhasil menebak angkanya!");}
        else {
        System.out.println ("Maaf kesempatan telah habis. Angka yang benar adalah=" + (angkaacak));
    }
}
}
