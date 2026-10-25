
package subcpmk12;

 import java.util.Scanner;

public class case2SistemParkir {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Jenis kendaraan (motor/mobil): ");
        String jenisVeh = input.next();
        
        System.out.print("Lama parkir (jam): ");
        int lama = input.nextInt();
        
        int tarifAwal = 0;
        int tarifTambahan = 0;
        
        if (jenisVeh.equalsIgnoreCase("motor")) {
            tarifAwal = 2000;
            tarifTambahan = 1000;
        } else if (jenisVeh.equalsIgnoreCase("mobil")) {
            tarifAwal = 5000;
            tarifTambahan = 2000;
        }
        
        int totalBiaya = tarifAwal + (lama - 1) * tarifTambahan;
        System.out.println("Total biaya parkir = " + totalBiaya);
    }
}
