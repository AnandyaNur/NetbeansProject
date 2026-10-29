
package arraydimensi;

import java.util.Scanner;

public class Kapitalisasi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("   Ubah Huruf Pertama Kapital  ");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();
        
        if (!kalimat.trim().isEmpty()) {
            String[] kumpulanKata = kalimat.trim().split("\\s+");
            StringBuilder hasilKapital = new StringBuilder();
            
            for (String kata : kumpulanKata) {
                if (!kata.isEmpty()) {
                    hasilKapital.append(kata.substring(0, 1).toUpperCase())
                                .append(kata.substring(1))
                                .append(" ");
                }
            }
            System.out.println("Hasil: " + hasilKapital.toString().trim());
        } else {
            System.out.println("Data kosong. Tidak ada kalimat yang dimasukkan.");
        }
        
        input.close();
    }
}

