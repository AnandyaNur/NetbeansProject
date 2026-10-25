
package perulangan;
import java.util.Scanner;

public class Tabungan {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah Bulan : ");
        int batasBulan = input.nextInt();

        int total = 0;
        int tabungan = 100000;

        for (int bulan = 1; bulan <= batasBulan; bulan++) {

            System.out.println("Tabungan bulan ke-" + bulan + " : Rp" + tabungan);

            total = total + tabungan;

            if (total >= 1000000) {
                System.out.println("Tabungan sudah mencapai 1 juta dalam bulan ke- " + bulan);
                System.out.println("Total tabungan saat ini: Rp" + total);
                break;
            }

            tabungan = tabungan + 50000;
        }
    }
}
