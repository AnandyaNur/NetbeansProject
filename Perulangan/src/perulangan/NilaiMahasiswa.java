
package perulangan;
import java.util.Scanner;

public class NilaiMahasiswa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lulus = 0;
        int tidakLulus = 0;
        int totalNilai = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print(
                "Masukkan nilai mahasiswa ke-" + i + ": ");

            int nilai = input.nextInt();
            totalNilai = totalNilai + nilai;

            if (nilai >= 75) {
                System.out.println("Status: Lulus");
                lulus++;

            } else {
                System.out.println("Status: Tidak Lulus");
                tidakLulus++;
            }
        }

        double rataRata = (double) totalNilai / 5;

        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
        System.out.println("Rata-rata nilai: " + rataRata);
    }
}