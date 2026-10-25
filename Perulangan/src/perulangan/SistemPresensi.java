
package perulangan;
import java.util.Scanner;

public class SistemPresensi {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();

        int hadir = 0;
        int absen = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Mahasiswa ke-" + i + ": ");
            int status = input.nextInt();

            if (status == 1) {
                hadir = hadir + 1;
            } else {
                absen = absen + 1;
            }
        }

        int persen = (hadir * 100) / n;

        System.out.println("Jumlah Hadir: " + hadir);
        System.out.println("Jumlah Tidak Hadir: " + absen);
        System.out.println("Persentase: " + persen + "%");

        if (persen >= 75) {
            System.out.println("Status: Memenuhi syarat");
        } else {
            System.out.println("Status: Tidak memenuhi syarat");
        }
    }
}