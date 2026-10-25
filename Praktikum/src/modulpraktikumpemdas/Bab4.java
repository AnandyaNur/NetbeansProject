// Identitas Diri
// NIM : 09030626099
// Nama : Anandya Nur Zahidah
// Modul Praktikum Bab 4
package modulpraktikumpemdas;

import java.util.Scanner;

public class Bab4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("IPK : ");
        double ipk = input.nextDouble();

        System.out.print("Hafalan (Juz) : ");
        int hafalan = input.nextInt();

        if (ipk >= 3.25 && hafalan >= 5) {
            System.out.println("Memenuhi syarat beasiswa.");
        } else {
            System.out.println("Belum memenuhi syarat beasiswa.");
        }

        input.close();
    }
}   
