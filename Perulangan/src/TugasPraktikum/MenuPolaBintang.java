
package TugasPraktikum;

import java.util.Scanner;

public class MenuPolaBintang {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int pilih;
        int tinggi = 5;

        do {
            System.out.println("===== MENU POLA =====");
            System.out.println("1. Segitiga");
            System.out.println("2. Segitiga Terbalik");
            System.out.println("3. Persegi");
            System.out.println("4. Piramida");
            System.out.println("5. Diamond");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Segitiga");

                    for (int i = 1; i <= tinggi; i++){
                        for (int j = 1; j <= i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("Segitiga Terbalik");

                    for (int i = tinggi; i >= 1; i--){
                        for (int j = 1; j <= i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Persegi");

                    for (int i = 1; i <= tinggi; i++){
                        for (int j = 1; j <= tinggi; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Piramida");

                    for (int i = 1; i <= tinggi; i++){
                        for (int j = tinggi; j > i; j--){
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= (2 * i - 1); j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Diamond");

                    for (int i = 1; i <= tinggi; i++){
                        for (int j = tinggi; j > i; j--){
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= (2 * i - 1); j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    for (int i = tinggi - 1; i >= 1; i--){
                        for (int j = tinggi; j > i; j--){
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= (2 * i - 1); j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 6:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan salah! Masukkan angka 1-6.");
            }

            System.out.println();

        } while (pilih != 6);
    }
}