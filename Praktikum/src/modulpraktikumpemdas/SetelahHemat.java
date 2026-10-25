/* Identitas Diri
 * NIM : 09020626099
 * NAMA: Anandya Nur Zahidah
 * MOdul Praktikum Bab 1
 */
package modulpraktikumpemdas;

 import java.util.Scanner;

public class SetelahHemat {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jumlahMahasiswa;
        int frekuensiWudhu;
        double airPerWudhu;
        double totalAir;
        double totalAirHemat;
        double kebutuhanSetelahHemat;
        double persentaseHemat;

        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = input.nextInt();

        // Input frekuensi wudhu
        System.out.print("Masukkan jumlah wudhu dalam sehari: ");
        frekuensiWudhu = input.nextInt();

        // Input air per wudhu
        System.out.print("Masukkan jumlah air per wudhu (liter): ");
        airPerWudhu = input.nextDouble();

        // Menghitung total air
        totalAir = jumlahMahasiswa * frekuensiWudhu * airPerWudhu;

        // Input persentase hemat
        System.out.print("Berapa persentase air yang dihemat? ");
        persentaseHemat = input.nextDouble();

        // Menghitung total air yang dihemat
        totalAirHemat = totalAir * (persentaseHemat / 100);

        // Menghitung kebutuhan air setelah penghematan
        kebutuhanSetelahHemat = totalAir - totalAirHemat;

        System.out.println("Total air dalam sehari: " + totalAir + " liter");
        System.out.println("Total air yang dihemat: " + totalAirHemat + " liter");
        System.out.println("Kebutuhan air setelah penghematan: "
                + kebutuhanSetelahHemat + " liter");

        input.close();
    }
}
