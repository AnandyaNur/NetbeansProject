
package perkalian;

import java.util.Scanner;

public class Perkalian {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int angka;
        
        System.out.print("Masukkan angka: ");
        angka = input.nextInt();
                
        for (int i = 0; i <= 10; i++) {
        System.out.println(angka+"x"+i+"="+(angka*i));
}
    }
    
}
